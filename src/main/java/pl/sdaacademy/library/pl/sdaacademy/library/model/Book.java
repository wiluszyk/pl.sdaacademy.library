package pl.sdaacademy.library.pl.sdaacademy.library.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table(name = "books")
public class Book extends BaseEntity {

    @Column(name = "title")
    @NotEmpty
    private String title;

    @Column(name = "pages")
    @NotEmpty
    @Min(1)
    private Integer pages;

    @Column(name = "isbn")
    @NotEmpty
    @Length(min = 10, max = 13)
    private Integer isbn;

    @Column(name = "rating")
    @Digits(fraction = 0, integer = 10)
    @Min(0)
    @Max(10)
    private Integer rating;

    @Column(name = "isLoan")
    @NotEmpty
    private boolean isLoan;
}
