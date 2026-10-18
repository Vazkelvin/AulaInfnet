import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro();

        System.out.println("Digite a marca do carro:");

        carro1.marca = scanner.nextLine();

        System.out.println("Digite o modelo do carro:");

        carro1.modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do carro:");

        carro1.anofabricacao = scanner.nextInt();

        System.out.println("Digite o preço da fipe do carro:");

        carro1.pipe = scanner.nextDouble();


        carro1.idadecarro();



    }
}