package edu.mum.cs.inventorymanager.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tbl_salesman")
public class Salesman {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int salesmanId;
	@NotEmpty(message = "*staffId is required")
	private String staffId;
	@OneToOne
	@JoinColumn(name = "userId")
	@NotNull
	private User user;
	@OneToOne
	@JoinColumn(name = "locationId")
	private Location location;

	public Salesman() {
	}

	public Salesman(String staffId, @NotNull User user, Location location) {
		this.staffId = staffId;
		this.user = user;
		this.location = location;
	}

	public int getSalesmanId() {
		return salesmanId;
	}

	public void setSalesmanId(int salesmanId) {
		this.salesmanId = salesmanId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
}
