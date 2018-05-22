package ro.ProiectISS.model;

import lombok.*;

import javax.persistence.*;


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
    private String date;

    @Column
    private String grupaSangvina;

    @Column
    private String rH;

    @Column
    private String idDonator;

    @Column
    private String rezultate;


    public Analize(String date, String grupaSangvina, String rH, String idDonator,String rezultate)
    {
        this.date = date;
        this.grupaSangvina = grupaSangvina;
        this.rH = rH;
        this.idDonator = idDonator;
        this.rezultate = rezultate;
    }
}