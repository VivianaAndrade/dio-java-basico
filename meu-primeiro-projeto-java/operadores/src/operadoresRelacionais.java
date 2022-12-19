public class operadoresRelacionais 
{
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual a numero 2? \n" +simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do numero 2? \n" +simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior que numero 2? \n"+simNao);

        //OBJETOS (comparação de objetos)

        String nome1 = "Viviana"; 
        String nome2 = "Viviana";

        System.out.println(nome1 == nome2);

        //situação2: uso do método "equals", compara o conteúdo dos objetos.

        String objeto1 = "Cachorro";
        String objeto2 = "Gato";

        System.out.println(objeto1.equals(objeto2));

    }
}