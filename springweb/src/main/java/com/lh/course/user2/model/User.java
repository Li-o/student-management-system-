package com.lh.course.user2.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private int userId;
    private String userName;
    private String sex;
    private String birthPlace;
    private String clazz;
    private String userNo;
    private String address;

    public String toStrng(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("id = ");
        stringBuffer.append(userId);
        stringBuffer.append(", name = ");
        stringBuffer.append(userName);
        stringBuffer.append(", sex = ");
        stringBuffer.append(sex);
        stringBuffer.append(", birthplace = ");
        stringBuffer.append(birthPlace);
        stringBuffer.append(", no = ");
        stringBuffer.append(userNo);
        stringBuffer.append(", class = ");
        stringBuffer.append(clazz);
        stringBuffer.append(", address = ");
        stringBuffer.append(address);
        return stringBuffer.toString();

    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
