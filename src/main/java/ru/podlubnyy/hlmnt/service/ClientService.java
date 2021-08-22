package ru.podlubnyy.hlmnt.service;

import org.springframework.stereotype.Service;
import ru.podlubnyy.hlmnt.model.Client;
import ru.podlubnyy.hlmnt.repository.ClientRepository;

import java.util.List;
import java.util.UUID;

/**
 * Created by Alexey Podlubnyy on 20.08.2021
 */

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client findByPassword(UUID id) {
        return clientRepository.getOne(id);
    }

    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public void deleteById(UUID id) {
        clientRepository.deleteById(id);
    }
}
