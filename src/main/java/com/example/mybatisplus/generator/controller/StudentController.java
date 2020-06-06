package com.example.mybatisplus.generator.controller;


import com.example.mybatisplus.generator.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fly
 * @since 2020-05-18
 */
@Controller
@RequestMapping("/generator/student")
public class StudentController {
    @Autowired
    IStudentService iStudentService;

    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("list", iStudentService.list());
        return modelAndView;
    }
}

