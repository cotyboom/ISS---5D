package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Donator;
import ro.ProiectISS.repository.DonatorRepository;
import java.util.List;

@Service
public class DonatorService
{
    private DonatorRepository donatorRepository;

    @Autowired
    public DonatorService(DonatorRepository donatorRepository)
    {
        this.donatorRepository = donatorRepository;
    }

    public List<Donator> getAllAnalize()
    {
        List<Donator> listOfAllDonatori = donatorRepository.findAll();

        return listOfAllDonatori;
    }

    public void createDonator(Donator donator)
    {
        donatorRepository.save(donator);
    }

    public Donator getById(Long id) {
        return donatorRepository.findById(id);
    }

}
