package com.example.java.datos.Services;

import com.example.java.datos.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductosRepository productosRepository;

}
