package br.com.yagoananias.designpattern.factory;

import br.com.yagoananias.designpattern.factory.vehicles.IVehicle;
import br.com.yagoananias.designpattern.factory.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
