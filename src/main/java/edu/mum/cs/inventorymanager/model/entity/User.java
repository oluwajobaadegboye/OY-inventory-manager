package edu.mum.cs.inventorymanager.model.entity;

import edu.mum.cs.inventorymanager.model.security.AppUser;
import edu.mum.cs.inventorymanager.utils.EncrytedPasswordUtils;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "tbl_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userId;
    @NotEmpty(message = "*First Name is required")
    private String firstName;
    @NotEmpty(message = "*Last Name is required")
    private String lastName;
    @NotEmpty(message = "*Mobile is required")
    private String mobile;
    @NotEmpty(message = "*Email is required")
    private String email;
//    @NotEmpty(message = "*Username is required")
//    private String username;
//    @NotEmpty(message = "*Password is required")
//    private String password;
    private String userType;
    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private AppUser appUser;


    public User(){}

    public User(@NotEmpty(message = "*First Name is required") String firstName, @NotEmpty(message = "*Last Name is required") String lastName, @NotEmpty(message = "*Mobile is required") String mobile, @NotEmpty(message = "*Email is required") String email, @NotEmpty(message = "*UserName is required") String userName, @NotEmpty(message = "*Password is required") String password, String userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.appUser.setUserName(userName);
        this.appUser.setEncrytedPassword(EncrytedPasswordUtils.encrytePassword(password));
        this.userType = userType;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
