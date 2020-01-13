package com.example.dream.bean;

import java.sql.Timestamp;

public class User {

    private String id;  			// 账号

    private String password;  		// 密码

    private String avatar;  		// 头像路径

    private String nickName;  		// 昵称

    private String name;  		    // 姓名

    private int sex;  			    // 性别  1:男/2:女

    private String summary;  		// 简介

    private String qq;  			// qq

    private String tel;             //手机

    private String school;			// 学校

    private String education;  		// 学历

    private String certificate;  	// 资格证书

    private String position;		// 职位

    private Timestamp registerTime;	// 注册时间

    private int status;			    // 用户状态：1:可用/0:不可用

    private int isAdmin;            //管理员  1:是/0:不是

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Timestamp getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Timestamp registerTime) {
        this.registerTime = registerTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", summary='" + summary + '\'' +
                ", qq='" + qq + '\'' +
                ", tel='" + tel + '\'' +
                ", school='" + school + '\'' +
                ", education='" + education + '\'' +
                ", certificate='" + certificate + '\'' +
                ", position='" + position + '\'' +
                ", registerTime=" + registerTime +
                ", status=" + status +
                ", isAdmin=" + isAdmin +
                '}';
    }
}
