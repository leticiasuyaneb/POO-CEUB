package AVA2-IMC;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Peso: ");
        double peso = sc.nextDouble();
        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, peso, altura);
        double imc = ImcCalculator.calcular(pessoa);
        String analise = ImcService.analisarImc(imc);

        System.out.printf("Nome: %s\nIMC: %.2f\nAnálise: %s\n", pessoa.getNome(), imc, analise);
        sc.close();
    }
}
