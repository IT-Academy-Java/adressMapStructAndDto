package address_diferent_names;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

class AddressTest {

  Address address = new Address("Street", 100, "Industria");
  AddressDTO addressDTOExpected = new AddressDTO("Street", 100, "Industria");

  @Test
  public void testConverter(){
    AddressConverter converter = Mappers.getMapper(AddressConverter.class);

    assertEquals(addressDTOExpected.getStreet(), converter.convertAdressToAdressDTO(address).getStreet());
    assertEquals(addressDTOExpected.getNumberOfStreet(), converter.convertAdressToAdressDTO(address).getNumberOfStreet());
    assertEquals(addressDTOExpected.getPersonName(), converter.convertAdressToAdressDTO(address).getPersonName());
  }

}