package address_diferent_names;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface AddressConverter {

  @Mapping(source = "number", target = "numberOfStreet")
  @Mapping(source = "name", target = "personName")
  AddressDTO convertAdressToAdressDTO(Address address);
}
