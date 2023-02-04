package org.example.modelos;

import java.util.Date;

public class Mensajes {
    private int idRemitente;
    private Date fecha;
    private String texto;
    private String privado;

    public Mensajes() {
    }

    public Mensajes(Integer idRemitente, Date fecha, String texto, String privado) {
        this.idRemitente = idRemitente;
        this.fecha = fecha;
        this.texto = texto;
        this.privado = privado;
    }

    public Integer getIdRemitente() {
        return idRemitente;
    }

    public void setIdRemitente(Integer idRemitente) {
        this.idRemitente = idRemitente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getPrivado() {
        return privado;
    }

    public void setPrivado(String privado) {
        this.privado = privado;
    }
}
