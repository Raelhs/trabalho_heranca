package entidades;

public class Patente {

private String nivelPatente;

    public Patente(String nivelPatente) {
        setNivelPatente(nivelPatente);
    }

    public String getNivelPatente() {
        return nivelPatente;
    }

    public void setNivelPatente(String nivelPatente) {
       if (nivelPatente == null || nivelPatente.isBlank() || nivelPatente.isEmpty()){
           throw new IllegalArgumentException("Patente inválida");
       }

        this.nivelPatente = nivelPatente;
    }


    @Override
    public String toString() {
        return "Nível da Patente: " + nivelPatente;
    }
}
