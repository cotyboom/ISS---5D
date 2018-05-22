package ro.ProiectISS.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "cerere")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Cerere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String idDoctor;

    @Column
    private String nume;

    @Column
    private String prenume;

    @Column
    private String grupa;

    @Column
    private String rh;

    @Column
    private String cantitate;

    @Column
    private String date;

    @Column
    private String stare;

    public Cerere(String idDoctor, String nume, String prenume,  String grupa, String rh, String cantitate, String date, String stare)
    {
        this.idDoctor = idDoctor;
        this.nume = nume;
        this.prenume = prenume;
        this.grupa = grupa;
        this.rh = rh;
        this.cantitate = cantitate;
        this.date = date;
        this.stare = stare;
    }

    public void setStare(String stare) {
        this.stare = stare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
}
