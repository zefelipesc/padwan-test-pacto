package com.padwan.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padwan.test.Exceptions.ObjectNotFoundException;
import com.padwan.test.domain.Jedi;
import com.padwan.test.repositories.JediCategoryDTORepository;
import com.padwan.test.repositories.JediRepository;

@Service
public class JediService {

    @Autowired
    private JediRepository jediRepository;

    @Autowired
    private JediCategoryDTORepository jediCategoryDTORepository;

    @Autowired
    private MentorService mentorService;

    public Jedi findById(Integer id) {
        Optional<Jedi> obj = jediRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Jedi with id:" + id + " not found!"));
    }

    public List<Jedi> findAllByMentor(Integer id_mentor) {
        mentorService.findById(id_mentor);
        return jediRepository.findAllJediByMentor(id_mentor);
    }

    public List<Jedi> findAll() {
        return jediRepository.findAll();
    }

    public List<Jedi> findAllJedisByMidichloriansHigherThan9000() {
        return jediRepository.findAllJedisByMidichloriansHigherThan9000();
    }

    public List<Jedi> findJediQuantityByStatus() {
        return jediCategoryDTORepository.findJediQuantityByStatus();
    }

}
