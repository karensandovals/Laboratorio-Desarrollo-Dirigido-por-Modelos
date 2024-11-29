package co.edu.unicauca.swii.api_rest_articulo.fachadaServices.services;

import java.util.List;

import co.edu.unicauca.swii.api_rest_articulo.fachadaServices.DTO.ArticuloDTO;

public interface IArticuloService {
    
    public List<ArticuloDTO> findAll();
    public ArticuloDTO findById(Integer id);
    public boolean existsById(Integer id);
    public ArticuloDTO save(ArticuloDTO articulo);
    public ArticuloDTO update(Integer id, ArticuloDTO articulo);
    public boolean delete(Integer id);
}

