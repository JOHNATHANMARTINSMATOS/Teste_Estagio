
/*5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
b) Evite usar funções prontas, como, por exemplo, reverse; */
import java.util.Scanner;
public class App {
    public static String inverter(String s) {
        String invertida = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            invertida += s.charAt(i);
        }
        return invertida;
    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String string = scanner.nextLine();
        scanner.close();

        String stringInvertida = inverter(string);
        System.out.println("String invertida: " + stringInvertida);
    }
}

