package AVA2-IMC;

public class ImcService {

    public static String analisarImc(double imc) {
        if (imc < 18.5) {
            return "Baixo peso. Procure um médico.";
        } else if (imc < 25) {
            return "Peso adequado.";
        } else if (imc < 30) {
            return "Sobrepeso. Atenção à saúde!";
        } else if (imc < 35) {
            return "Obesidade grau I. Busque orientação médica.";
        } else if (imc < 40) {
            return "Obesidade grau II. Atenção redobrada!";
        } else {
            return "Obesidade grau III. Risco elevado, procure ajuda médica.";
        }
    }
}
