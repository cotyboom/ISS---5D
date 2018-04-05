package ro.ProiectISS.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Donator;
import ro.ProiectISS.service.DonatorService;

import java.util.List;

@RestController
@RequestMapping(value = "/donator")
public class DonatorController {

    private DonatorService donatorService;

    @Autowired
    public DonatorController(DonatorService donatorService)
    {
        this.donatorService = donatorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Donator> getAll()
    {
        List<Donator> donatorList = donatorService.getAllAnalize();

        return donatorList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Donator donator)
    {
        donatorService.createDonator(donator);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Donator getById(@PathVariable Long id)
    {
        Donator donator = donatorService.getById(id);

        return donator;
    }

}