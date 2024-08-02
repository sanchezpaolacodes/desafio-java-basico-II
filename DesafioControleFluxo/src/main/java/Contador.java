import java.util.Scanner;

//Objetivo do contador: Receber 2 numeros inteiros, faz iteracao.
// Se segundo parametro for menor q o primeiro lancar uma exception de domínio
public class Contador {

    public static void verificarParametros() throws ParametrosInvalidosException {
        Scanner scanner = new Scanner(System.in);
        int primeiroParametro, segundoParametro;
        System.out.println("Digite dois numeros, sendo o primeiro menor q o segundo:");
        primeiroParametro = scanner.nextInt();
        segundoParametro = scanner.nextInt();
        System.out.println(String.format("Você digitou os números: %s e %s", primeiroParametro, segundoParametro));

        if(primeiroParametro > segundoParametro){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }

        for(int i = primeiroParametro ; primeiroParametro <= segundoParametro ; primeiroParametro++){
            System.out.println("Imprimindo o número: " + primeiroParametro);
        }

    }

    public static void main(String[] args) {
        try{
            verificarParametros();
        }catch (ParametrosInvalidosException exception){
            System.out.println("Erro: " + exception.getMessage());
        }
    }


}
