package com.example.java.datos.Model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.UUID;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table (name="tbaEstudiantes")
public class  Estudiantes {
@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "IdEstudiante")
    private UUID id ;
       @Column (name  = "cli_ope_nom")
private String nombre;
private String Apellidos;
private  String Telefono;




}
