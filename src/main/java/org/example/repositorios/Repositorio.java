package org.example.repositorios;

import java.util.List;

public interface Repositorio <T>{
    List<T> listar();
    T porId(Long id);
    void guardar(T t);
    void borrar(Long id);
}
