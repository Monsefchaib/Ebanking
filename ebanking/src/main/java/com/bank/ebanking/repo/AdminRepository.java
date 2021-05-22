package com.bank.ebanking.repo;

import com.bank.ebanking.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Long> {

        Optional<Admin> findByCin(String cin);

        Admin findByUsername(String username);
}
