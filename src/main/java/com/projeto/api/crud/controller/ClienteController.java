package com.projeto.api.crud.controller;

import com.projeto.api.crud.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("Elaine");
        cliente1.setTelefone("71 98510-0546");
        cliente1.setEmail("e.cristina00@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Diego");
        cliente2.setTelefone("71 99146-1740");
        cliente2.setEmail("diegoschneiderssa@gmail.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
