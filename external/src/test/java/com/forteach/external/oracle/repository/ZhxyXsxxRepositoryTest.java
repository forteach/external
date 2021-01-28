package com.forteach.external.oracle.repository;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;


/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 10:12
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ZhxyXsxxRepositoryTest {
    @Resource
    private ZhxyXsxxRepository zhxyXsxxRepository;

    @Test
    public void findAllRedisDto() {
        zhxyXsxxRepository.findAllRedisDto()
                .stream()
                .parallel()
                .forEach(iStudentDto -> {
                    log.info("id : {}, name : {} \r\n", iStudentDto.getId(), iStudentDto.getName());
                });
    }

}