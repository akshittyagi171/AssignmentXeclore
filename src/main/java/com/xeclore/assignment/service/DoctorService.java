package com.xeclore.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xeclore.assignment.model.Doctor;
import com.xeclore.assignment.repository.DoctorRepository;

@Service
public class DoctorService {
    @Autowired
    private DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void removeDoctor(Long id) {
        doctorRepository.deleteById(id);
    }

    public List<Doctor> suggestDoctors(String symptom, String city) {
        String speciality = getSpecialityBySymptom(symptom);
        return doctorRepository.findBySpecialityAndCity(speciality, city);
    }

    private String getSpecialityBySymptom(String symptom) {
        switch (symptom) {
            case "Arthritis":
            case "Back Pain":
            case "Tissue injuries":
                return "Orthopaedic";
            case "Dysmenorrhea":
                return "Gynecology";
            case "Skin infection":
            case "Skin burn":
                return "Dermatology";
            case "Ear pain":
                return "ENT";
            default:
                throw new IllegalArgumentException("Unknown symptom: " + symptom);
        }
    }
}


