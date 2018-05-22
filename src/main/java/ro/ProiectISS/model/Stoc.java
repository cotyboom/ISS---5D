package ro.ProiectISS.model;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "stoc")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Stoc {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String grupa;

    @Column
    private String rh;

    @Column
    private String cantitate;

    public Stoc(String grupa, String rh, String cantitate)
    {
        this.grupa = grupa;
        this.rh = rh;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
