package com.IQMhackathon.IQMhackathon.Admin;


import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AdminService {

//    @Autowired
//    private AdminRepository adminRepository;

    List <Admin> adminList = new ArrayList<>();

    AdminService(){
        adminList.add(new Admin("admin1","admin1@aii.com","123"));
        adminList.add(new Admin("admin2","admin2@aii.com","456"));
    }

    public List <Admin> getAllAdmin(){
        return adminList;
    }

    public Admin getAdmin(String id){
        for(Admin i: adminList){
            if (i.getAdminname().equals(id)){
                return i;
            }
        }
//        return adminRepository.findById(id).get();
        return adminList.get(0);
    }

    public void addAdmin(Admin admin){
        adminList.add(admin);
//        adminRepository.save(admin);
    }

    public void deleteAdmin(String id) {
        int index = -1;
        for(int i = 0; i < adminList.size(); i++){
            if(adminList.get(i).getAdminname().equals(id)){
                index = i;
                break;
            }
        }
        adminList.remove(index);
//        adminRepository.deleteById(id);
    }
}
