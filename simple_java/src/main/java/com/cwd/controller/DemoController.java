package com.cwd.controller;

import com.cwd.vo.Demo;
import com.cwd.vo.DemoList;
import com.cwd.vo.SimpleResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by chenweida on 2018/1/18.
 */

@Controller
@Api(tags = "测试模块", description = "测试")
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("测试swagger")
    public SimpleResult<Demo> add(
           String name,Integer age) {
        System.out.println(name);
        System.out.println(age);

        return new SimpleResult<Demo>(new Demo());
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("测试swagger")
    public List<Demo> list(
            @ApiParam(name = "username", value = "测试", required = false) @RequestParam(value = "username", required = false) String username) {
        List<Demo> demos = new ArrayList<Demo>();

        for (int i = 0; i < 10; i++) {
            demos.add(new Demo("测试" + i, i, new Date()));
        }

        return demos;
    }

    /**
     * @param request
     * @param demos
     * @return
     * @RequestBody必须是post
     */
    @RequestMapping(value = "/demos", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("测试swagger")
    public SimpleResult<Demo> testSwagger1(
            HttpServletRequest request,
            @RequestBody DemoList demos) {
        request.getParameterMap();
        System.out.println(demos);

        return new SimpleResult<Demo>(new Demo());
    }
}
