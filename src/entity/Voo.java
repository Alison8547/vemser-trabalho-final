package entity;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Voo {

    private int id;
    private List<Cliente> passageiros = new ArrayList<>();
    private Date dataPartida;
    private Date dataChegada;
    private String localPartida;//(Cidade/Estado/Pais)
    private String localChegada;//(Cidade/Estado/Pais)
    private double precoPassagem;
    private static final SecureRandom secureRandom = new SecureRandom();

    {
        id = 1 + secureRandom.nextInt(100);
    }

    public Voo(List<Cliente> passageiros, Date dataPartida, Date dataChegada, String localPartida, String localChegada, double precoPassagem) {
        this.passageiros = passageiros;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.precoPassagem = precoPassagem;
    }
    public Voo(){}

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", passageiros=" + getPassageiros() +
                ", dataPartida=" + getDataPartida() +
                ", dataChegada=" + getDataChegada() +
                ", localPartida='" + getLocalPartida() + '\'' +
                ", localChegada='" + getLocalChegada() + '\'' +
                ", precoPassagem=" + getPrecoPassagem() +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cliente> getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(List<Cliente> passageiros) {
        this.passageiros = passageiros;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalChegada() {
        return localChegada;
    }

    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }
}
