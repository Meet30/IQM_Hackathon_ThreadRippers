package com.IQMhackathon.IQMhackathon.City;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "road_table")
public class Road {

    @Id
    @Column(name = "road_id")
    private int road_id;

    @Column(name = "source")
    private String src;

    @Column(name = "destination")
    private String des;

    Road() {
    }

    public Road(int id, String src, String des) {
        this.road_id = id;
        this.src = src;
        this.des = des;
    }

    public int getRoad_id() {
        return road_id;
    }

    public void setRoad_id(int road_id) {
        this.road_id = road_id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
