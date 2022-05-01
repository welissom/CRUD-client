package com.welisson.CRUDClientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.welisson.CRUDClientes.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
