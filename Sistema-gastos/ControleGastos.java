import java.util.Scanner;
public class ControleGastos {

    Gastos[] gastos;

    double[] calculo = new double[1];



    Scanner entrada = new Scanner(System.in);

    public ControleGastos(Gastos[] gastos) {

        this.gastos = gastos;
    }

    public void adicionargastos(){

        for (int i = 0; i < gastos.length; i++) {

            gastos[i] = new Gastos();

            System.out.print("Descrição : ");
            gastos[i].setDescricao(entrada.nextLine());

            System.out.print("Valor : ");
            gastos[i].setValor(entrada.nextDouble());

            entrada.nextLine();

            System.out.print("Categoria : ");
            gastos[i].setCategoria(entrada.nextLine());

            System.out.println("--------------------------");

            System.out.print("Deseja continua : ");
            String resp = entrada.nextLine();
            System.out.println("-------------------------");

            if(resp.equalsIgnoreCase("Não")){

                return;
            }




        }
    }

    public void listarGastos(){

        System.out.println("===== RESUMO DOS GASTOS =====");

        for (int i = 0; i < gastos.length; i++) {

            if(gastos[i] == null){

                continue;
            }

            System.out.printf("%s | %.2f | %s | \n" ,
                               gastos[i].getDescricao() ,
                               gastos[i].getValor() ,
                               gastos[i].getCategoria() );


        }

        System.out.println("-------------------------------------------------");

    }

    public void calcularGastos(){

        for (int i = 0; i < calculo.length ; i++) {

            calculo[0] = 0;

            for (int j = 0; j < gastos.length; j++) {

                if(gastos[j] == null){

                    continue;
                }

                calculo[0] += gastos[j].getValor();
                i++;


            }

            System.out.printf("Total de gastos : %.2f%n" , calculo[0]);
            System.out.println("Total de categorias : " + i);

        }
    }


}
