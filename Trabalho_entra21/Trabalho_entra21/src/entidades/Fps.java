package entidades;

import java.util.ArrayList;
import java.util.List;

public class Fps extends Game {

    private int quantidadeMunicao;
    private String classeArmamento;
    private List<Patente> listaPatentes = new ArrayList<>();
    private Patente patente;

    public Fps(String nomeJogo, String nickname, String senha, int quantidadeMunicao, String classeArmamento, Patente patente) {
        super(nomeJogo, nickname, senha);
        setPatente(patente);
        setQuantidadeMunicao(quantidadeMunicao);
        setClasseArmamento(classeArmamento);
    }

    public int getQuantidadeMunicao() {
        return quantidadeMunicao;
    }

    public void setQuantidadeMunicao(int quantidadeMunicao) {
        if (quantidadeMunicao < 0) {
            throw new IllegalArgumentException("Munição inválida");
        }

        this.quantidadeMunicao = quantidadeMunicao;
    }

    public String getClasseArmamento() {
        return classeArmamento;
    }

    public void setClasseArmamento(String classeArmamento) {
        if (classeArmamento == null || classeArmamento.isBlank() || classeArmamento.isEmpty()) {
            throw new IllegalArgumentException("Armamento inválido");

        }
        this.classeArmamento = classeArmamento;
    }

    public List<Patente> getListaPatentes() {
        return listaPatentes;
    }

    public void setListaPatentes(List<Patente> listaPatentes) {
        this.listaPatentes = listaPatentes;
    }

    public Patente getPatente() {
        return patente;
    }

    public void setPatente(Patente patente) {
        this.patente = patente;
    }

    @Override
    public String plataforma(String escolhePlataforma) {
        return escolhePlataforma;
    }

    /*Método que "recarrega" a munição, adicionando o valor determinado no código
     Será realizado apenas quando o número de balas for zero*/
    private String recarregarMunicao() {
        if (this.quantidadeMunicao == 0) {
            this.setQuantidadeMunicao(getQuantidadeMunicao() + 30);
            return "Sua munição acabou! \nMunição recarregada";
        }
        if (this.quantidadeMunicao < 30) {
            return "Você ainda tem balas!";
        }
            return "Munição cheia";
        }

    //Adiciona uma patente na ArrayList
    public void adicionarPatente(Patente patente) {
        getListaPatentes().add(patente);
    }

    //Método que zera a quantidade de balas
    public String atirar(int numeroBalas) {
        if (this.quantidadeMunicao > 0) {
            this.setQuantidadeMunicao(getQuantidadeMunicao() - numeroBalas);
            return recarregarMunicao();
        }
        return "Cheia!";
    }
    //faz upddate na lista de patentes
    public void updateFps(String nivelPatente, Patente novaPatente) {
           for (Patente rank : listaPatentes){
            if (rank.getNivelPatente().equalsIgnoreCase(nivelPatente)) {
                rank.setNivelPatente(novaPatente.getNivelPatente());
                listaPatentes.set(0, rank);

            }
        }
    }


    @Override
    public String toString() {
        return "Nome do Jogo: " + super.getNomeJogo() +
                "Seu Nickname: " + super.getNickname() +
                "Sua senha: " + super.getSenha() +
                "Quantidade de Munição: " + quantidadeMunicao +
                "Classe do Armamento: " + classeArmamento +
                "Patente: " + patente;

    }
}
