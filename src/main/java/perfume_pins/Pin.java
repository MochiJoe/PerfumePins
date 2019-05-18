package perfume_pins;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Blob;

@Entity //This tells Hibernate to make a table out of this class.
public class Pin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private Long pinId;
    private String pinName;
    private Integer pinNumber;
    private Blob pinImage;

    //Getters
    public Integer getId() {
        return id;
    }

    public Long getPinId() {
        return pinId;
    }

    public String getPinName() {
        return pinName;
    }

    public Integer getPinNumber() {
        return pinNumber;
    }

    public Blob getPinImage() {
        return pinImage;
    }

    //Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setPinId(Long pinId) {
        this.pinId = pinId;
    }

    public void setPinName(String pinName) {
        this.pinName = pinName;
    }

    public void setPinNumber(Integer pinNumber) {
        this.pinNumber = pinNumber;
    }

    public void setPinImage(Blob pinImage) {
        this.pinImage = pinImage;
    }
}
