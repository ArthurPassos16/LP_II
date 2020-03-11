package lista1;

import java.util.Scanner;

public class questao2 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(final String[] args) throws Exception {
        double valor, comissao = 0;
        String resp = "S";

        do {
            System.out.println("Informe o valor do item:");
            valor = entrada.nextDouble();

            valor = 200 + valor*9/100;
            comissao = comissao + valor;
            
            System.out.println("Quer continuar (S/N)?");
            resp = entrada.next();
        }while(resp.equals("S") | resp.equals("s"));

        System.out.println("Comissão: " + comissao);

    }
}