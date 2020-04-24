package com.msr.eduservice.service;

import com.msr.eduservice.entity.EduCourse;
import com.baomidou.mybatisplus.extension.service.IService;
import com.msr.eduservice.entity.vo.CourseInfoForm;

/**
 * <p>
 * 课程 服务类
 * </p>
 *
 * @author msr
 * @since 2020-04-24
 */
public interface EduCourseService extends IService<EduCourse> {
    String saveCourseInfo(CourseInfoForm courseInfoForm);
}
