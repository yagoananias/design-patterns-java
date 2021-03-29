package br.com.yagoananias.designpattern.factory;

import br.com.yagoananias.designpattern.factory.Transport;
import br.com.yagoananias.designpattern.factory.vehicles.Bicycle;
import br.com.yagoananias.designpattern.factory.vehicles.IVehicle;

public class BicycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
