package com.example.dream.controller;

import com.example.dream.bean.User;
import com.example.dream.service.UserService;
import com.example.dream.utils.DreamUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Api(tags = "后台管理模块")
@Controller
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    UserService userService;

    /**
     * @ApiIgnore 使用该注解忽略这个API，不会生成接口文档。可注解在类和方法上
     */
    @ApiOperation(value = "首页", notes = "默认页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }

    @ApiOperation(value = "系统登录页", notes = "到达系统登录页")
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @ApiOperation(value = "登录", notes = "登录接口")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户的唯一标识（账号）", required = true, dataType = "String", paramType = "path"),
            @ApiImplicitParam(name = "password", value = "用户密码", required = true, dataType = "String", paramType = "path")
    })
    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    public String userLogin(@RequestParam("id") String id, @RequestParam("password")String password){
        User user = userService.getInfoByIdAndPsd(DreamUtils.StringNullDef(id,""), DreamUtils.StringNullDef(password,""));
        if(user !=null){
            return "success";
        }else{
            return "error";
        }
    }


}
