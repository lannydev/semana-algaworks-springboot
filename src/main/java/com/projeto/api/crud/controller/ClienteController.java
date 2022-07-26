package com.projeto.api.crud.controller;

import com.projeto.api.crud.domain.model.Cliente;
import com.projeto.api.crud.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Arrays;
import java.util.List;


@AllArgsConstructor
@RestController
public class ClienteController {



   // @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/")
    public List<Cliente> listar(){
        return clienteRepository.findByNomeContaining("C");

    }
}
