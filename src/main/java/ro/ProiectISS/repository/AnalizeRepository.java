package ro.ProiectISS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.ProiectISS.enumerable.GrupaSangvina;
import ro.ProiectISS.enumerable.RH;
import ro.ProiectISS.model.Analize;

import java.util.Date;

// parametrii pentru JPA repo sunt Entitatea(Analize) si Long(pentru ca id-ul entitatii este de tip Long)
public interface AnalizeRepository extends JpaRepository<Analize, Long>
{
    //Am adaugat niste metode pentru find, da nu ii neaparat sa le folosim pe toate. Le-am pus doar aici.
    Analize findById(Long id);
    Analize findByDate(Date dataAnaliza);
    Analize findByGrupaSangvina(GrupaSangvina grupaSangvina);
    Analize findByRH(RH rh);
}
