import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws ParametroInvalidosException {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (ParametroInvalidosException e) {
            throw new ParametroInvalidosException(e.getMessage());

        }

    }
    static void contar(int parametroUm, int parametroDois ) throws ParametroInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametroInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        }
        int contagem = parametroDois - parametroUm;
        for(int i = 0 ; i <=contagem ; i ++){
            System.out.println("imprimeindo o número " + i);
        }
    }


    }