package edu.mum.cs.inventorymanager.controller.ui;

import edu.mum.cs.inventorymanager.service.contract.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;


}
