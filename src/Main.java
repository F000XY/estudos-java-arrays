import java.util.Scanner;
import Pessoa.Pessoa;
public class Main
{
    public static void array()
    {
        int n = 10;
        int array[] = new int [n];
        int maior = array[0];
        int menor = array[0];
        int soma = 0;
        for(int i = 0; i < n; i++)
        {
            array[i] = i;
            soma += array[i];
            // acumulador soma
            if (array[i] > maior)
            {
                maior = array[i];
            }
            else if (array[i] < menor)
            {
                menor = array[i];
            }
        }
        for(int i = 0; i < n; i++)
        {
        //    System.out.println(array[i]);
            if (array[i]== maior)
            {
                System.out.println("Maior numero" + array[i]);
            }
            else if (array[i] == menor)
            {
                System.out.println("Menor numero" + array[i]);
            }
        }
    }
    public static void arrayString()
    {
        String array [] = {"nathy", "linda"};
        //int n= array.length;
        for(String i : array)
        {
            System.out.println(i);
        }

    }
    public static void matrizBidimensional()
    {
        int array [][] = new int [6][2];
        for(int i = 0; i < array.length; i++){
            System.out.println("linha" + (i+1));
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = i+j;
                System.out.println(array[i][j]);
            }
        }
    }

    public static void inserirMatriz() {
        //criação matriz
        Scanner ler = new Scanner(System.in);
        int array[][] = new int[2][2];

        // Inserir valores na matriz
        for (int i = 0; i < array.length; i++) {
            System.out.println("Informe os valores da Linha " + (i + 1));
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ler.nextInt();
            }
        }

        // Imprimir valores da matriz
        System.out.println("Valores da matriz:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();  // Mover para a próxima linha após imprimir uma linha da matriz
        }

        ler.close();
    }

    public static void arrayTipado()
    {
        Pessoa listaPessoas[] = new Pessoa[3];

        listaPessoas[0] = new Pessoa();
        listaPessoas[0].nome = "Nathy";
        listaPessoas[0].idade = 22;
        listaPessoas[0].altura = 1.56;
        listaPessoas[0].peso = 48.0;

        listaPessoas[1] = new Pessoa();
        listaPessoas[1].nome = "Linda";
        listaPessoas[1].idade = 22;
        listaPessoas[1].altura = 1.56;
        listaPessoas[1].peso = 48.
        listaPessoas[2] = new Pessoa();0;

        listaPessoas[2].nome = "Nathy";
        listaPessoas[2].idade = 22;
        listaPessoas[2].altura = 1.56;
        listaPessoas[2].peso = 48.0;
        for(int i=0; i<listaPessoas.length; i++)
        {
            System.out.println("Nome:" + listaPessoas[i].nome);
            System.out.println("Idade:" + listaPessoas[i].idade);
            System.out.println("Altura:" + listaPessoas[i].altura);
            System.out.println("Peso:" + listaPessoas[i].peso);
            System.out.println();
        }

    }

    public static void main(String[] args)
    {
           // arrayString();
          //  array();
         // matrizBidimensional();
        // inserirMatriz();
        arrayTipado();

    }
}