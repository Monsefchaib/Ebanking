package com.bank.ebanking.service;

import com.bank.ebanking.model.Admin;
import com.bank.ebanking.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminServices {

    @Autowired
    AdminRepository rep;

    public void addAdmin(Admin admin){
        rep.save(admin);
    }


    public List<Admin> getAdmins(Long id){
//      List<Admin> admins = new ArrayList<Admin>();
      return rep.findAll();
    }

    public Optional<Admin> findByCin(String cin){
        return rep.findByCin(cin);
    }

    public Admin getByUsername(String username){
     Admin admin = rep.findByUsername(username);
        return admin;
    }
}
