package address_diferent_names;

public class Address {

  private String street;
  private int number;
  private String name;

  public Address(String street, int number, String name) {
    this.street = street;
    this.number = number;
    this.name = name;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
