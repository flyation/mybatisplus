package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDate;

/**
 * 用于同时展示学生的address属性中的province
 */
@Data
public class StudentVO {
    @TableId(type = IdType.INPUT)
    private Integer id;
    private String name;
    private LocalDate birthday;

    private String provinceName;
}
