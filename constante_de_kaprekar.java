package controlador;

import java.util.*;

public class Solution {

    public static void casoDePrueba(Scanner in) {
        String numero = in.nextLine();

        // Validar que se introduzcan números de 4 dígitos
        while (!numero.matches("\\d{4}")) {
            numero = in.nextLine();
        }

        int intentos = 0;

        while (!numero.equals("6174")) {
            char[] ordenados = numero.toCharArray();
            Arrays.sort(ordenados);
            String sOrdenados = new String(ordenados);
            String sInvertidos = new StringBuilder(sOrdenados).reverse().toString();

            int nOrdenado = Integer.parseInt(sOrdenados);
            int nInvertidos = Integer.parseInt(sInvertidos);

            if ((nInvertidos - nOrdenado) == 0) {
                intentos = 8;
                break;
            } else {
                numero = String.format("%04d", nInvertidos - nOrdenado);
                intentos++;
            }
        }

        System.out.println(intentos);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numCasos = in.nextInt();
        in.nextLine(); // Consumir la línea restante

        for (int i = 0; i < numCasos; i++) {
            casoDePrueba(in);
        }
    }
}