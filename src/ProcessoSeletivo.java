import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase>salarioPretendido){
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        } else {
            System.out.println("Aguarando o resultados dos demais candidatos");
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void selecaoDeCandidatos(){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(String.format("O candidato %s, solicitou um salário de %.2f.",candidato,salarioPretendido));
            if (salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println(String.format("O candidato %s foi selecionado para a vaga.",candidato));
            }
            candidatoAtual++;
        }
    }
    public static void main(String[] args) {
        System.out.println("Processo seletivo.");
//        analisarCandidato(1900.0);
//        analisarCandidato(2200.0);
//        analisarCandidato(2000.0);
        selecaoDeCandidatos();
    }
}
