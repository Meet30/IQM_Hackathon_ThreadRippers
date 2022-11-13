package com.IQMhackathon.IQMhackathon.City;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.lang.reflect.Array;
import java.util.*;


@RestController
public class AlgorithmService {

    public AlgorithmService() {
    }

    public class Pair{
        int x;
        int y;

        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    @Autowired
    private Nodal_PointService nodal_pointService;

    @Autowired
    private RoadService roadService;

    @Autowired
    private StudentService studentService;

    void DFS(int src, ArrayList <Integer> adj[], int dist[], int level){
        dist[src] = level;
        for(int i: adj[src]){
            if(dist[i] != -1) continue;
            DFS(i,adj,dist,level+1);
        }
    }

    ArrayList<ArrayList<String>> getRoute(){

        System.out.println("Reached here");

        List <Nodal_Point> nodes = nodal_pointService.getAllPoints();
        List <Road> edges = roadService.getAllRoad();
        List <Student> students = studentService.getAllStudent();


        HashMap <String,Integer> mapping = new HashMap<>();
        HashMap <Integer,String> Revmapping = new HashMap<>();
        for(int i = 0; i < nodes.size(); i++){
            String point_name = nodes.get(i).getPointName();
            mapping.put(point_name,i);
            Revmapping.put(i,point_name);
        }

        HashMap <Integer,Integer> freq = new HashMap<>();
        for(int i = 0; i < students.size(); i++){
            int point_name = mapping.get(students.get(i).getNodalPoint());
            if(freq.containsKey(point_name)){
                freq.put(point_name, 1 + freq.get(point_name));
            }
            else{
                freq.put(point_name,1);
            }
        }

        ArrayList <Integer> adj[] = new ArrayList[nodes.size()+1];

        for(int i=0;i<=nodes.size();i++) {
            adj[i] = new ArrayList<>();
        }
        for(int i = 0; i < edges.size(); i++){
            int src = mapping.get(edges.get(i).getSrc());
            int des = mapping.get(edges.get(i).getDes());

            adj[src].add(des);
            adj[des].add(src);
        }


        int dist[] = new int[nodes.size()];
        Arrays.fill(dist,-1);
        DFS(0,adj,dist,0);

        Pair dist2[] = new Pair[nodes.size()];
        for(int i = 0; i < nodes.size(); i++){
            dist2[i] = new Pair(dist[i], i);
        }

        PriorityQueue <Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return (int)(o2.x - o1.x);
            }
        });

        for(int i = 1; i < dist2.length; i++){
            if(freq.containsKey(i)) {
                pq.add(dist2[i]);
            }

        }

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        boolean visited[] = new boolean[nodes.size()];

        ArrayList <Integer> temp = new ArrayList<>();
        while(pq.size() > 0){
            int bus_capacity = 2;
            while(pq.size() > 0 && visited[(int)pq.peek().y] == true){
                pq.poll();
            }
            if(pq.size() == 0) {
                break;
            }
            Pair p = pq.poll();
            visited[(int)p.y] = true;
            Queue <Integer> q = new LinkedList<>();
            q.add((int)p.y);
            while(!q.isEmpty() && bus_capacity > 0){
                int c = q.poll();
                visited[c] = true;
                if(c == 0){
                    break;
                }
                if(freq.containsKey(c)){
                    temp.add(c);
                }
                for(int i: adj[c]){
                    if(!visited[i]){
                        q.add(i);
                    }
                }
                if(freq.get(c) > bus_capacity){
                    pq.add(new Pair(dist[c],c));
                    visited[c] = false;
                    freq.put(c,freq.get(c) - bus_capacity);
                    bus_capacity = 0;
                }
                else {
                    bus_capacity -= freq.get(c);
                }
            }
            temp.add(0);
            ans.add(new ArrayList<>(temp));
            temp.clear();
        }


        ArrayList <ArrayList<String>> retAns = new ArrayList <> ();

        for(int i=0;i<ans.size();i++) {
            ArrayList <String> ttt = new ArrayList<>();
            for(int j=0;j<ans.get(i).size();j++) {
                ttt.add(Revmapping.get(ans.get(i).get(j)));
            }
            retAns.add(ttt);
        }

        return retAns;
    }
}
