package com.padwan.test.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.padwan.test.domain.Jedi;
import com.padwan.test.dto.JediCategoryDTO;
import com.padwan.test.dto.JediDTO;
import com.padwan.test.service.JediService;

@RestController
@RequestMapping(value = "/jedis")
public class JediController {

    @Autowired
    private JediService jediService;

    @Autowired
    public JediController(JediService jediService) {
        this.jediService = jediService;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Jedi> findById(@PathVariable Integer id) {
        Jedi obj = jediService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

//    @GetMapping // localhost:9099/jedis?mentor=1
//    public ResponseEntity<List<JediDTO>> findAll(@RequestParam(value = "mentor", defaultValue = "1") Integer id_mentor) {
//        List<Jedi> jediList = jediService.findAllByMentor(id_mentor);
//        List<JediDTO> jediDTOList = jediList.stream().map(obj -> new JediDTO(obj)).collect(Collectors.toList());
//        return ResponseEntity.ok().body(jediDTOList);
//    }

    @GetMapping
    public ResponseEntity<List<JediDTO>> findAll() {
        List<Jedi> jediList = jediService.findAll();
        List<JediDTO> jediDTOList = jediList.stream().map(obj -> new JediDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(jediDTOList);
    }

    @GetMapping("/midichlorians-higher-than-9000")
    public ResponseEntity<List<JediDTO>> findAllJedisByMidichloriansHigherThan9000() {
        List<Jedi> jediList = jediService.findAllJedisByMidichloriansHigherThan9000();
        List<JediDTO> jediDTOList = jediList.stream().map(obj -> new JediDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(jediDTOList);
    }

    @GetMapping("/by-status")
    public ResponseEntity<List<JediCategoryDTO>> findJediQuantityByStatus() {
        List<Jedi> jediList = jediService.findJediQuantityByStatus();
        List<JediCategoryDTO> jediDTOList = jediList.stream().map(obj -> new JediCategoryDTO(obj)).collect(Collectors.toList());
        return ResponseEntity.ok().body(jediDTOList);
    }
}
