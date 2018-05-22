package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.abstractElement.Human;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "donator")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Donator extends Human
{

    @Column
    private String rh;
    @Column
    private String grupa;

    public Donator(String nume, String prenume, String CNP, String telefon, String adresa, String email, String password, String sex, String rh, String grupa)
    {
        super(nume,prenume,CNP,telefon,adresa,email,password,sex);
        this.rh = rh;
        this.grupa = grupa;
    }
}

