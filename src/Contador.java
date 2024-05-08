import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner entr = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = entr.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = entr.nextInt();

        try {
            contar(parametroUm, parametroDois);

        }catch (ParametroInvalidosExcepetion e) {   

            }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosExcepetion {
        //Aqui é validado se o 1° parametro é maior que o segundo. Sendo maior ele gera uma exceção baseada na regra
        if (parametroUm > parametroDois) {
            throw new ParametroInvalidosExcepetion();
        }else{
            //Se não, ele faz a contagem dos números do parametroUm até o parametroDois
             int contagem = parametroDois - parametroUm;

             for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + (parametroUm+1)));
            }
        }
    }
}
