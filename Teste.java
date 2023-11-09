import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[5];

        for (int i = 0; i < 5; i++) {
            veiculos[i] = new Veiculo();
            System.out.println("Digite o modelo do veículo " + (i + 1) + ": ");
            veiculos[i].setModelo(input.nextLine());
            System.out.println("Digite a marca do veículo " + (i + 1) + ": ");
            veiculos[i].setMarca(input.nextLine());
            System.out.println("Digite a potência do motor do veículo " + (i + 1) + ": ");
            int potencia = input.nextInt();
            veiculos[i].getMotor().setPotencia(potencia);
            input.nextLine(); // Limpa o buffer do teclado
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\n Veículo " + (i + 1) + ":");
            System.out.println("Modelo: " + veiculos[i].getModelo());
            System.out.println("Marca: " + veiculos[i].getMarca());
            System.out.println("Potência do motor: " + veiculos[i].getMotor().getPotencia());
        }
        input.close();
    }
}
