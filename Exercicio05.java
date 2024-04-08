package vetores;
import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
  
        int n = 10;
        double nota1[] = new double[n];
        double nota2[] = new double[n];
        double result[] = new double[n];
        int i;
  
        for (i=0; i<n; i++) {
          System.out.printf("Informe as notas do %2do. aluno de %d.\n", (i+1), n);
          System.out.printf("1a. Nota = ");
          nota1[i] = ler.nextDouble();
          System.out.printf("2a. Nota = ");
          nota2[i] = ler.nextDouble();
  
          result[i] = (nota1[i] + nota2[i]) / 2;
  
          System.out.printf("\n");
        }
  
        System.out.printf("\nAluno 1a.Nota 2a.Nota Media Situacao.");
        System.out.printf("\n.....................................");
        for (i=0; i<n; i++) {
          System.out.printf("\n%5d %7.2f %7.2f %5.2f ", (i+1), nota1[i], nota2[i], result[i]);
          if (result[i] >= 7.0)
             System.out.printf("aprovado");
          else System.out.printf("reprovado");
        }
        System.out.printf("\n.....................................\n");
      }
  
  }


