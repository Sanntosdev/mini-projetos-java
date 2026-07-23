import java.util.Scanner;
public class Main{


    static int menu(){

        Scanner escolha = new Scanner(System.in);

        System.out.println("======SISTEMA DE GASTOS======");

        System.out.println();

        System.out.println("1 - Adicionar seus gastos ");
        System.out.println("2 - listar seus gastos ");
        System.out.println("3 - calcular seus gastos ");

        System.out.println();

        System.out.print("Escolha sua opção : ");
        int opcao = escolha.nextInt();
        System.out.println("-----------------------------");

        return opcao;



    }
    public static void main(String[] args) {

        Gastos[] gastos = new Gastos[10];
        ControleGastos controleGastos = new ControleGastos(gastos);

        Scanner leitura = new Scanner(System.in);


        String resp;
        do {

            switch (menu()) {

                case 1:

                    controleGastos.adicionargastos();
                    break;

                case 2:
                    controleGastos.listarGastos();
                    break;

                case 3:
                    controleGastos.calcularGastos();
                    break;

            }

            System.out.print("Deseja Realizar mais alguma ação : ");
            resp = leitura.nextLine();

        } while (resp.equalsIgnoreCase("Sim"));


    }
}
