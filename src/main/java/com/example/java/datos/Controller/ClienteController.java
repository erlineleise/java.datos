package com.example.java.datos.Controller;

import com.example.java.datos.Model.Cliente;
import com.example.java.datos.Services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "/api/b1/cliente", produces = "application/json")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    public ResponseEntity<?> findAll(){
        HashMap<String, Object> result = new HashMap<>();

        List<Cliente> cliente = clienteService.findAll();

        result.put("correcto", true);
        result.put("clientes", cliente);

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
