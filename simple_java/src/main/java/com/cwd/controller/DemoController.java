package com.cwd.controller;

import demo.cwd.mvc.vo.Demo;
import demo.cwd.mvc.vo.DemoList;
import demo.cwd.mvc.vo.SimpleResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenweida on 2018/1/18.
 */

@Controller
@Api(tags = "测试模块", description = "测试")
@RequestMapping(value = "/demo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class DemoController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation("测试swagger")
    public SimpleResult<Demo> testSwagger(
            @ApiParam(name = "username", value = "测试", required = true) @RequestParam(value = "username") String username) {


        return new SimpleResult<>(new Demo());
    }

    /**
     * @RequestBody必须是post
     * @param request
     * @param demos
     * @return
     */
    @RequestMapping(value = "/demos", method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation("测试swagger")
    public SimpleResult<Demo> testSwagger1(
            HttpServletRequest request,
            @RequestBody DemoList demos) {
        request.getParameterMap();
        System.out.println(demos);

        return new SimpleResult<>(new Demo());
    }
}
