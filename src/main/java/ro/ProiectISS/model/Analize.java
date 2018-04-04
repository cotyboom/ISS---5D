package ro.ProiectISS.model;

import lombok.*;
import ro.ProiectISS.enumerable.GrupaSangvina;
import ro.ProiectISS.enumerable.RH;

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
    private Date date;

    @Column
    private GrupaSangvina grupaSangvina;

    @Column
    private RH rH;

    @OneToMany(targetEntity = Intrebare.class, cascade = CascadeType.ALL)
    private List<Intrebare> listIntrebare;

    public Analize(Date date, GrupaSangvina grupaSangvina, RH rH, List<Intrebare> listIntrebare)
    {
        this.date = date;
        this.grupaSangvina = grupaSangvina;
        this.rH = rH;
        this.listIntrebare = listIntrebare;
    }
}
