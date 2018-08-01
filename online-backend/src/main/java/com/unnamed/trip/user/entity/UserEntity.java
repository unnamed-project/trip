package com.unnamed.trip.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by flaviu.fildan on 7/27/2018.
 */
@Table(name = "users", schema = "trip")
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid")
    private Integer userId;

    @Column(name = "username")
    private String userName;

    @Column(name = "userpassword")
    private String userPassword;

    @Column(name = "useremail")
    private String userEmail;

    @Column(name = "userpicture")
    private String userPicture;

    @Column(name = "userbirthday")
    private String userBirthday;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId( Integer userId ) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword( String userPassword ) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail( String userEmail ) {
        this.userEmail = userEmail;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture( String userPicture ) {
        this.userPicture = userPicture;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday( String userBirthday ) {
        this.userBirthday = userBirthday;
    }
}
