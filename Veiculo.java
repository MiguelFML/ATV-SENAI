public class Veiculo {
    private String modelo;
    private String marca;
    private Motor motor;

    public Veiculo() {
        this.modelo = " ";
        this.marca = " ";
        this.motor = new Motor();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public Motor getMotor() {
        return motor;
    }
}
