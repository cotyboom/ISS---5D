package ro.ProiectISS.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


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
    private Date date;

    @Column
    private Integer varsta;

    @Column
    private Integer greutate;

    @Column
    private Date dataMenstruatie;

    @Column
    private Date dataNastereCopil;

    @Column
    private String numePacient;

    @Column
    private String idDonator;


    public Formular(Date date, Integer varsta, Integer greutate, Date dataMenstruatie, Date dataNastereCopil, String numePacient, String idDonator)
    {
        this.date = date;
        this.varsta = varsta;
        this.greutate = greutate;
        this.dataMenstruatie = dataMenstruatie;
        this.dataNastereCopil = dataNastereCopil;
        this.numePacient = numePacient;
        this.idDonator = idDonator;
    }
}
