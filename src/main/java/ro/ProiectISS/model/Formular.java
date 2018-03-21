package ro.ProiectISS.model;

import lombok.*;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import ro.ProiectISS.abstractElement.Human;
import ro.ProiectISS.enumerable.Rol;
import ro.ProiectISS.enumerable.Sex;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "formular")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Formular
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Date dataDonare;

    @Column
    private Integer varsta;

    @Column
    private Integer greutate;

    @OneToMany(targetEntity = Intrebare.class, cascade = CascadeType.ALL)
    private List<Intrebare> listIntrebare;

    @Column
    private Date dataMenstruatie;

    @Column
    private Date dataNastereCopil;

    @Column
    private String numePacient;


    public Formular(Date dataDonare, Integer varsta, Integer greutate, List<Intrebare> listIntrebare, Date dataMenstruatie, Date dataNastereCopil, String numePacient)
    {
        this.dataDonare = dataDonare;
        this.varsta = varsta;
        this.greutate = greutate;
        this.listIntrebare = listIntrebare;
        this.dataMenstruatie = dataMenstruatie;
        this.dataNastereCopil = dataNastereCopil;
        this.numePacient = numePacient;
    }
}
