package ro.ProiectISS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ro.ProiectISS.model.Doctor;
import ro.ProiectISS.service.DoctorService;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {

    private DoctorService doctorService;

    @Autowired
    public DoctorController(DoctorService doctorService)
    {
        this.doctorService = doctorService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Doctor> getAll()
    {
        List<Doctor> doctorList = doctorService.getAllDoctors();

        return doctorList;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Doctor doctor)
    {
        doctorService.createDoctor(doctor);
    }
    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)

    public Doctor getById(@PathVariable Long id)
    {
        Doctor doctor = doctorService.getById(id);

        return doctor;
    }
}
