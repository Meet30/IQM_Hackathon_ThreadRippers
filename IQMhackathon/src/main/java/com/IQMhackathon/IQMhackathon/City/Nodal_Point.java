package com.IQMhackathon.IQMhackathon.City;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nodal_points")
public class Nodal_Point {
    @Id
    @Column(name = "point_name")
    private String PointName;

    Nodal_Point(){

    }

    Nodal_Point(String PointName){
        this.PointName = PointName;
    }

    public String getPointName() {
        return PointName;
    }

    public void setPointName(String pointName) {
        PointName = pointName;
    }
}
