package br.com.yagoananias.designpattern.factory.vehicles;

import br.com.yagoananias.designpattern.factory.Transport;

public class BicycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bicycle();
    }
}
