package ru.podlubnyy.hlmnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.podlubnyy.hlmnt.model.Client;

/**
 * Created by Alexey Podlubnyy on 20.08.2021
 */
public interface ClientRepository extends JpaRepository<Client, Long> {
}
