package AVA2-IMC;

public class ImcCalculator {
    public static double calcular(Pessoa pessoa) {
        double peso = pessoa.getPeso();
        double altura = pessoa.getAltura();
        return peso / (altura * altura);
    }
}
