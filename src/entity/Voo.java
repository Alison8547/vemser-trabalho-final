package entity;
import java.util.Arrays;
import java.util.Date;

public class Voo {

    private int id;
    private Cliente[] passageiros;
    private Date dataPartida;
    private Date dataChegada;
    private String localPartida;//(Cidade/Estado/Pais)
    private String localChegada;//(Cidade/Estado/Pais)
    private double precoPassagem;

    public Voo(int id, Cliente[] passageiros, Date dataPartida, Date dataChegada, String localPartida, String localChegada, double precoPassagem) {
        this.id = id;
        this.passageiros = passageiros;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.precoPassagem = precoPassagem;
    }

    @Override
    public String toString() {
        return "Voo{" +
                "id=" + id +
                ", passageiros=" + Arrays.toString(passageiros) +
                ", dataPartida=" + dataPartida +
                ", dataChegada=" + dataChegada +
                ", localPartida='" + localPartida + '\'' +
                ", localChegada='" + localChegada + '\'' +
                ", precoPassagem=" + precoPassagem +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente[] getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(Cliente[] passageiros) {
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
