package ngomediator.ngomediatorapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "ngo")
public class NGO {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String password;



    private boolean status;

    private Address address;
    private List<Post> posts;
    private List<Event> events;
    private List<Donation> donations;



    public NGO(String name, String phone, String email, String password, boolean status, Address address, List<Post> posts, List<Event> events, List<Donation> donations) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.status = status;
        this.address = address;
        this.posts = posts;
        this.events = events;
        this.donations = donations;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public Address getAddress() {
        return address;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public List<Event> getEvents() {
        return events;
    }

    public List<Donation> getDonations() {
        return donations;
    }
}
