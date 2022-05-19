
package calculadorasimples;
import java.util.Scanner;
public class CalculadoraSimples {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1,n2;
        double multiplicacao,divisao,soma,subtracao;
        int operacao;
        System.out.println("Informe o primeiro valor");
        n1=teclado.nextDouble();
        System.out.println("Informe o segundo valor");
        n2=teclado.nextDouble();
        
        System.out.println("-----SELECIONE UMA OPERACAO-----");
        System.out.println("(1) Soma");
        System.out.println("(2) Subtracao");
        System.out.println("(3) Multiplicacao");
        System.out.println("(4) Divisao");
        System.out.println("---------------------");
        
        operacao = teclado.nextInt();
        
        switch(operacao){
                case 1:
                soma=n1+n2;
                System.out.println("A soma e igual a "+soma);
         break;
                case 2:
                subtracao=n1-n2;
                System.out.println("A subtracao e igual a "+subtracao);
         break;
                case 3:
                multiplicacao=n1*n2;
                System.out.println("A subtracao e igual a "+multiplicacao);
         break;
                case 4:
                divisao=n1/n2;
                System.out.println("A subtracao e igual a "+divisao);
         break;
                default:
                  System.out.println("Operador Invalido");
        }
    }
    
}
