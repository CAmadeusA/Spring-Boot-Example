package com.christianarchuleta.example.animal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AnimalModel {
    String type;
    String name;
    int numberOfLegs;
    int lifeAmount;
}
