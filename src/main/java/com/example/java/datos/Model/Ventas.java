package com.example.java.datos.Model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@Entity
@Table (name ="venta" )
@Data
public class Ventas {
    @Id
    @Column(name = "id_venta")
    @SequenceGenerator(name = "VENTA_ID_VENTA", sequenceName = "venta_id_venta_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VENTA_ID_VENTA")
    private Integer idVenta;

    private Date fecha;

    @Column(name = "id_cliente")
    private Integer idCliente;

    private String observacion;

    private double total;
}
