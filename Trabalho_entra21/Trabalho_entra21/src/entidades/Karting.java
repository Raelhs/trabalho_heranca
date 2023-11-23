package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Karting extends Game {

    private String tipoPista;
    private double velocidadeMaxima;
    private List<Veiculo> listaCarros = new ArrayList<>();
    private Veiculo veiculo;

    public Karting(String nomeJogo, String nickname, String senha, String tipoPista, double velocidadeMaxima, Veiculo veiculo) {
        super(nomeJogo, nickname, senha);
        setVeiculo(veiculo);
        setTipoPista(tipoPista);
        setVelocidadeMaxima(velocidadeMaxima);
    }

    public String getTipoPista() {
        return tipoPista;
    }

    public void setTipoPista(String tipoPista) {
        if (tipoPista == null || tipoPista.isBlank() || tipoPista.isEmpty()) {
            throw new IllegalArgumentException("Pista inválida");
        }
        this.tipoPista = tipoPista;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        if (velocidadeMaxima <= 0) {
            throw new IllegalArgumentException("Velocidade máxima inválida");
        }
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public List<Veiculo> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(List<Veiculo> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public String plataforma(String escolhePlataforma) {
        return escolhePlataforma;
    }

    //Método que aumenta a velocidade máxima do veículo;
    public void ativarBoost(boolean boost) {
        if (boost == true) {
            this.setVelocidadeMaxima(getVelocidadeMaxima() + 100);
            System.out.println("Boost ativado!");
        } else {
            System.out.println("Boost não ativo");
        }
    }

    //Método para adicionar veículos na lista de Veículos
    public void adicionarCarros(Veiculo veiculo) {
        this.getListaCarros().add(veiculo);

    }


    //Imprime determinado veiculo de acordo com seu modelo
    public String imprimirCarroPorModelo(String modeloCarro) {
        for (Veiculo veiculo : listaCarros) {
            if (veiculo.getModelo().equalsIgnoreCase(modeloCarro)) {
                return veiculo.toString();
            }
        }
        return veiculo.toString();
    }

    @Override
    public String toString() {
        return "<Karting>" +
                "\nNome do Jogo: " + super.getNomeJogo() +
                "\nSeu Nickname: " + super.getNickname() +
                "\nSua senha: " + super.getSenha() +
                "\nTipo da Pista: " + tipoPista +
                "\nVelocidade Máxima: " + velocidadeMaxima +
                "\nVeículo: " + veiculo;
    }
}
