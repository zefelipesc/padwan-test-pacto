package com.padwan.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padwan.test.Exceptions.ObjectNotFoundException;
import com.padwan.test.domain.Mentor;
import com.padwan.test.repositories.MentorRepository;

@Service
public class MentorService {

    private MentorRepository mentorRepository;

    @Autowired
    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public Mentor findById(Integer id_mentor) {
        Optional<Mentor> obj = mentorRepository.findById(id_mentor);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Mentor with id:" + id_mentor + " not found!"));
    }

    public List<Mentor> findAll() {
        return mentorRepository.findAll();
    }

    public List<Mentor> findAllMentorsAndJedisById() {
        List<Mentor> allMentorsAndJedis = mentorRepository.findAllMentorsAndJedis();
        return allMentorsAndJedis;

    }

}
