package ro.ProiectISS.service;

import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Stoc;
import ro.ProiectISS.repository.StocRepository;

import java.util.List;

@Service
public class StocService {

    private StocRepository stocRepository;

    public StocService(StocRepository stocRepository) {this.stocRepository = stocRepository;}

    public List<Stoc> getAllStocks()
    {
        List<Stoc> listOfAllStocks = stocRepository.findAll();

        return listOfAllStocks;
    }

    public void createStoc(Stoc stoc) {
        stocRepository.save(stoc);
    }

    public Stoc getById(Long id) {
        return stocRepository.findById(id);
    }

    public List<Stoc> getByGr(String id) {
        return stocRepository.findByGrupa(id);
    }

    public void update(Long id, Stoc newStoc)
    {
        Stoc oldStoc = stocRepository.findById(id);

        newStoc.setId(oldStoc.getId());

        stocRepository.save(newStoc);
    }

}