package com.ohgiraffers.section04.onetoone.subsection03;

import javax.persistence.*;

@Entity(name = "user_info3")
@Table(name = "tbl_user_info3")
public class UserInfo {

    @Id

    private Long userCode;
    private String nickname;
    private String phone;
    @OneToOne
    @JoinColumn(name = "userCode")
    private User user;

    public UserInfo() {
    }

    public UserInfo(Long userInfoCode, String nickname, String phone, User user) {
        this.userCode = userCode;
        this.nickname = nickname;
        this.phone = phone;
        this.user = user;
    }

    public Long getUserInfoCode() {
        return userCode;
    }

    public void setUserInfoCode(Long userInfoCode) {
        this.userCode = userInfoCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoCode=" + userCode +
                ", nickname='" + nickname + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                '}';
    }
}
