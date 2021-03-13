package com.soft.orderserviceapi.controller;

import com.soft.orderserviceapi.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setName("Joao Teste");
        cliente1.setPhone("00 0000-0000");
        cliente1.setEmail("email@emial.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setName("Maria");
        cliente2.setPhone("00 0000-0000");
        cliente2.setEmail("email@emial.com");

        return Arrays.asList(cliente1, cliente2);
    }
}
