package perfume_pins;

import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity
public class User  {

    private String firstName;
    private String lastName;
    private String gender;
    private String userName;
    private String userPassword;
    private String userEmail;
    private String userId;
    private ArrayList userPins;

    //Setters

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setGender(String gender) { this.gender = gender; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword; }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserPins(ArrayList userPins) {
        this.userPins = userPins;
    }



    //Getters

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getGender() { return gender; }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public ArrayList getUserPins() {
        return userPins;
    }
}
