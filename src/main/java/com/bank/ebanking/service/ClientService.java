package com.bank.ebanking.service;

import com.bank.ebanking.model.Admin;
import com.bank.ebanking.model.Agence;
import com.bank.ebanking.model.Agent;
import com.bank.ebanking.model.Client;
import com.bank.ebanking.repo.AgenceRepository;
import com.bank.ebanking.repo.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
public class ClientService {
    @Autowired
    AgentService agentService;
    @Autowired
    AgenceService agenceService;
    @Autowired
    ClientRepository clientRepository;

    public void addClient(Client client, String nomAgence, String cin){

        Agence agence = agenceService.getAgenceByNom(nomAgence); //affecter lagence a l'agent
        client.setAgence(agence);
        Agent agent = agentService.getAgentByCin(cin);// affecter l'admin a l'agent
        client.setCreationAgent(agent);
        client.setRole("Client");
        clientRepository.save(client);
    }

}
