package ro.ProiectISS.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ProiectISS.model.Doctor;
import ro.ProiectISS.repository.DoctorRepository;

import java.util.List;

// again, aici e basic basic si ne hotaram la ora exact ce functii ne trebuie

@Service
public class DoctorService
{
    private DoctorRepository doctorRepository;

    @Autowired
    public DoctorService(DoctorRepository doctorRepository)
    {
        this.doctorRepository = doctorRepository;
    }

    public List<Doctor> getAllDoctors()
    {
        List<Doctor> listOfAllDoctors = doctorRepository.findAll();

        return listOfAllDoctors;
    }
}
