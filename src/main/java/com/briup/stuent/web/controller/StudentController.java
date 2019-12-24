package com.briup.stuent.web.controller;

import com.briup.stuent.bin.Student;
import com.briup.stuent.util.Message;
import com.briup.stuent.util.MessageUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController//控制器类
@Api(description="学生控制器")
public class StudentController {

    @PostMapping("/add")//如果是新增或者修改-@PostMapping
   @ApiOperation(value = "添加学生")
    public Message add(Student student){
     return MessageUtil.success("添加学生成功");

 }
 @GetMapping("/delete")
 @ApiOperation(value = "删除学生")//方法请求进行说明
 @ApiImplicitParams({
         @ApiImplicitParam(name="stuId",value="学号",paramType = "query",dataType = "int",required = true),
         @ApiImplicitParam(name="name",value = "学生姓名",paramType = "query",dataType = "string")
 })//括号中的参数进行说明
 public Message delete(int stuId,String name){
   return MessageUtil.success("删除学生成功");
 }

}
