package ru.podlubnyy.hlmnt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.podlubnyy.hlmnt.model.Client;
import ru.podlubnyy.hlmnt.service.ClientService;

import java.util.List;

/**
 * Created by Alexey Podlubnyy on 20.08.2021
 */
@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("/clients")
    public String findAll(Model model) {
        List<Client> clients = clientService.findAll();
        model.addAttribute("clients", clients);
        return "clients";
    }

    @GetMapping("/client-create")
    public String createClientForm(Client client) {
        return "client-create";
    }

    @PostMapping("client-create")
    public String createClient(Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

    @GetMapping("/client-delete/{password}")
    public String deleteClient(@PathVariable("password") Long password) {
        clientService.deleteById(password);
        return "redirect:/clients";
    }

    @GetMapping("/client-update/{password}")
    public String updateClientForm(@PathVariable("password") Long password, Model model) {
        Client client = clientService.findByPassword(password);
        model.addAttribute("client", client);
        return "client-update";
    }

    @PostMapping("/client-update")
    public String updateClient(Client client) {
        clientService.saveClient(client);
        return "redirect:/clients";
    }

}
