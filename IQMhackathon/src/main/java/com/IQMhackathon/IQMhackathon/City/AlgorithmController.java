package com.IQMhackathon.IQMhackathon.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AlgorithmController {
    @Autowired
    private AlgorithmService algorithmService;

    // GET
    @RequestMapping(method = RequestMethod.GET, value = "/algorithm/")
    public ArrayList<ArrayList<String>> getRoute(){
        return algorithmService.getRoute();
    }
}
