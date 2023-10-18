package com.christianarchuleta.example.animal.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AnimalResponseDTO {
    final String id = UUID.randomUUID().toString();
    @Builder.Default String type = "ANIMAL";

    String name;
    int numberOfLegs;
    int lifeAmount;
}
