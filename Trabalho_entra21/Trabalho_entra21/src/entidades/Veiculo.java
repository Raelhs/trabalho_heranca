package entidades;

public class Veiculo {

    private String tipoDoVeiculo;
    private String marca;
    private String cor;
    private String modelo;

    public Veiculo(String tipoDoVeiculo, String marca, String cor, String modelo) {
        this.modelo = modelo;
        setTipoDoVeiculo(tipoDoVeiculo);
        setMarca(marca);
        setCor(cor);
    }

    public String getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(String tipoDoVeiculo) {
        if (tipoDoVeiculo == null || tipoDoVeiculo.isBlank() || tipoDoVeiculo.isEmpty()) {
            throw new IllegalArgumentException("Tipo do veículo inválido");
        }

        this.tipoDoVeiculo = tipoDoVeiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.isBlank() || marca.isEmpty()) {
            throw new IllegalArgumentException("Marca inválida");
        }
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        if (cor == null || cor.isBlank() || cor.isEmpty()) {
            throw new IllegalArgumentException("Cor inválida");

        }
        this.cor = cor;
    }

    public String getModelo() {
        if (modelo == null || modelo.isBlank() || modelo.isEmpty()) {
            throw new IllegalArgumentException("Modelo Inválido");
        }
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "\nTipo do Veículo: " + tipoDoVeiculo +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCor: " + cor;
    }
}
