package pl.sdaacademy.library.pl.sdaacademy.library.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends NameEntity{

    @Column(name = "voivodeship")
    @NotEmpty
    private String voivodeship;

    @Column(name = "city")
    @NotEmpty
    private String city;

    @Column(name = "email")
    @NotEmpty
    @Email
    private String email;

    @Column(name = "telephone")
    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;

    @Column(name = "role")
    @NotEmpty
    private String role;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private Set<Book> books;


    public String getVoivodeship() {
        return voivodeship;
    }

    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Book> getBooks() {
        if (this.books == null) {
            this.books = new HashSet<>();
        }
        return this.books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }


}
