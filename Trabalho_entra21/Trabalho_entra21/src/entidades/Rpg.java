package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Rpg extends Game {

    private double mana;
    private double vidaMaxima;
    private ClasseRpg classeRpg;
    private List<ClasseRpg> listaClasses = new ArrayList<>();

    public Rpg(String nomeJogo, String nickname, String senha, double mana, double vidaMaxima, ClasseRpg classeRpg) {
        super(nomeJogo, nickname, senha);
        setClasseRpg(classeRpg);
        setMana(mana);
        setVidaMaxima(vidaMaxima);
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        if (mana < 0) {
            throw new IllegalArgumentException("Mana inválida");
        }
        this.mana = mana;
    }

    public double getVidaMaxima() {
        return vidaMaxima;
    }

    public void setVidaMaxima(double vidaMaxima) {
        if (vidaMaxima <= 0) {
            throw new IllegalArgumentException("Vida máxima inválida");
        }

        this.vidaMaxima = vidaMaxima;
    }

    public List<ClasseRpg> getListaClasses() {
        return listaClasses;
    }

    public void setListaRpg(List<ClasseRpg> listaClasses) {
        this.listaClasses = listaClasses;
    }

    public ClasseRpg getClasseRpg() {
        return classeRpg;
    }

    public void setClasseRpg(ClasseRpg classeRpg) {
        this.classeRpg = classeRpg;
    }

    @Override
    public String plataforma(String escolhePlataforma) {
        return escolhePlataforma;
    }

    //Adiciona Mana de acordo com o valor passado no parâmetro do método
    public void pocaoDeMana(double valorMana) {
        this.mana += valorMana;

    }

    //Adiciona vida de acordo com o valor passado no parâmetro do método
    public void pocaoDeVida(double valorVida) {
        this.vidaMaxima += valorVida;
    }

    /*Método no qual "Realiza ataques" em inimigos. Em caso de acerto, seu personagem
    perde uma quantidade de Mana, em caso de erro, seu personagem perde uma quantia de vida.
    */
    public String realizarAtaque(boolean acerto) {
        if (acerto == true) {
            this.setMana(getMana() - 10);
            return "Ataque realizado!";

        }
        this.setVidaMaxima(getVidaMaxima() - 30);
        return "Você errou o ataque!";
    }

    //Método que adiciona uma nova classe na ArrayList;
    public void adicionarClasse(ClasseRpg classeRpg) {
        getListaClasses().add(classeRpg);
    }

    //Exclui uma classe da lista de acordo com o tipo da classe passado como parâmetro
    public void excluirClassePorTipo(String tipoClasse) {
        Iterator<ClasseRpg> interator = listaClasses.iterator();
        while (interator.hasNext()) {
            ClasseRpg classeRpg = interator.next();
            if (classeRpg.getTipoClasse().equalsIgnoreCase(tipoClasse)) {
                interator.remove();
            }
        }
    }

    @Override
    public String toString() {
        return "<Rpg>" +
                "\nNome do jogo: " + super.getNomeJogo() +
                "\nSeu Nickname: " + super.getNickname() +
                "\nSenha Escolhida: " + super.getSenha() +
                "\nMana: " + mana +
                "\nVida Máxima: " + vidaMaxima;

    }

}
