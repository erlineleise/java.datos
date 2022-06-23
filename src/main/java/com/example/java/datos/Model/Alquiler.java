package com.example.java.datos.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "alquiler")
@Data
public class Alquiler {

    @Id
    @Column(name = "id_alquiler")
    @SequenceGenerator(name = "ALQUILER_ID_ALQUILER", sequenceName = "alquiler_id_alquiler_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ALQUILER_ID_ALQUILER")
    private Integer IdAlquiler;

    @Column(name = "fecha_inicio")
    private Date fechaInicio;

    @Column(name = "fecha_final")
    private Date fechaFinal;

    private double precio;

    private boolean estado;


    @Column(name = "id_cliente")
    private Integer idCliente;
}

