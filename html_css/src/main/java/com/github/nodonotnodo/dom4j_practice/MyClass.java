package com.github.nodonotnodo.dom4j_practice;

public class MyClass {

    private String classID;
    private String school;
    private String institute;
    private String major;
    private String className;
    private String numerOfStudent;

    public MyClass() {
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getNumerOfStudent() {
        return numerOfStudent;
    }

    public void setNumerOfStudent(String numerOfStudent) {
        this.numerOfStudent = numerOfStudent;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "classID='" + classID + '\'' +
                ", school='" + school + '\'' +
                ", institute='" + institute + '\'' +
                ", major='" + major + '\'' +
                ", className='" + className + '\'' +
                ", numerOfStudent='" + numerOfStudent + '\'' +
                '}';
    }
}
