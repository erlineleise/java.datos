package com.example.java.datos.Model;



import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Table(name = "producto")
@Data
@Entity
public class Producto {

  @Id
  @Column(name = "id_producto")
  @SequenceGenerator(name = "PRODUCTO_ID_PRODUCTO", sequenceName = "productos_id_producto_seq", allocationSize = 1)
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PRODUCTO_ID_PRODUCTO")
  private Integer idProducto;

  private String codigo;
  private String nombre;
  private boolean estado;

}
