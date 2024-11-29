package co.edu.unicauca.swii.api_rest_articulo.fachadaServices.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.stereotype.Service;

import co.edu.unicauca.swii.api_rest_articulo.capaAccesoADatos.models.ArticuloEntity;
import co.edu.unicauca.swii.api_rest_articulo.capaAccesoADatos.repositories.ArticuloRepository;
import co.edu.unicauca.swii.api_rest_articulo.fachadaServices.DTO.ArticuloDTO;

@Service
public class ArticuloServiceImpl implements IArticuloService {
    
    private ArticuloRepository servicioAccesoBaseDatos;

    private ModelMapper modelMapper;

    public ArticuloServiceImpl(ArticuloRepository servicioAccesoBaseDatos, ModelMapper modelMapper) {
		this.servicioAccesoBaseDatos = servicioAccesoBaseDatos;
		this.modelMapper = modelMapper;
	}
    
    @Override
    public List<ArticuloDTO> findAll() {
        List<ArticuloEntity> articulosEntity = this.servicioAccesoBaseDatos.findAll();
        List<ArticuloDTO> articulosDTO = this.modelMapper.map(articulosEntity, new TypeToken<List<ArticuloDTO>>(){}.getType());
        return articulosDTO;
    }

    @Override
    public ArticuloDTO findById(Integer id) {
        ArticuloEntity objArticuloEntity = this.servicioAccesoBaseDatos.findById(id);
		ArticuloDTO articuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
		return articuloDTO;
    }

    @Override
    public boolean existsById(Integer id) {
        return this.servicioAccesoBaseDatos.existsById(id);
    }

    @Override
    public ArticuloDTO save(ArticuloDTO articulo) {
        ArticuloEntity articuloEntity = this.modelMapper.map(articulo, ArticuloEntity.class);
		ArticuloEntity objArticuloEntity = this.servicioAccesoBaseDatos.save(articuloEntity);
		ArticuloDTO articuloDTO = this.modelMapper.map(objArticuloEntity, ArticuloDTO.class);
		return articuloDTO;
    }

    @Override
    public ArticuloDTO update(Integer id, ArticuloDTO articulo) {
        ArticuloEntity articuloEntity = this.modelMapper.map(articulo, ArticuloEntity.class);
		ArticuloEntity articuloEntityActualizado = this.servicioAccesoBaseDatos.update(id, articuloEntity);
		ArticuloDTO articuloDTO = this.modelMapper.map(articuloEntityActualizado, ArticuloDTO.class);
		return articuloDTO;
    }

    @Override
    public boolean delete(Integer id) {
        return this.servicioAccesoBaseDatos.delete(id);
    }
    
}
