package ro.ProiectISS.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.RaspunsIntrebare;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.*;
import java.util.Date;


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
    private RaspunsIntrebare raspunsIntrebare;

    public Intrebare(String intrebare, RaspunsIntrebare raspunsIntrebare)
    {
        this.intrebare = intrebare;
        this.raspunsIntrebare = raspunsIntrebare;
    }
}
