package com.forteach.external.service.impl;

import cn.hutool.core.util.StrUtil;
import com.forteach.external.jgravatar.Gravatar;
import com.forteach.external.jgravatar.GravatarDefaultImage;
import com.forteach.external.oracle.dto.IStudentDto;
import com.forteach.external.oracle.repository.ZhxyXsxxRepository;
import com.forteach.external.redis.pojo.Student;
import com.forteach.external.redis.pojo.StudentBuilder;
import com.forteach.external.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.HashMap;
import static com.forteach.external.common.Dic.STUDENT_ADO;

/**
 * @Auther: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 19-1-7 09:45
 * @Version: 1.0
 * @Description:
 */
@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    private static final Gravatar gravatar;

    /**
     * 初始化用户图像设置信息
     */
    static  {
        gravatar = new Gravatar();
        gravatar.setSize(100);
        gravatar.setDefaultImage(GravatarDefaultImage.IDENTICON);
    }

    @Resource
    private HashOperations<String, String, String> hashOperations;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private ZhxyXsxxRepository zhxyXsxxRepository;

    @Override
    public void saveAll() {
        zhxyXsxxRepository.findAllRedisDto()
                .parallelStream()
                .filter(iStudentDto -> StrUtil.isNotBlank(iStudentDto.getId()))
                .filter(iStudentDto -> StrUtil.isNotBlank(iStudentDto.getName()))
                .map(this::builderStudent)
                .forEach(this::accept);
    }

    /**
     * 转换对应的redis 需要保存的信息
     * @param iStudentDto
     * @return
     */
    private Student builderStudent(IStudentDto iStudentDto){
        HashMap<String, String> map = new HashMap<>();
        map.put("id", iStudentDto.getId());
        map.put("name", iStudentDto.getName());
        map.put("portrait", this.jGravatart(iStudentDto));
        return StudentBuilder.aStudent()
                .withId(iStudentDto.getId())
                .withKey(STUDENT_ADO + iStudentDto.getId())
                .withMap(map)
                .build();
    }

    /**
     * 生成用户头像
     * @param iStudentDto
     * @return
     */
    private String jGravatart(IStudentDto iStudentDto){
        return gravatar.getUrl(iStudentDto.getId());
    }

    /**
     * 保存到redis数据库中
     * @param student
     */
    private void accept(Student student) {
        hashOperations.putAll(student.getKey(), student.getMap());
    }
}
