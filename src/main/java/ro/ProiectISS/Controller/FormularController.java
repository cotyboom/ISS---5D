package ro.ProiectISS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Formular;
import ro.ProiectISS.service.FormularService;

import java.util.List;

@RestController
@RequestMapping(value = "/formular")
public class FormularController {

    private FormularService formularService;

    @Autowired
    public FormularController(FormularService formularService)
    {
        this.formularService = formularService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Formular> getAll()
    {
        List<Formular> formularList = formularService.getAllFormulare();

        return formularList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Formular formular)
    {
        formularService.createFormular(formular);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Formular getById(@PathVariable Long id)
    {
        Formular formular = formularService.getById(id);

        return formular;
    }

}