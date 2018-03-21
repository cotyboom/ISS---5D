package ro.ProiectISS.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.GrupaSangvina;
import ro.ProiectISS.enumerable.RH;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "analize")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Analize
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date dataAnaliza;

    @Column
    private GrupaSangvina grupaSangvina;

    @Column
    private RH rh;

    @OneToMany(targetEntity = Intrebare.class, cascade = CascadeType.ALL)
    private List<Intrebare> listIntrebare;

    public Analize(Date dataAnaliza, GrupaSangvina grupaSangvina, RH rh, List<Intrebare> listIntrebare)
    {
        this.dataAnaliza = dataAnaliza;
        this.grupaSangvina = grupaSangvina;
        this.rh = rh;
        this.listIntrebare = listIntrebare;
    }
}
