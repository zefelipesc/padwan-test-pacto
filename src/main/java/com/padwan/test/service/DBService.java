package com.padwan.test.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.padwan.test.domain.Jedi;
import com.padwan.test.domain.Mentor;
import com.padwan.test.domain.Status;
import com.padwan.test.repositories.JediRepository;
import com.padwan.test.repositories.MentorRepository;

@Service
public class DBService {

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private JediRepository jediRepository;

    public void instatiateObjects() {

        Mentor mentor1 = new Mentor(null, "Mentor 1");
        Mentor mentor2 = new Mentor(null, "Mentor 2");

        Jedi jedi1 = new Jedi(null, "Padawan do Norte", 5000, mentor1,Status.PADAWAN, 1);
        Jedi jedi2 = new Jedi(null, "Jedi Vaqueiro", 10000, mentor1, Status.JEDI, 1);
        Jedi jedi3 = new Jedi(null, "Jedi Maromba",10000, mentor2, Status.JEDI, 1);
        Jedi jedi4 = new Jedi(null, "Mestre Jedi",20000, mentor2, Status.MESTRE_JEDI, 1);

        mentor1.getJediList().addAll(Arrays.asList(jedi1, jedi2));
        mentor2.getJediList().addAll(Arrays.asList(jedi3, jedi4));

        // saving in database
        this.mentorRepository.saveAll(Arrays.asList(mentor1, mentor2));
        this.jediRepository.saveAll(Arrays.asList(jedi1, jedi2, jedi3, jedi4));
    }
}
