package com.example.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.example.mybatisplus.entity.enums.GenderEnum;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Student {
    @TableId(type = IdType.INPUT)
    private Integer id;
    private String name;
    private LocalDate birthday;

    @TableField(fill = FieldFill.INSERT)            // 自动填充
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;

    @Version                                        // 乐观锁
    private Integer version;

    @TableField("gender")                           // 枚举映射
    private GenderEnum genderEnum;

    @TableLogic                                     // 逻辑删除
    private Integer deleted;

//    // 设置不属于数据库的成员变量
//    @TableField(exist = false)
//    private Object otherField;
//
//    // 设置不查询数据库的成员变量
//    @TableField(select = false)
//    private Object otherField2;
}
