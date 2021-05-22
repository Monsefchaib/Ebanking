package com.bank.ebanking.repo;



import com.bank.ebanking.model.Virement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VirementRepository extends JpaRepository<Virement, Long> {


}
