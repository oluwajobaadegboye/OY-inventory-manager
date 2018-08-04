package edu.mum.cs.inventorymanager.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
@Table(name = "tbl_location",
        uniqueConstraints={
                @UniqueConstraint(columnNames = {"merchantId", "locationName"})
        })
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int locationId;
    @NotEmpty(message = "*Location Name is required")
    private String locationName;
    @OneToOne
    @JoinColumn(name = "merchantId")
    private Merchant merchant;
    @NotEmpty(message = "*address is required")
    private String address;

}
