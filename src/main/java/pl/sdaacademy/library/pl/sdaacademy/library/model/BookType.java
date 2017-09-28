package pl.sdaacademy.library.pl.sdaacademy.library.model;

import org.hibernate.validator.constraints.NotEmpty;
import pl.sdaacademy.library.pl.sdaacademy.library.enums.BookTypeEnum;

import javax.persistence.Column;
public class BookType extends BaseEntity {

    @Column(name = "name")
    @NotEmpty
    private BookTypeEnum bookType;

}
