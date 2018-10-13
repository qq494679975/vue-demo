package com.cwd.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by chenweida on 2018/1/18.
 */

@ApiModel(description = "测试swagger生成")
public class Demo {

    @ApiModelProperty("姓名")
    private String name = "cwd";

    @ApiModelProperty("年龄")
    private Integer age;

    @ApiModelProperty(value = "年龄", example = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Demo(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Demo() {
    }

    public Demo(String name, Integer age, Date time) {
        this.name = name;
        this.age = age;
        this.time = time;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
