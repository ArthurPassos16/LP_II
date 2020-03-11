package lista1;

import java.util.Scanner;

public class questao1 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(final String[] args) throws Exception {
        double km, litros, totalKM = 0, consumo=0;
        int cont=1;
        String resp = "S";

        do {
            System.out.println("Informe os quilômetros:");
            km = entrada.nextDouble();
            System.out.println("Informe os litros de gasolina:");
            litros = entrada.nextDouble();

            consumo = consumo + litros; 
            totalKM = totalKM + km;
            System.out.println("Carro: " + cont + " Quilometragem:" + km/litros);
            
            System.out.println("Quer continuar (S/N)?");
            resp = entrada.next();
        }while(resp.equals("S") | resp.equals("s"));

        System.out.println("Litros consumidos: " + consumo);
        System.out.println("Quilometragem total: " + totalKM/consumo);

    }
}