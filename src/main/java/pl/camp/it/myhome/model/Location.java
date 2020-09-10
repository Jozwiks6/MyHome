package pl.camp.it.myhome.model;

import javax.persistence.*;

@Entity(name = "tlocation")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String postalCode;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String flatNumber;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getPostalCode() { return postalCode; }

    public void setPostalCode(String postalCode) { this.postalCode = postalCode; }

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getFlatNumber() { return flatNumber; }

    public void setFlatNumber(String flatNumber) { this.flatNumber = flatNumber; }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", street='" + street + '\'' +
                ", flatNumber='" + flatNumber + '\'' +
                '}';
    }
}
