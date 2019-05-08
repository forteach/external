package com.forteach.external.oracle.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.Objects;

import static org.junit.Assert.*;

/**
 * @author: zhangyy
 * @email: zhang10092009@hotmail.com
 * @date: 19-4-28 19:14
 * @version: 1.0
 * @description:
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class ZhxyKcxxPkxxRepositoryTest {
    @Resource
    private ZhxyKcxxPkxxRepository zhxyKcxxPkxxRepository;

    @Test
    public void selectAllTest(){
        zhxyKcxxPkxxRepository.findAll()
                .parallelStream()
                .filter(Objects::nonNull)
                .forEach(z -> {
                    System.out.println("z" + z);
                });
//        System.out.println("------------------------------>>>>>>>>>> ");
//        zhxyKcxxPkxxRepository.findCourse()
//                .parallelStream()
//                .filter(Objects::nonNull)
//                .forEach(System.out::println);
    }

}