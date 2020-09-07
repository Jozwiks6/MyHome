package pl.camp.it.myhome.model;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity(name = "tflat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private Integer square_meters;
    @Column(nullable = false)
    private double overnight_price;
    @Column(nullable = false, length = 300)
    private String description;

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public Integer getSquare_meters() { return square_meters; }

    public void setSquare_meters(Integer square_meters) { this.square_meters = square_meters; }

    public double getOvernight_price() { return overnight_price; }

    public void setOvernight_price(double overnight_price) { this.overnight_price = overnight_price; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", square_meters=" + square_meters +
                ", overnight_price=" + overnight_price +
                ", description='" + description + '\'' +
                '}';
    }
}
