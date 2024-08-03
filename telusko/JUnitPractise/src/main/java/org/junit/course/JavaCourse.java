package org.junit.course;

public class JavaCourse implements Course{
    public static final String COURSE_NAME = "JAVA";
    private boolean isCoursePurchased;

    @Override
    public boolean purchaseCourse() {
        this.isCoursePurchased = true;
        return true;
    }

    @Override
    public boolean isCoursePurchased() {
        return this.isCoursePurchased;
    }
}
