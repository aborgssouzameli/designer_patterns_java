package br.com.meli.solid.creational.builder.v1.car;

import br.com.meli.solid.creational.builder.v1.component.CarType;
import br.com.meli.solid.creational.builder.v1.component.Color;
import br.com.meli.solid.creational.builder.v1.component.Engine;
import br.com.meli.solid.creational.builder.v1.component.Transmission;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;
}
