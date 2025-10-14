import java.util.Scanner;
public class IMC {
public static void main(String[] args) {
  int peso, altura,valor;
  Scanner sc = new Scanner(System.in); // criando objeto do tipo scaner
  
  System.out.print("Digite seu peso: ");
  peso = sc.nextInt(); // le um inteiro
  if(peso<0){
  sc.close();
    return;
  }
  
  System.out.print("Digite sua altura:");
  altura = sc.nextInt(); // le um inteiro
   if(altura<0){     
    sc.close();
    return;
}
  valor = (altura*altura)/peso;
  System.out.print("Seu IMC é ";+valor);

  
}
