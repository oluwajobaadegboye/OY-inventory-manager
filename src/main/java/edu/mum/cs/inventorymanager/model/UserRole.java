package edu.mum.cs.inventorymanager.model;

import java.util.List;

public class UserRole extends User {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
