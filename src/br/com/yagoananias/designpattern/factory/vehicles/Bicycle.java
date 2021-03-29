package br.com.yagoananias.designpattern.factory.vehicles;

public class Bicycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a pedalada");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda de bike");
    }
}
