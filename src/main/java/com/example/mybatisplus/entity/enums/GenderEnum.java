package com.example.mybatisplus.entity.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;

public enum GenderEnum {
    MALE(1, "男"),
    FEMALE(0, "女");

    @EnumValue
    private Integer code;
    private String gender;

    GenderEnum(Integer code, String gender) {
        this.code = code;
        this.gender = gender;
    }
}
