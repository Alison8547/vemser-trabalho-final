package entity;

import java.util.Date;

public class Voo {
    int id;
    Cliente[] passageiros = new Cliente[10];
    Date dataPartida;
    String localPartida;
    String localChegada;
    Double precoPassagem;
}
