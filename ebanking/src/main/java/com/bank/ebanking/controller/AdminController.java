package com.bank.ebanking.controller;

import com.bank.ebanking.model.Admin;
import com.bank.ebanking.service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class AdminController {

    AdminServices service;

    @Autowired
    public AdminController(AdminServices service) {

        this.service = service;
    }

    @PostMapping("/admins")
    @ResponseStatus(HttpStatus.CREATED)
    public void addAdmin(@RequestBody Admin admin) {
        service.addAdmin(admin);
    }

    @GetMapping("/adminss")
    @ResponseStatus(HttpStatus.OK)
    public List<Admin> getAdmins(@RequestParam(name = "id", required = false) Long id) {
        return service.getAdmins(id);

    }

    @GetMapping("/adminss/{cin}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Admin> getAdminByCin(@PathVariable(name="cin") String cin){
        return service.findByCin(cin);
    }

    @GetMapping("/admin/username/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Admin getByUsername(@PathVariable(name="username") String username)
    {
        return service.getByUsername(username);
    }

}
