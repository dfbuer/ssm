package com.buer.ssm.pojo;

public class Person {

    private Integer id;

    private String name;

    private String gender;

    private Integer age;

    private String college;

    private String major;

    private String hobby;

    private String remarks;

    private String grade;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", major='" + major + '\'' +
                ", hobby='" + hobby + '\'' +
                ", remarks='" + remarks + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Person(Integer id, String name, String gender, Integer age, String college, String major, String hobby, String remarks, String grade) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.college = college;
        this.major = major;
        this.hobby = hobby;
        this.remarks = remarks;
        this.grade = grade;
    }

    public Person() {
    }
}
