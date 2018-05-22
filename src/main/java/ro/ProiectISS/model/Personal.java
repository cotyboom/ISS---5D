package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.abstractElement.Human;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "personal")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Personal extends Human
{

    public Personal(String nume, String prenume, String CNP, String telefon, String adresa, String email,  String password, String sex)
    {
        super(nume,prenume,CNP,telefon,adresa,email,password,sex);

    }
}
