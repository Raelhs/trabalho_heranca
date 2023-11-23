package executa;


import entidades.*;

import java.util.Iterator;

public class Principal {

    public static void main(String[] args) {

        Veiculo veiculo1 = new Veiculo("Carro", "Volkswagen", "Amarelo", "Fusca");
        Veiculo veiculo2 = new Veiculo("Moto", "Honda", "Preto", "CB600");
        Karting forza = new Karting("Forza", "Dirige FOFO", "Admin123", "Circuito", 280, veiculo1);

        forza.adicionarCarros(veiculo1);
        forza.adicionarCarros(veiculo2);
        forza.ativarBoost(true);

        System.out.println("Velocidade após o boost: " + forza.getVelocidadeMaxima());
        System.out.println("Plataforma: " + forza.plataforma("Console"));


        System.out.println("============================//===============================");

        Patente patenteDiamante2 = new Patente("Diamante 2 ");
        Patente patenteOuro1 = new Patente("Ouro 1");
        Patente patentePrata2 = new Patente("Prata 2");
        Patente patenteCobre5 = new Patente("Cobre 5");
        Fps rainbowSix = new Fps("Rainbow six", "Joaozinho2tela", "ClicaFacil12", 30, "Longa Distância", patenteDiamante2);

        rainbowSix.adicionarPatente(patenteDiamante2);
        rainbowSix.adicionarPatente(patenteOuro1);

        System.out.println(rainbowSix.getListaPatentes());
        System.out.println(rainbowSix.atirar(30));

        System.out.println("Quantidade de Balas: " + rainbowSix.getQuantidadeMunicao());
        System.out.println("Plataforma: " + rainbowSix.plataforma("Computador"));

        System.out.println("============================//===============================");

        ClasseRpg classeRpg1 = new ClasseRpg("Mago");
        ClasseRpg classeRpg2 = new ClasseRpg("Guerreiro");
        Rpg magicWarriors = new Rpg("Magic Warriors", "Pepe Legal", "Mamae123", 865, 3460, classeRpg1);
        magicWarriors.adicionarClasse(classeRpg1);
        magicWarriors.adicionarClasse(classeRpg2);

        System.out.println("Lista de classes do jogo " + magicWarriors.getNomeJogo() + "\n" + magicWarriors.getListaClasses());

        magicWarriors.pocaoDeMana(100);
        System.out.println("Mana após a poção: " + magicWarriors.getMana());

        magicWarriors.pocaoDeVida(300);
        System.out.println("Vida após a poção: " + magicWarriors.getVidaMaxima());

        magicWarriors.realizarAtaque(true);
        System.out.println("Após o acerto: " + magicWarriors.getMana());

        magicWarriors.realizarAtaque(false);
        System.out.println("Após o erro: " + magicWarriors.getVidaMaxima());
        System.out.println("Plataforma: " + magicWarriors.plataforma("Celular"));

        System.out.println("============================//===============================");

        System.out.println("Antes do delete: " + magicWarriors.getListaClasses());
        magicWarriors.excluirClassePorTipo("Mago");
        System.out.println("Após o delete: " + magicWarriors.getListaClasses());

        System.out.println("\nAntes do update: " + rainbowSix.getListaPatentes());
        rainbowSix.updateFps("Diamante 2 ", patentePrata2);
        System.out.println(rainbowSix.getListaPatentes());
        rainbowSix.updateFps("Prata 2", patenteCobre5);
        System.out.println(rainbowSix.getListaPatentes());

        System.out.println(forza.imprimirCarroPorModelo("CB600"));
    }
}
