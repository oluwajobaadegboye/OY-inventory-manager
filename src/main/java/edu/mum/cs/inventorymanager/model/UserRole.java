package edu.mum.cs.inventorymanager.model;

import java.util.List;

public class UserRole extends User {
    private int roleId;
    private String name;
    private String description;
    private List<String> resources;
}
