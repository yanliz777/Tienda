package co.edu.uniquindio.mapas.modelo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter

public class DetalleProducto {
    private String codigoProducto;
    private float precio;
    private int cantidad;
}
