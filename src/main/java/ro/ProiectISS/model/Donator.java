package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

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
    private Rol rol;

    public Donator(String nume, String prenume, String CNP, Integer telefon, String adresa, String email, String username, String password, Sex sex, Rol rol)
    {
        super(nume,prenume,CNP,telefon,adresa,email,username,password,sex);
        this.rol = Rol.DONATOR;
    }
}
