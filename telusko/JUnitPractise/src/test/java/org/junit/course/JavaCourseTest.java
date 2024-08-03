package org.junit.course;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JavaCourseTest {
    @Test
    void testPurchaseTest(){
        PurchaseCourse purchaseCourse = new PurchaseCourse();
        Course course = purchaseCourse.purchaseCourse(JavaCourse.COURSE_NAME);
        Assertions.assertTrue(course.isCoursePurchased());
    }

    @Test
    void testPurchaseTest_Negative(){
        JavaCourse javaCourse = new JavaCourse();
        Assertions.assertFalse(javaCourse.isCoursePurchased());
    }
}
