package com.example.java.datos.Services;

import com.example.java.datos.Model.Cliente;
import com.example.java.datos.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return  (List<Cliente>) clienteRepository.findAll();
    }

}
