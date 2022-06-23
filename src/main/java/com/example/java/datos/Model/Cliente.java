package com.example.java.datos.Model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="cliente")
@Getter
@Setter
public class Cliente {

    @Id
    @Column(name = "id_cliente")
    @SequenceGenerator(name = "CLIENTE_ID_CLIENTE", sequenceName = "cliente_id_cliente_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CLIENTE_ID_CLIENTE")
    private Integer idCliente;

    private String nombre;

    private String dni;

    private String apellidos;

    private String genero;

    private boolean estado;

}
