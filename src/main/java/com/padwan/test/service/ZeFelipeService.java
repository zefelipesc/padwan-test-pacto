package com.padwan.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ZeFelipeService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("Rasengan");
        skills.add("Shadow clone");
        skills.add("Kongōken");
        skills.add("Kuchiyose no Jutsu");
        skills.add("Oodama Rasengan");
        skills.add("Rasenshuriken");
        skills.add("suin Rasengan");
        return skills;
    }
}
