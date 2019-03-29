package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mysql.domain.Teacher;
import com.forteach.external.mysql.domain.builder.TeacherBuilder;
import com.forteach.external.mysql.repository.TeacherRepository;
import com.forteach.external.oracle.dto.ITeacherDto;
import com.forteach.external.oracle.repository.ZhxyJzgxxRepository;
import com.forteach.external.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.ArrayList;
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

    @Resource
    private TeacherRepository teacherRepository;

    @Resource
    private ZhxyJzgxxRepository zhxyJzgxxRepository;

    /**
     * 保存查询到的教师信息
     * @return
     */
    @Override
    public List<ITeacherDto> findAllDto() {
        return zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAll(){
        this.saveTeacher(zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y));
    }

    /**
     * 执行定时任务需要保存的最近两天修改的信息
     * 修改最近教师信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAllByTimestamp(){
        this.saveTeacher(zhxyJzgxxRepository.findAllByDtoByTimestamp(DateUtil.offsetDay(new Date(), -3).toTimestamp()));
    }

    /**
     * 保存更新查询到的教师信息列表
     * @param iTeacherDtos
     */
    private void saveTeacher(List<ITeacherDto> iTeacherDtos){
        List<Teacher> list = new ArrayList<>();
        iTeacherDtos.parallelStream()
                .filter(Objects::nonNull)
                .filter(iTeacherDto -> StrUtil.isNotBlank(iTeacherDto.getTeacherId()) &&
                                StrUtil.isNotBlank(iTeacherDto.getTeacherCode()) &&
                                StrUtil.isNotBlank(iTeacherDto.getTeacherName()))
                .forEach(iTeacherDto -> {
                    list.add(TeacherBuilder.aTeacher()
                            .withTeacherId(iTeacherDto.getTeacherId())
                            .withTeacherName(iTeacherDto.getTeacherName())
                            .withTeacherCode(iTeacherDto.getTeacherCode())
                            .withIsValidated(ISVALIDATED_N.equals(iTeacherDto.getIsValidated()) ? ISVALIDATED_1 : ISVALIDATED_0)
                            .build());
                });
        teacherRepository.saveAll(list);
    }
}
