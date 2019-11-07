package ngomediator.ngomediatorapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "user")
public class User {


    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String password;
    private Date date_of_birth;

    public User(String name, String phone, String email, String password, Date date_of_birth) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.password = password;
        this.date_of_birth = date_of_birth;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }
}
