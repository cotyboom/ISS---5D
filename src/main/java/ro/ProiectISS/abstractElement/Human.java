package ro.ProiectISS.abstractElement;

import lombok.*;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public abstract class Human
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String nume;

    @Column
    private String prenume;

    @Column
    private String CNP;

    @Column
    private String telefon;

    @Column
    private String adresa;

    @Column
    private String email;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private Sex sex;


    public Human(String nume, String prenume, String CNP, String telefon, String adresa, String email, String username, String password, Sex sex)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.telefon = telefon;
        this.adresa = adresa;
        this.email = email;
        this.username = username;
        this.password = password;
        this.sex = sex;
    }
}
