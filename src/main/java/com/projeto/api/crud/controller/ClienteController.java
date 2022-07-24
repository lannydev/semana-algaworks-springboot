package com.projeto.api.crud.controller;

import com.projeto.api.crud.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @PersistenceContext
    private EntityManager manager;

    @GetMapping("/")
    public List<Cliente> listar(){
        return (List<Cliente>) manager.createQuery("from Cliente", Cliente.class)
                .getResultList();

    }
}
