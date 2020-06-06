package com.example.mybatisplus.generator.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author fly
 * @since 2020-05-18
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Student implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

      /**
     * 姓名
     */
    private String name;

      /**
     * 生日
     */
      private LocalDate birthday;

      /**
     * 住址
     */
      private Integer address;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

    private Integer version;

    private Integer gender;

    private Integer deleted;


}
