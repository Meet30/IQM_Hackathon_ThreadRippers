package com.IQMhackathon.IQMhackathon.City;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class Nodal_PointService {

//    @Autowired
//    private Nodal_PointRepository nodal_pointRepository;

    List<Nodal_Point> pointList = new ArrayList<>();

    public List <Nodal_Point> getAllPoints(){
        List <Nodal_Point> temp = new ArrayList<>(pointList);
        return temp;
    }

    Nodal_PointService(){
//        pointList.add(new Nodal_Point("P1"));
//        pointList.add(new Nodal_Point("P2"));
//        pointList.add(new Nodal_Point("P3"));
//        pointList.add(new Nodal_Point("P4"));
//        pointList.add(new Nodal_Point("P5"));
//        pointList.add(new Nodal_Point("P6"));
    }

    public void addPoint(Nodal_Point nodal_point){
        pointList.add(nodal_point);
//        nodal_pointRepository.add(nodal_point);
    }

    public void deletePoint(String id){
        int index = -1;
        for(int i = 0; i < pointList.size(); i++){
            if(pointList.get(i).getPointName().equals(id)){
                index = i;
                break;
            }
        }

        if(index >= 0) pointList.remove(index);
//        nodal_pointRepository.deleteById(id);
    }
}
