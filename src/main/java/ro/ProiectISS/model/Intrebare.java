package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.enumerable.RaspunsIntrebare;

import javax.persistence.*;


@Entity
@Table(name = "intrebare")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Intrebare
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String intrebare;

    @Column
    private RaspunsIntrebare descriere;

    public Intrebare(String intrebare, RaspunsIntrebare descriere)
    {
        this.intrebare = intrebare;
        this.descriere = descriere;
    }
}
