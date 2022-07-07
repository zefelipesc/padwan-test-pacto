package com.padwan.test.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padwan.test.domain.Mentor;
import com.padwan.test.dto.MentorDTO;
import com.padwan.test.service.MentorService;

@RestController
@RequestMapping(value = "/mentors")
public class MentorController {

    @Autowired
    private MentorService mentorService;


    @GetMapping("/{id}")
    public ResponseEntity<Mentor> findById(@PathVariable Integer id) {
        Mentor obj = mentorService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @RequestMapping
    public ResponseEntity<List<MentorDTO>> findAll() {
        List<Mentor> categoryList = mentorService.findAll();
        List<MentorDTO> categoryDTOList = categoryList.stream().map(obj -> new MentorDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(categoryDTOList);
    }

    @GetMapping("/findAllMentorsAndJedis")
    public ResponseEntity<List<MentorDTO>> findAllMentorsAndJedis() {
        List<Mentor> mentorList = mentorService.findAllMentorsAndJedisById();
        List<MentorDTO> mentorDTOList = mentorList.stream().map(obj -> new MentorDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(mentorDTOList);
    }

}
