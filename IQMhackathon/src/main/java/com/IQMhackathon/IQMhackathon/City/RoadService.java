package com.IQMhackathon.IQMhackathon.City;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class RoadService {

//    @Autowired
//    private RoadRepository roadRepository;

    List<Road> roadList = new ArrayList<>();

    public List <Road> getAllRoad(){
        return roadList;
    }

    RoadService(){
//        roadList.add(new Road(1,"P1","P2"));
//        roadList.add(new Road(2,"P2","P3"));
//        roadList.add(new Road(3,"P3","P5"));
    }

    public void addRoad(Road road){
        roadList.add(road);
//        roadRepository.save(road);
    }

    public void deleteRoad(int id){
        int index = -1;
        for(int i = 0; i < roadList.size(); i++){
            if(roadList.get(i).getRoad_id() == id){
                index = i;
                break;
            }
        }


        if(index >= 0) roadList.remove(index);
//        roadRepository.deleteById(id);
    }
}
