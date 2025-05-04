import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int decision = 0;
        int amount;
        ConsultaConversion consulta = new ConsultaConversion();
        String menu = """
                *********************************************************
                Sea bienvenido/a al conversor de monedas =)
                
                1) Peso chileno => Dolar
                2) Dolar => Peso chileno
                3) Peso chileno => Peso argentino
                4) Peso argentino => Peso chileno
                5) Pero argentino => Dolar
                6) Dolar => Peso argentino
                7) Salir
                Elija una opción valida:
                *********************************************************
                """;

        while (decision != 7) {
            System.out.println(menu);
            decision = teclado.nextInt();
            switch (decision) {
                case 1:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI pesoChilenoADolar = consulta.buscarConversion("CLP","USD",amount);
                    System.out.println(pesoChilenoADolar);
                    break;
                case 2:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI dolarAPesoChileno = consulta.buscarConversion("USD","CLP",amount);
                    System.out.println(dolarAPesoChileno);
                    break;
                case 3:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI pesoChilenoAPesoArgentino = consulta.buscarConversion("CLP","ARS",amount);
                    System.out.println(pesoChilenoAPesoArgentino);
                    break;
                case 4:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI pesoArgentinoAPesoChileno = consulta.buscarConversion("ARS","CLP",amount);
                    System.out.println(pesoArgentinoAPesoChileno);
                    break;
                case 5:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI pesoArgentinoADolar = consulta.buscarConversion("ARS","USD",amount);
                    System.out.println(pesoArgentinoADolar);
                    break;
                case 6:
                    System.out.println("Ingresa el valor que quieres convertir:");
                    amount = teclado.nextInt();
                    ConversionERAPI dolarAPesoArgentino = consulta.buscarConversion("USD","ARS",amount);
                    System.out.println(dolarAPesoArgentino);
                    break;
                case 7:
                    System.out.println("Muchas gracias por elegirnos, vuelva pronto!");
                    break;
                default:
                    System.out.println("Elija un número valido por favor");
                    break;
            }
        }
    }
}
