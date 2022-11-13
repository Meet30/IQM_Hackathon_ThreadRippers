package com.IQMhackathon.IQMhackathon.Admin;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_table")
public class Admin {
    @Id
    @Column(name = "adminname")
    private String adminname;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public Admin(){}

    public Admin(String adminname, String email, String password) {
        this.adminname = adminname;
        this.email = email;
        this.password = password;
    }

    public String getAdminname() {
        return adminname;
    }

    public void setAdminname(String username) {
        this.adminname = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
