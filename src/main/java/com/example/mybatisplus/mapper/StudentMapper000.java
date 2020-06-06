package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mybatisplus.entity.Student;
import com.example.mybatisplus.entity.StudentVO;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 类名后加了000，用于区分自动生成的StudentMapper，否则启动时会报冲突异常
 */
public interface StudentMapper000 extends BaseMapper<Student> {
    @Select("SELECT s.*, a.`province` provinceName FROM student s, address a WHERE s.id = #{id} AND s.`address` = a.`id`")
    List<StudentVO> studentAddress(int id);
}
