package edu.mum.cs.inventorymanager.model.dto;

import edu.mum.cs.inventorymanager.model.entity.Location;

import java.util.List;
import java.util.stream.Collectors;

public class LocationDTO {

    private long locationId;
    private String locationName;
    private String address;
    private List<TerminalDTO> terminals;

    public LocationDTO(Location location) {
        locationId = location.getLocationId();
        locationName = location.getLocationName();
        address = location.getAddress();
        terminals = location.getTerminals().stream().map(TerminalDTO::new).collect(Collectors.toList());
    }

    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<TerminalDTO> getTerminals() {
        return terminals;
    }

    public void setTerminals(List<TerminalDTO> terminals) {
        this.terminals = terminals;
    }
}
