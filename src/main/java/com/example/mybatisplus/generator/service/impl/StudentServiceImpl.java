package com.example.mybatisplus.generator.service.impl;

import com.example.mybatisplus.generator.entity.Student;
import com.example.mybatisplus.generator.mapper.StudentMapper;
import com.example.mybatisplus.generator.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fly
 * @since 2020-05-18
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
