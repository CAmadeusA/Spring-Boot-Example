package com.christianarchuleta.example.animal.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.christianarchuleta.example.animal.dto.AnimalResponseDTO;
import com.christianarchuleta.example.animal.model.AnimalModel;
import com.christianarchuleta.example.animal.service.AnimalService;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RestController
@RequestMapping("/api/animal")
@Getter
@Setter
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping("random")
    @ResponseStatus(HttpStatus.OK)
    public AnimalResponseDTO getRandomAnimal() {
        AnimalModel randomAnimal = this.animalService.getRandomAnimal();
        AnimalResponseDTO result = AnimalResponseDTO.builder().type(randomAnimal.getType()).name(randomAnimal.getName())
                .numberOfLegs(randomAnimal.getNumberOfLegs()).lifeAmount(randomAnimal.getLifeAmount()).build();
        
        return result;
    }

}
