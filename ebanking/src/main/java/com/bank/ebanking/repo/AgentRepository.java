package com.bank.ebanking.repo;


import com.bank.ebanking.model.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgentRepository extends JpaRepository<Agent, Long> {
		


}
