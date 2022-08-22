package br.com.meli.solid.creational.builder.v1.builder;

import br.com.meli.solid.creational.builder.v1.car.Car;
import br.com.meli.solid.creational.builder.v1.component.CarType;
import br.com.meli.solid.creational.builder.v1.component.Engine;
import br.com.meli.solid.creational.builder.v1.component.Transmission;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarBuilder implements IBuilder {
    private CarType carType;
    private int seats;
    private Transmission transmission;
    private Engine engine;
    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(
                this.carType,
                this.seats,
                this.engine,
                this.transmission
        );
    }
}
