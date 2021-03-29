package br.com.yagoananias.designpattern.factory;

import br.com.yagoananias.designpattern.factory.vehicles.IVehicle;

public abstract class Transport {

    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
