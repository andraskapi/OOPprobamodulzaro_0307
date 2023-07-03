package address;

public class EmployeeAddress {
    private String country;
    private int postalCode;
    private String street;
    private String floor;

    public EmployeeAddress(String country, int postalCode, String street, String floor) {
        this.country = country;
        this.postalCode = postalCode;
        this.street = street;
        this.floor = floor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "EmployeeAddress{" +
                "country='" + country + '\'' +
                ", postalCode=" + postalCode +
                ", street='" + street + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
