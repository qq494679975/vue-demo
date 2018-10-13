package com.cwd.vo;

import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * Created by chenweida on 2018/1/18.
 */

@ApiModel(description = "测试swagger生成")
public class DemoList {


    List<Demo> demos;

    public List<Demo> getDemos() {
        return demos;
    }

    public void setDemos(List<Demo> demos) {
        this.demos = demos;
    }
}
