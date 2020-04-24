package com.msr.eduservice.controller;


import com.msr.commonutils.R;
import com.msr.eduservice.entity.subject.OneSubject;
import com.msr.eduservice.service.EduSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * <p>
 * 课程科目 前端控制器
 * </p>
 *
 * @author msr
 * @since 2020-04-23
 */
@Api(description="课程分类管理")
@CrossOrigin
@RestController
@RequestMapping("/eduservice/edu-subject")
public class EduSubjectController {
    @Autowired
    private EduSubjectService subjectService;
    @PostMapping("addSubject")
    @ApiOperation(value = "Excel批量导入")
    public R addSubject(MultipartFile file){
        subjectService.saveSubject(file, subjectService);
        return R.ok();
    }
    @GetMapping("getAllSubject")
    @ApiOperation(value = "课程分类列表")
    public R getAllSubject(){
        List<OneSubject> list = subjectService.getAllOneTwoSubject();
        return R.ok().data("list",list);
    }
}

