package ie.com.pr.peliculas.datos;

import ie.com.pr.peliculas.domain.Pelicula;
import ie.com.pr.peliculas.excepciones.*;
import java.util.List;


public interface IAccesoDatos {
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula> Listar(String nombreRecurso) throws LecturaDatosEx;
    
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    String buscar (String nonmbreRecurso, String buscar) throws LecturaDatosEx;
    
    void crear(String nombreRecurso) throws AccesoDatosEx;
    void borrar(String nombreRecurso) throws AccesoDatosEx;
    
}
