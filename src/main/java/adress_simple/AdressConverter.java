package adress_simple;

import org.mapstruct.Mapper;

@Mapper
public interface AdressConverter {

  AdressDTO addressToAdressDTO(Adress adress);
}
