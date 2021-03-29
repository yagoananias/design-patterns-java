package br.com.yagoananias.designpattern.factory.vehicles;

public class Motorcycle implements IVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega de motoca");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a encomenda de motoca");
    }
}
