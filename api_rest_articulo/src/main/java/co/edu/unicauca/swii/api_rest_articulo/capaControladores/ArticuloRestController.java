package co.edu.unicauca.swii.api_rest_articulo.capaControladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.swii.api_rest_articulo.fachadaServices.DTO.ArticuloDTO;
import co.edu.unicauca.swii.api_rest_articulo.fachadaServices.services.IArticuloService;

@RestController
@RequestMapping("/api")
public class ArticuloRestController {
    @Autowired
	private IArticuloService articuloService;

    /*Recibe articulo a registrar y retorna el articulo registrado*/
    @PostMapping("/articulos")
	public ArticuloDTO crearArticulo(@RequestBody ArticuloDTO articulo) {
		ArticuloDTO objArticulo = null;
		objArticulo = articuloService.save(articulo);
		return objArticulo;
	}

    /*Recibe ID de articulo y retorna el articulo que corresponde al ID*/
    @GetMapping("/articulos/{id}")
	public ArticuloDTO consultarArticulo(@PathVariable Integer id) {
		ArticuloDTO objArticulo = null;
		objArticulo = articuloService.findById(id);
		return objArticulo;
	}

    /*retorna una lista de articulos registrados*/
	@GetMapping("/articulos")
	public List<ArticuloDTO> listarArticulo() {
		return articuloService.findAll();
	}

    /*recibe el ID del articulo a actualizar y los nuevos datos, y retorna articulo actualizado*/
    @PutMapping("/articulos/{id}")
	public ArticuloDTO actualizarArticulo(@RequestBody ArticuloDTO articulo, @PathVariable Integer id) {
		ArticuloDTO objArticulo = null;
		ArticuloDTO articuloActual = articuloService.findById(id);
		if (articuloActual != null) {
			objArticulo = articuloService.update(id, articulo);
		}
		return objArticulo;
	}

    /*recibe ID del articulo a eliminar y retorna true o false si se elimino*/
	@DeleteMapping("/articulos/{id}")
	public Boolean eliminarArticulo(@PathVariable Integer id) {
		Boolean bandera = false;
		ArticuloDTO articuloActual = articuloService.findById(id);
		if (articuloActual != null) {
			bandera = articuloService.delete(id);
		}
		return bandera;
	}

    /*recibe el ID del articulo y retorna true o false si existe*/
    @GetMapping("/existe")
    public Boolean existeArticulo(@RequestParam Integer id)
    {
        Boolean bandera = articuloService.existsById(id);
        return bandera;
    }
	
}
