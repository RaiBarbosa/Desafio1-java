import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        //Lé os valores de Entrada:
        
        Scanner leitorDeEntradas = new Scanner(System.in); 
        float valorSalario = leitorDeEntradas.nextFloat(); 
        float valorBeneficios = leitorDeEntradas.nextFloat();
        
        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) { 
            //Atribiu a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario; 
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) { 
            //Atribiu a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario; 
        } else { 
            //Atribiu a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario; 
        } 


       //TODO Criar as demais condições para as aliquetas de 10.00%
        
        //Calcula isprise a Saída (com 2 casas decimais):
        
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
        
    }    
}
