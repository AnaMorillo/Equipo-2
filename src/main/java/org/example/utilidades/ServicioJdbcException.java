package org.example.utilidades;

public class ServicioJdbcException extends RuntimeException {
    public ServicioJdbcException(String message) {
        super(message);
    }

    public ServicioJdbcException(String message, Throwable cause) {
        super(message, cause);
    }
}

