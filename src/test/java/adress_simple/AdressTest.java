package adress_simple;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

public class AdressTest {

  Adress adress = new Adress("Street", 100, "Industria");
  AdressDTO adressDTOExpected = new AdressDTO("Street", 100, "Industria");

  @Test
  public void testConverter(){
    AdressConverter converter = Mappers.getMapper(AdressConverter.class);

    assertEquals(adressDTOExpected.getName(), converter.addressToAdressDTO(adress).getName());
    assertEquals(adressDTOExpected.getNumber(), converter.addressToAdressDTO(adress).getNumber());
    assertEquals(adressDTOExpected.getStreet(), converter.addressToAdressDTO(adress).getStreet());
  }

}