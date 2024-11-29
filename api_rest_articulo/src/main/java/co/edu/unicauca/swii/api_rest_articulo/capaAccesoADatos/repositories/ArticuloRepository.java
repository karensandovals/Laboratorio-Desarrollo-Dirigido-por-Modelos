package co.edu.unicauca.swii.api_rest_articulo.capaAccesoADatos.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.edu.unicauca.swii.api_rest_articulo.capaAccesoADatos.models.ArticuloEntity;

@Repository
public class ArticuloRepository {
    /*Lista de articulos*/
    private ArrayList<ArticuloEntity> listaDeArticulos;

    /*Constructor*/
    public ArticuloRepository()
    {
        this.listaDeArticulos = new ArrayList<>();
        cargarArticulos();
    }

    /*Registrar articulo*/
    public ArticuloEntity save(ArticuloEntity articulo)
    {
        System.out.println("Invocando a almacenar articulo");
        ArticuloEntity objArticulo = null;
        if(this.listaDeArticulos.add(articulo))
        {
            objArticulo = articulo;
        }
        
        return objArticulo;
    }

    /*Consultar articulo para ver sus detalles*/
    public ArticuloEntity findById(Integer id)
    {
        System.out.println("Invocando a consultar un articulo");
        ArticuloEntity objArticulo = null;

        for(ArticuloEntity articulo : listaDeArticulos)
        {
            if(articulo.getIdArticulo()==id)
            {
                objArticulo = articulo;
                break;
            }
        }
        return objArticulo;
    }

    /*Listar articulos*/
    public List<ArticuloEntity> findAll()
    {
        System.out.println("Invocando a listarArticulos");
        return this.listaDeArticulos;
    }

    /*Actualizar articulo*/
    public ArticuloEntity update(Integer id, ArticuloEntity articulo)
    {
        System.out.println("Invocando a actualizar un articulo");
        ArticuloEntity objArticulo = null;

        for(int i=0; i<this.listaDeArticulos.size(); i++)
        {
            if(this.listaDeArticulos.get(i).getIdArticulo()==id)
            {
                this.listaDeArticulos.set(i, articulo);
                objArticulo = articulo;
                break;
            }
        }

        return objArticulo;
    }

    /*Eliminar articulo*/
    public boolean delete(Integer id)
    {
        System.out.println("Invocando a eliminar un articulo");
        boolean bandera = false;

        for(int i=0; i<this.listaDeArticulos.size(); i++)
        {
            if(this.listaDeArticulos.get(i).getIdArticulo()==id)
            {
                this.listaDeArticulos.remove(i);
                bandera=true;
                break;
            }
        }

        return bandera;
    }

    /*Consultar articulo para establecer si se puede registrar*/
    public boolean existsById(Integer id)
    {
        System.out.println("Invocando a consultar si existe un articulo");
        boolean bandera = false;

        for(ArticuloEntity articulo : listaDeArticulos)
        {
            if(articulo.getIdArticulo()==id)
            {
                bandera = true;
            }
        }

        return bandera;
    }

    /*Almacena articulos de prueba*/
    private void cargarArticulos()
    {
        ArticuloEntity objArticulo1 = new ArticuloEntity(1, "Gestión de Proyectos Ágiles", "Juan Pérez, María Gómez", 2, "Revista de Ingeniería de Software");
        this.listaDeArticulos.add(objArticulo1);
        ArticuloEntity objArticulo2 = new ArticuloEntity(2, "Aplicación de IA en Salud", "Carlos Ramírez, Ana Torres", 2, "Revista de Inteligencia Artificial");
        this.listaDeArticulos.add(objArticulo2);
        ArticuloEntity objArticulo3 = new ArticuloEntity(3, "Seguridad Informática Moderna", "Laura Méndez", 1, "Revista de Ciberseguridad");
        this.listaDeArticulos.add(objArticulo3);
        ArticuloEntity objArticulo4 = new ArticuloEntity(4, "Sistemas Distribuidos", "Roberto Díaz, Luisa Martínez", 2, "Revista de Sistemas y Computación");
        this.listaDeArticulos.add(objArticulo4);
    }
}
