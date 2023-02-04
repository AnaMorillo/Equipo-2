package org.example.modelos;

import java.util.Date;

public class Valoraciones {
    //FALTAN LAS FK
    public String valoracionesCol;
    public Date fecha;
    public int valoracion;

    public Valoraciones() {
    }

    public Valoraciones(String valoracionesCol, Date fecha, int valoracion) {
        this.valoracionesCol = valoracionesCol;
        this.fecha = fecha;
        this.valoracion = valoracion;
    }

    public String getValoracionesCol() {
        return valoracionesCol;
    }

    public void setValoracionesCol(String valoracionesCol) {
        this.valoracionesCol = valoracionesCol;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }
}
