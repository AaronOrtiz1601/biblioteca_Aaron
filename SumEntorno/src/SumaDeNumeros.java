import java.util.Scanner;
public class SumaDeNumeros {

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n;
    int n2;
    System.out.println("Dime dos numero y yo te los sumare");
    System.out.println("Dime el primer numero");
    n=Integer.parseInt(sc.nextLine());
    System.out.println("Dime el segundo numero");
    n2=Integer.parseInt(sc.nextLine());
    System.out.println("La suma de los numeros es "+ (n+n2));
  }

}
