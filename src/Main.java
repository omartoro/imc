//INTEGRANTE: Omar Toro

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float peso=0, altura=0, imc =0;

        imc imc1=new imc(peso, altura, imc);
        System.out.print("Ingrese su peso: ");
        peso = entrada.nextFloat();

        System.out.print("Ingrese su altura: ");
        altura = entrada.nextFloat();

        imc1.setPeso(peso);
        imc1.setAltura(altura);

        System.out.println(imc1.toString());
    }
}
