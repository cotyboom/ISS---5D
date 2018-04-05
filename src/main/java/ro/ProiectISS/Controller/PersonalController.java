package ro.ProiectISS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Personal;
import ro.ProiectISS.service.PersonalService;

import java.util.List;

@RestController
@RequestMapping(value = "/personal")
public class PersonalController {

    private PersonalService personalService;

    @Autowired
    public PersonalController(PersonalService personalService)
    {
        this.personalService = personalService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Personal> getAll()
    {
        List<Personal> personalList = personalService.getAllPersonal();

        return personalList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Personal personal)
    {
        personalService.createPersonal(personal);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Personal getById(@PathVariable Long id)
    {
        Personal personal= personalService.getById(id);

        return personal;
    }

}