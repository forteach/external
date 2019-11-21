package com.forteach.external.service.impl;

import cn.hutool.core.util.StrUtil;
import com.forteach.external.mongodb.domain.ClassesInfo;
import com.forteach.external.mysql.domain.Classes;
import com.forteach.external.mysql.repository.ClassesRepository;
import com.forteach.external.oracle.repository.GzBjxxbRepository;
import com.forteach.external.service.ClassesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-4 16:12
 * @Version: 1.0
 * @Description:
 */
@Service
@Slf4j
public class ClassesServerImpl implements ClassesService {
    @Resource
    private GzBjxxbRepository gzBjxxbRepository;
    @Resource
    private ClassesRepository classesRepository;
    @Resource
    private MongoTemplate mongoTemplate;
//    @Override
//    public List<IClassesDto> findAllDto() {
//        return gzBjxxbRepository.findAllDto();
//    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveAll() {
        List<Classes> list = new ArrayList<>();
        List<ClassesInfo> classesInfos = new ArrayList<>();
        gzBjxxbRepository.findAllDto()
                .parallelStream()
                .filter(Objects::nonNull)
                .filter(iClassesDto -> StrUtil.isNotBlank(iClassesDto.getClassId()) && StrUtil.isNotBlank(iClassesDto.getClassName()))
                .forEach(iClassesDto -> {
                    list.add(Classes.builder()
                            .classId(iClassesDto.getClassId())
                            .className(iClassesDto.getClassName())
                            .grade(iClassesDto.getGrade())
                            .build());
                    classesInfos.add(ClassesInfo.builder()
                            .classId(iClassesDto.getClassId())
                            .className(iClassesDto.getClassName())
                            .grade(iClassesDto.getGrade())
                            .build());
                });
        //保存mysql
        if (!list.isEmpty()) {
            classesRepository.saveAll(list);
        }
        //保存mongodb
        if (!classesInfos.isEmpty()) {
            mongoTemplate.dropCollection(ClassesInfo.class);
            mongoTemplate.insertAll(classesInfos);
        }
    }
}