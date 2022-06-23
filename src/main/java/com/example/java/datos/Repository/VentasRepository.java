package com.example.java.datos.Repository;

import com.example.java.datos.Model.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VentasRepository extends JpaRepository<Ventas, UUID>

{
}