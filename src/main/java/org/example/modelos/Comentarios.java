package org.example.modelos;

import java.util.Date;

public class Comentarios {
    //FALTA LA FK
    private Date id;
    private int idPropietario;
    private String texto;


    public Comentarios() {
    }

    public Comentarios(Date id, Integer idPropietario, String texto) {
        this.id = id;
        this.idPropietario = idPropietario;
        this.texto = texto;
    }

    public Date getId() {
        return id;
    }

    public void setId(Date id) {
        this.id = id;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
