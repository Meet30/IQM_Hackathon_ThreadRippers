package com.IQMhackathon.IQMhackathon.City;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoadController {

    @Autowired
    private RoadService roadService;

    static int cnt = 5;

    // GET ALL
    @RequestMapping(method = RequestMethod.GET, value = "/road/")
    public List<Road> getAllRoad(){
        return roadService.getAllRoad();
    }

//    // POST
//    @RequestMapping(method = RequestMethod.POST, value = "/road/")
//    public void addRoad(@RequestBody Road road){
//        roadService.addRoad(road);
//    }

    // POST
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.POST, value = "/road/{nei}")
    public void addRoad(@PathVariable String nei){
        String arr[] = nei.split(",");
        for(int i = 1; i < arr.length; i++){
            Road r = new Road(cnt++,arr[0],arr[i]);
            roadService.addRoad(r);
        }
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/road/{id}")
    public void deletRoad(@PathVariable int id){
        roadService.deleteRoad(id);
    }


}
