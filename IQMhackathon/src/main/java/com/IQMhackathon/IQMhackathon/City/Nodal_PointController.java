package com.IQMhackathon.IQMhackathon.City;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Nodal_PointController {

    @Autowired
    private Nodal_PointService pointService;

    // GET ALL
    @RequestMapping(method = RequestMethod.GET, value = "/points/")
    public List<Nodal_Point> getAllPoints(){
        return pointService.getAllPoints();
    }

    // POST
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.POST, value = "/points/")
    public void addPoint(@RequestBody Nodal_Point nodal_point){
        pointService.addPoint(nodal_point);
    }

    // DELETE
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.DELETE, value = "/points/{id}")
    public void deletePoint(@PathVariable String id){
        pointService.deletePoint(id);
    }
}
