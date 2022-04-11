import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);
//variável
    double salarioAtual = 0.0,
           novoSalario = 0.0; 
    double  gratifi = 0.0,
         impostos = 0.0; 
  //Entrada
    System.out.println("Salario atual :");
    salarioAtual = leitor.nextDouble(); 
//Processamento
    gratifi = (salarioAtual * 0.05);
    impostos = (salarioAtual *0.07); 
    novoSalario = salarioAtual + gratifi - impostos ;
  //Saida
    System.out.println("Salario a receber : R$ " + novoSalario);
  }
}