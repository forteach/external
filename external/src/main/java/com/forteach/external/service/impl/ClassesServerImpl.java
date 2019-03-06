package com.forteach.external.service.impl;

import cn.hutool.core.util.IdUtil;
import cn.hutool.core.util.StrUtil;
import com.forteach.external.mysql.domain.Classes;
import com.forteach.external.mysql.repository.ClassesRepository;
import com.forteach.external.oracle.dto.IClassesDto;
import com.forteach.external.oracle.entity.GzBjxxbEntity;
import com.forteach.external.oracle.repository.GzBjxxbRepository;
import com.forteach.external.service.ClassesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

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
    @Override
    public List<IClassesDto> findAllDto() {
        return gzBjxxbRepository.findAllDto();
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void saveAll() {
        List<Classes> list = new ArrayList<>();
        gzBjxxbRepository.findAllDto()
                .parallelStream()
                .filter(iClassesDto -> StrUtil.isNotBlank(iClassesDto.getClassId()) && StrUtil.isNotBlank(iClassesDto.getClassName()))
                .forEach(iClassesDto -> {
                    list.add(Classes.builder()
                            .classId(iClassesDto.getClassId())
                            .className(iClassesDto.getClassName())
                            .build());
                });
        classesRepository.saveAll(list);
    }
}
