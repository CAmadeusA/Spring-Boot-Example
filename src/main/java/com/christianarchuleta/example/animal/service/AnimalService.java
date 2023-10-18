package com.christianarchuleta.example.animal.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.christianarchuleta.example.animal.model.AnimalModel;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AnimalService {

    public ArrayList<AnimalModel> animals = new ArrayList<>(
            Arrays.asList(new AnimalModel("BIRD", "PARROT", 2, 1), new AnimalModel("CAT", "MUNCHKIN", 4, 2),
                    new AnimalModel("DOG", "WOOFERS", 4, 3)));

    public AnimalModel getRandomAnimal() {
        return animals.get(new Random().nextInt(animals.size()));
    }

}
