package com.cwd.vo;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Created by chenweida on 2018/1/18.
 */

@ApiModel(description = "测试swagger生成")
public class DemoList {

    private Demo demo;

    private String aa;

    List<Demo> demos;

    public List<Demo> getDemos() {
        return demos;
    }

    public void setDemos(List<Demo> demos) {
        this.demos = demos;
    }

    public Demo getDemo() {
        return demo;
    }

    public void setDemo(Demo demo) {
        this.demo = demo;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }
}
