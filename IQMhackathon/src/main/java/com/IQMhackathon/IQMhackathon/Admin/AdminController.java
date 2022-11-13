package com.IQMhackathon.IQMhackathon.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;
    // GET ALL
    @RequestMapping(method = RequestMethod.GET, value = "/admin/")
    public List <Admin> getAllAdmin(){
        return adminService.getAllAdmin();
    }

    // GET
    @RequestMapping(method = RequestMethod.GET, value = "/admin/{id}")
    public Admin getAdmin(@PathVariable String id){
        return adminService.getAdmin(id);
    }

    // POST
    @CrossOrigin(maxAge = 3600)
    @RequestMapping(method = RequestMethod.POST, value = "/admin")
    public void addAdmin(@RequestBody Admin admin){
        adminService.addAdmin(admin);
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE, value = "/admin/{id}")
    public void deleteAdmin(@PathVariable String id){
        adminService.deleteAdmin(id);
    }

}