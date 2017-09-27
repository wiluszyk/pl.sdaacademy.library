package pl.sdaacademy.library.pl.sdaacademy.library.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import java.util.Set;

@Entity
@Table(name = "owners")
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "surname")
    @NotEmpty
    private String surname;

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

    private Set<Book> books;

}
