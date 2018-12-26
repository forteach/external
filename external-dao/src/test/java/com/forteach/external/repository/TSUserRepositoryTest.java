package com.forteach.external.repository;

import com.forteach.external.dto.IUserDto;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 18-12-26 14:36
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TSUserRepositoryTest {

    @Autowired
    private TSUserRepository repository;
    @Test
    public void findAllUserDto(){
        List<IUserDto> list = repository.findAllUserDto();
        list.forEach(iUserDto -> {

        });
    }

}