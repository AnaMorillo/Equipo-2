package org.example.repositorios;

import org.example.modelos.Categoria;
import org.example.utilidades.ServicioJdbcException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaRepoImpl implements Repositorio<Categoria>{
    private Connection conn;

    public CategoriaRepoImpl(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Categoria> listar() {
        // Creamos un alista vacía que es la que se devolverá al final
        List<Categoria> listaCat = new ArrayList<>();

        // El try con recursos (lo que hay dentro del paréntesis) asegura que el recurso -en este caso la conexion- se
        // cierre cuando el try acabe ya sea de forma exitosa o con error.
        try(Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM categorias")) {

            // Recorremos el Resulset con los registros leídos
            while(rs.next()) {  // mientras haya un registro disponible ...

                // Creamos un objeto categoría vacío para cargar los datos del registro activo
                Categoria c = getCategoria(rs);

                // Añadimos la categoría a la lista que hay que devolver
                listaCat.add(c);
            }
        } catch (SQLException e) {
            throw new ServicioJdbcException(e.getMessage(), e.getCause());
        }
        return listaCat;
    }

    private static Categoria getCategoria(ResultSet rs) throws SQLException {
        Categoria c = new Categoria();
        c.setId(rs.getLong("id"));
        c.setNombre(rs.getString("nombre"));
        return c;
    }

    @Override
    public Categoria porId(Long id) {
        Categoria c = null;
        try(PreparedStatement stmt = conn.prepareStatement("SELECT * FROM categorias WHERE id=?")) {
            stmt.setLong(1, id);

            try(ResultSet rs = stmt.executeQuery()) {
                if(rs.next()) {
                    c = getCategoria(rs);
                }
            }
        } catch (SQLException e) {
            throw new ServicioJdbcException(e.getMessage(), e.getCause());
        }
        return c;
    }

    @Override
    public void guardar(Categoria categoria) {

    }

    @Override
    public void borrar(Long id) {

    }
}
