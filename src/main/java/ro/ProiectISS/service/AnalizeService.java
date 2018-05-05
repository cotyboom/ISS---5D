package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Analize;
import ro.ProiectISS.repository.AnalizeRepository;
import java.util.List;

@Service
public class AnalizeService
{
    private AnalizeRepository analizeRepository;

    @Autowired
    public AnalizeService(AnalizeRepository analizeRepository)
    {
        this.analizeRepository = analizeRepository;
    }

    public List<Analize> getAllAnalize()
    {
        List<Analize> listOfAllAnalize = analizeRepository.findAll();

        return listOfAllAnalize;
    }
    public void createAnalize(Analize analize)
    {
        analizeRepository.save(analize);
    }

    public Analize getById(Long id) {
        return analizeRepository.findById(id);
    }
}
