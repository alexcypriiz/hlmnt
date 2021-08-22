package ru.podlubnyy.hlmnt.service;

import org.springframework.stereotype.Service;
import ru.podlubnyy.hlmnt.model.Client;
import ru.podlubnyy.hlmnt.repository.ClientRepository;

import java.util.List;

/**
 * Created by Alexey Podlubnyy on 20.08.2021
 */

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client findByPassword(Long password) {
        return clientRepository.getOne(password);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteById(Long password) {
        clientRepository.deleteById(password);
    }
}
