package address_diferent_names;

public class AddressDTO {

  private String street;
  private int numberOfStreet;
  private String personName;

  public AddressDTO(String street, int numberOfStreet, String personName) {
    this.street = street;
    this.numberOfStreet = numberOfStreet;
    this.personName = personName;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getNumberOfStreet() {
    return numberOfStreet;
  }

  public void setNumberOfStreet(int numberOfStreet) {
    this.numberOfStreet = numberOfStreet;
  }

  public String getPersonName() {
    return personName;
  }

  public void setPersonName(String personName) {
    this.personName = personName;
  }
}
