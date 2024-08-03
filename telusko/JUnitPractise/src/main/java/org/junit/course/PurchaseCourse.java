package org.junit.course;

import java.util.Objects;

public class PurchaseCourse {
    public Course purchaseCourse(String courseName){
        Course course = null;
        if(courseName == JavaCourse.COURSE_NAME){
            course = new JavaCourse();
            course.purchaseCourse();
        }
        return course;
    }
}
