package co.edu.unicauca.swii.api_rest_articulo.fachadaServices.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapper {
    @Bean
    public ModelMapper modelMapper()
    {
        return new ModelMapper();
    }
}
