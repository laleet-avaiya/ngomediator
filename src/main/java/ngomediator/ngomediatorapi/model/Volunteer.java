package ngomediator.ngomediatorapi.model;

import java.util.Date;

public class Volunteer {
    private String id;
    private String name;
    private String phone;
    private String email;
    private Date date_of_birth;

    public Volunteer(String id, String name, String phone, String email, Date date_of_birth) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
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

    public Date getDate_of_birth() {
        return date_of_birth;
    }
}
