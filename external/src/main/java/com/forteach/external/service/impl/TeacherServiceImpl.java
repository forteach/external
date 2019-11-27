package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mysql.domain.SysUsers;
import com.forteach.external.mysql.domain.builder.TeacherBuilder;
import com.forteach.external.mysql.repository.TeacherRepository;
import com.forteach.external.mysql.repository.UserRepository;
import com.forteach.external.oracle.dto.ITeacherDto;
import com.forteach.external.oracle.repository.ZhxyJzgxxRepository;
import com.forteach.external.service.TeacherService;
import com.forteach.external.util.Md5Util;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static com.forteach.external.common.Dic.*;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 14:26
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service
public class TeacherServiceImpl implements TeacherService {

    @Value("${token.salt}")
    private String salt;
    /**
     * 初始化的用户密码
     */
    @Value("${initialization.password}")
    private String initPassWord;

    @Resource
    private TeacherRepository teacherRepository;

    @Resource
    private ZhxyJzgxxRepository zhxyJzgxxRepository;

//    @Resource
//    private MongoTemplate mongoTemplate;

    @Resource
    private UserRepository userRepository;

    /**
     * 保存查询到的教师信息
     *
     * @return
     */
//    @Override
//    public List<ITeacherDto> findAllDto() {
//        return zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y);
//    }

    @Async
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAll() {
        this.saveTeacher(zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y));
    }

    /**
     * 执行定时任务需要保存的最近两天修改的信息
     * 修改最近教师信息
     */
    @Async
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAllByTimestamp() {
        this.saveTeacher(zhxyJzgxxRepository.findAllByDtoByTimestamp(DateUtil.offsetDay(new Date(), -7).toTimestamp()));
    }

    /**
     * 保存更新查询到的教师信息列表
     *
     * @param iTeacherDtos
     */
    private void saveTeacher(List<ITeacherDto> iTeacherDtos) {
//        ArrayList<Teacher> list = new ArrayList<>();
//        ArrayList<TeacherInfo> teacherInfoList = new ArrayList<>();
        iTeacherDtos.stream()
                .filter(Objects::nonNull)
                .filter(iTeacherDto -> StrUtil.isNotBlank(iTeacherDto.getTeacherId()) &&
                        StrUtil.isNotBlank(iTeacherDto.getTeacherCode()) &&
                        StrUtil.isNotBlank(iTeacherDto.getTeacherName()))
                .forEach(iTeacherDto -> {
                    //mongodb
//                    teacherInfoList.add(TeacherInfo.builder()
//                            .teacherCode(iTeacherDto.getTeacherCode())
//                            .teacherId(iTeacherDto.getTeacherId())
//                            .teacherName(iTeacherDto.getTeacherName())
//                            .phone(iTeacherDto.getPhone())
//                            .build());

                    teacherRepository.save(TeacherBuilder.aTeacher()
                            .withTeacherId(iTeacherDto.getTeacherId())
                            .withTeacherName(iTeacherDto.getTeacherName())
                            .withTeacherCode(iTeacherDto.getTeacherCode())
                            .withPhone(iTeacherDto.getPhone())
                            .withIsValidated(ISVALIDATED_N.equals(iTeacherDto.getIsValidated()) ? ISVALIDATED_1 : ISVALIDATED_0)
                            .build());
                    SysUsers user = userRepository.findById(iTeacherDto.getTeacherCode()).orElseGet(SysUsers::new);
                    if (StrUtil.isBlank(user.getPassWord())) {
                        String passWord = Md5Util.macMD5(initPassWord.concat(salt));
                        user.setPassWord(passWord);
                    }
                    user.setTeacherId(iTeacherDto.getTeacherCode());
                    user.setId(iTeacherDto.getTeacherCode());
                    user.setRegisterPhone(iTeacherDto.getPhone());
                    user.setUserName(iTeacherDto.getTeacherName());
                    userRepository.save(user);
                });
        //保存mongodb
//        if (!teacherInfoList.isEmpty()) {
//            mongoTemplate.dropCollection(TeacherInfo.class);
//            mongoTemplate.insertAll(teacherInfoList);
//        }
    }
}
