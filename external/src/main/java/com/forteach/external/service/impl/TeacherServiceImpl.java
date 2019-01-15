package com.forteach.external.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.common.Dic;
import com.forteach.external.mysql.domain.Teacher;
import com.forteach.external.mysql.domain.TeacherBuilder;
import com.forteach.external.mysql.repository.TeacherRepository;
import com.forteach.external.oracle.dto.ITeacherDto;
import com.forteach.external.oracle.entity.ZhxyJsxxEntity;
import com.forteach.external.oracle.repository.ZhxyJzgxxRepository;
import com.forteach.external.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    @Override
    public List<ITeacherDto> findAllDto() {
        return zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAll(){
        List<Teacher> list = new ArrayList<>();
        zhxyJzgxxRepository.findAllByDto(ISVALIDATED_Y)
                .parallelStream()
                .filter(iTeacherDto -> StrUtil.isNotBlank(iTeacherDto.getTeacherId()))
                .forEach(iTeacherDto -> {
                    list.add(Teacher.builder()
                            .teacherId(StrUtil.isNotBlank(iTeacherDto.getTeacherId()) ? iTeacherDto.getTeacherId() : IdUtil.fastSimpleUUID())
                            .teacherName(iTeacherDto.getTeacherName())
                            .teacherCode(iTeacherDto.getTeacherCode())
                            .build());
        });
        teacherRepository.saveAll(list);
    }

    /**
     * 执行定时任务需要保存的最近两天修改的信息
     * 修改最近教师信息
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public void saveAllByTimestamp(){
        List<Teacher> list = new ArrayList<>();
        zhxyJzgxxRepository.findAllByDtoByTimestamp(DateUtil.offsetDay(new Date(), -2).toTimestamp())
                .parallelStream()
                .filter(iTeacherDto -> StrUtil.isNotBlank(iTeacherDto.getTeacherId()))
                .forEach(iTeacherDto -> {
                    list.add(TeacherBuilder.aTeacher()
                            .withTeacherId(iTeacherDto.getTeacherId())
                            .withTeacherName(iTeacherDto.getTeacherName())
                            .withTeacherCode(iTeacherDto.getTeacherCode())
                            .withIsValidated(ISVALIDATED_Y.equals(iTeacherDto.getIsValidated()) ? ISVALIDATED_0 : ISVALIDATED_1)
                            .build());
                });
        teacherRepository.saveAll(list);
    }

}
