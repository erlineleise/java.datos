package com.example.java.datos.Repository;

import com.example.java.datos.Model.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EstudiantesRepository1 extends JpaRepository<Estudiantes, UUID>, JpaSpecificationExecutor<Estudiantes> {

}

