package ro.ProiectISS.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "doctor")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Doctor extends Human
{
    @Column
    private Rol rol;

    public Doctor(String nume, String prenume, Integer CNP, Integer telefon, String adresa, String email, String username, String password, Sex sex, Rol rol)
    {
        super(nume,prenume,CNP,telefon,adresa,email,username,password,sex);
        this.rol = rol;
    }
}