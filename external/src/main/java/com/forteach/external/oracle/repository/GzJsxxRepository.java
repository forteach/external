package com.forteach.external.oracle.repository;

import com.forteach.external.oracle.entity.GzJsxxEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: zhangyy
 * @Email: zhang10092009@hotmail.com
 * @Date: 2020/8/26 17:23
 * @Version: v1.0
 * @Modified：教师对应的教研室信息
 * @Description:
 */
public interface GzJsxxRepository extends JpaRepository<GzJsxxEntity, String> {
    /**
     * 查询教研室对应的教师信息
     *
     * @param jysbh
     * @return
     */
    List<GzJsxxEntity> findAllByJysbh(String jysbh);
}