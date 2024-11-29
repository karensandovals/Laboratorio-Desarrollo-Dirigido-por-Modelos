package co.edu.unicauca.swii.api_rest_articulo.capaAccesoADatos.models;

import com.github.manosbatsis.scrudbeans.api.annotation.model.ScrudBean;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@ScrudBean
@Entity
@Getter
@Setter
@AllArgsConstructor
public class ArticuloEntity {
    /* Atributos de la clase Articulo */
    private int idArticulo;
    private String nombreArticulo;
    private String autores;
    private int cantidadAutores;
    private String revista;

    /* Constructor por defecto */
    public ArticuloEntity() {

    }
}
