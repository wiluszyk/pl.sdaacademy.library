package pl.sdaacademy.library.pl.sdaacademy.library.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NameEntity extends BaseEntity{

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "surname")
    @NotEmpty
    private String surname;

}
