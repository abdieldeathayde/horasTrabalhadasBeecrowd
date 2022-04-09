import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int numero_funcionario, horas_trabalhadas;
    float valor_hora, salario;
    Scanner s = new Scanner(System.in);
    numero_funcionario = s.nextInt();
    horas_trabalhadas = s.nextInt();
    valor_hora = s.nextFloat();
    

    salario = horas_trabalhadas * valor_hora;

    System.out.println("NUMBER = " + numero_funcionario);
    
    System.out.printf("SALARY = U$ " + salario);
    
    
    
  }
}