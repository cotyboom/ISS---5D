package ro.ProiectISS.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.*;
import java.util.List;


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

    @OneToMany(targetEntity = Donator.class, cascade = CascadeType.ALL)
    private List<Formular> listFormular;

    @OneToMany(targetEntity = Analize.class, cascade = CascadeType.ALL)
    private List<Analize> listAnalize;

    public Donator(String nume, String prenume, Integer CNP, Integer telefon, String adresa, String email, String username, String password, Sex sex, Rol rol, List<Formular> listFormular, List<Analize> listAnalize)
    {
        super(nume,prenume,CNP,telefon,adresa,email,username,password,sex);
        this.rol = rol;
        this.listFormular = listFormular;
        this.listAnalize = listAnalize;
    }
}
