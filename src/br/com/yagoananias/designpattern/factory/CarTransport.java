package br.com.yagoananias.designpattern.factory;

import br.com.yagoananias.designpattern.factory.vehicles.Car;
import br.com.yagoananias.designpattern.factory.vehicles.IVehicle;

public class CarTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
