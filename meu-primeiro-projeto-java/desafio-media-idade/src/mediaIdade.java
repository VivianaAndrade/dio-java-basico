import java.util.Scanner;

public class mediaIdade {
    public static void main(String[] args) {
        Scanner idade = new Scanner(System.in);

        for(int i=0; i<=2; i++){
        System.out.println("Informe a sua idade:");
        int idade1 = idade.nextInt();

        }

        if (idade  >=0 && idade <26){
            System.out.println ("Jovem");
        }
        else if (idade >=26 && idade <=60){
            System.out.println ("Adulto");
        }
        else 
        System.out.println("Idoso");
    
        for(int i=0; i<=2; i++){
            System.out.println("Sua idade:"+idade1);
        }
    }
}

