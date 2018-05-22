package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.GrupaSangvina;
import ro.ProiectISS.enumerable.RH;
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

    @Column
    private RH rh;
    @Column
    private GrupaSangvina grupa;

    public Donator(String nume, String prenume, String CNP, String telefon, String adresa, String email, String username, String password, Sex sex, Rol rol, RH rh, GrupaSangvina grupa)
    {
        super(nume,prenume,CNP,telefon,adresa,email,username,password,sex);
        this.rol = Rol.DONATOR;
        this.rh = rh;
        this.grupa = grupa;
    }
}

