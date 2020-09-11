package pl.camp.it.myhome.model;



import org.hibernate.annotations.CollectionId;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;

@Entity(name = "tflat")
public class Flat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private Integer squareMeters;
    @Column(nullable = false)
    private int floor;
    @Column(nullable = false)
    private Boolean parkingField ;
    @Column(nullable = false)
    private Double overnightPrice;
    @Column(nullable = false, length = 200)
    private String description;
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Location location;


    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public Integer getSquareMeters() { return squareMeters; }

    public void setSquareMeters(Integer squareMeters) { this.squareMeters = squareMeters; }

    public int getFloor() { return floor; }

    public void setFloor(int floor) { this.floor = floor; }

    public Boolean getParkingField() { return parkingField; }

    public void setParkingField(Boolean parkingField) { this.parkingField = parkingField; }

    public Double getOvernightPrice() { return overnightPrice; }

    public void setOvernightPrice(Double overnightPrice) { this.overnightPrice = overnightPrice; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    @Override
    public String toString() {
        return "Flat{" +
                "id=" + id +
                ", squareMeters=" + squareMeters +
                ", floor=" + floor +
                ", parkingField=" + parkingField +
                ", overnightPrice=" + overnightPrice +
                ", description='" + description + '\'' +
                ", location=" + location +
                '}';
    }
}
