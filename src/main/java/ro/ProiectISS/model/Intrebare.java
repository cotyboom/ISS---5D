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

    @Column
    private String idAnalize;

    @Column
    private String idFormular;

    public Intrebare(String intrebare, RaspunsIntrebare descriere, String idAnalize, String idFormular)
    {
        this.intrebare = intrebare;
        this.descriere = descriere;
        this.idAnalize = idAnalize;
        this.idFormular = idFormular;
    }
}
