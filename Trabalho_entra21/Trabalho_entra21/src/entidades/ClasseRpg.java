package entidades;

public class ClasseRpg {

    private String tipoClasse;

    public ClasseRpg(String tipoClasse) {
        setTipoClasse(tipoClasse);
    }

    public String getTipoClasse() {
        return tipoClasse;
    }

    public void setTipoClasse(String tipoClasse) {
        if (tipoClasse == null || tipoClasse.isBlank() || tipoClasse.isEmpty()) {
            throw new IllegalArgumentException("Classe inválida");
        }
        this.tipoClasse = tipoClasse;
    }

    @Override
    public String toString() {
        return "Tipo da Classe: " + tipoClasse;
    }
}
