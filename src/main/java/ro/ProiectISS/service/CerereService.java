package ro.ProiectISS.service;

import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Cerere;
import ro.ProiectISS.repository.CerereRepository;

import java.util.List;

@Service
public class CerereService {

    private CerereRepository cerereRepository;

    public CerereService(CerereRepository cerereRepository) {this.cerereRepository = cerereRepository;}

    public List<Cerere> getAllStocks()
    {
        List<Cerere> listOfAllCereri = cerereRepository.findAll();

        return listOfAllCereri;
    }

    public void createCerere(Cerere cerere) {
        cerereRepository.save(cerere);
    }

    public Cerere getById(Long id) {
        return cerereRepository.findById(id);
    }

    public void update(Long id, Cerere newProgramare)
    {
        Cerere oldProgramare = cerereRepository.findById(id);

        newProgramare.setId(oldProgramare.getId());

        cerereRepository.save(newProgramare);
    }
}
