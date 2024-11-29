package co.edu.unicauca.swii.api_rest_articulo.fachadaServices.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter 
@AllArgsConstructor
public class ArticuloDTO {
    /*Atributos de la clase Articulo*/
    private int idArticulo;
    private String nombreArticulo;
    private String autores;
    private int cantidadAutores;
    private String revista;

    /*Constructor por defecto*/
    public ArticuloDTO()
    {

    } 
}
