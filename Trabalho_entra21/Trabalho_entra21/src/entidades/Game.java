package entidades;

public abstract class Game {


    private String nomeJogo;
    private String nickname;
    private String senha;

    public Game(String nomeJogo, String nickname, String senha) {
        setNomeJogo(nomeJogo);
        setNickname(nickname);
        setSenha(senha);
    }


    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        if (nomeJogo == null || nomeJogo.isBlank() || nomeJogo.isEmpty()) {
            throw new IllegalArgumentException("Nome do jogo inválido");
        }
        this.nomeJogo = nomeJogo;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.isBlank() || nickname.isEmpty()) {
            throw new IllegalArgumentException("Nickname inválido");
        }
        this.nickname = nickname;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isBlank() || senha.isEmpty()) {
            throw new IllegalArgumentException("Senha inválida");
        }
        this.senha = senha;
    }

    //Método para setar a plataforma que deseja jogar
    public abstract String plataforma(String escolhePlataforma);



}


