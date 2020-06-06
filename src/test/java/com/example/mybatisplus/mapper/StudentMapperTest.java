//package com.example.mybatisplus.mapper;
//
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.example.mybatisplus.entity.Student;
//import com.example.mybatisplus.entity.StudentVO;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import java.util.List;
//
//@SpringBootTest
//class StudentMapperTest {
//    @Autowired
//    private StudentMapper000 studentMapper;
//
//    @Test
//    public void findAll() {
//        List<Student> students = studentMapper.selectList(null);
//        students.forEach(System.out::println);
//    }
//
//    @Test
//    public void insert() {
//        Student student = new Student();
//        student.setName("uuu");
//        studentMapper.insert(student);
//    }
//
//    @Test
//    public void update() {
//        Student student = studentMapper.selectById(9);
//        student.setName("ddd");
//        studentMapper.updateById(student);
//    }
//
//    @Test
//    public void optimisticLocker() {
//        Student student1 = studentMapper.selectById(6); // version = 1
//        student1.setName("v1");
//
//        Student student2 = studentMapper.selectById(6); // version = 1
//        student2.setName("v2");
//
//        studentMapper.updateById(student1);             // 执行后数据库version已经变成2
//        studentMapper.updateById(student2);             // 此时version已不匹配
//    }
//
//    @Test
//    public void delete() {
//        studentMapper.deleteById(3);
//    }
//
//
//    @Test
//    public void like() {
//        QueryWrapper<Student> wrapper = new QueryWrapper<>();
//        wrapper.like("name", "小");
//        studentMapper.selectList(wrapper);
//    }
//
//    @Test
//    public void page() {
//        Page<Student> studentPage = studentMapper.selectPage(new Page<Student>(2, 4), null);
//        System.out.println(studentPage.getTotal());
//        studentPage.getRecords().forEach(System.out::println);
//    }
//
//    @Test
//    public void multiTable() {
//        List<StudentVO> studentVOS = studentMapper.studentAddress(3);
//        studentVOS.forEach(System.out::println);
//    }
//}