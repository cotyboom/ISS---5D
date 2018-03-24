package ro.ProiectISS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Formular;
import ro.ProiectISS.repository.FormularRepository;
import java.util.List;

@Service
public class FormularService
{
    private FormularRepository formularRepository;

    @Autowired
    public FormularService(FormularRepository formularRepository)
    {
        this.formularRepository = formularRepository;
    }

    public List<Formular> getAllFormulare()
    {
        List<Formular> listofAllFormulare = formularRepository.findAll();

        return listofAllFormulare;
    }
}
