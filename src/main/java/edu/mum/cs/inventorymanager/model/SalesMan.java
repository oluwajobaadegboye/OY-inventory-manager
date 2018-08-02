package edu.mum.cs.inventorymanager.model;

import edu.mum.cs.inventorymanager.model.entity.User;

public class Salesman extends Location implements java.io.Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int salesmanId;
	private String staffId;
	private String jobTitle;
	private User user;
	private String locationName;
	private Location location;
}
