
package eva3_3_menu;

import java.util.Scanner;


public class Eva3_3_MENU {

    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion; 
        do{
            imprimirMenu();
            opcion = captu.nextInt();
            if(opcion == 1){
                calcularPotencia();
            }else if (opcion == 2){
                calcularSuma();
            }
        }while(opcion != 3);
    }
    
    public static void imprimirMenu(){
        System.out.println("Bienvenido al sistema");
        System.out.println("selecciona una opcion");
        System.out.println("1. Calcular una potencia");
        System.out.println("2. Sumar dos numeros");
        System.out.println("3. Salir del sistema");
        
    }
    public static void calcularPotencia(){
       Scanner captu = new Scanner (System.in);
       int base, exp;
        System.out.println("******CALCULO DE UNA POTENCIA******");
        System.out.println("Captura la base");
        base = captu.nextInt();
        System.out.println("Captura el exponente");
        exp = captu.nextInt();
        System.out.println(base + "elevado a " + exp + "=" + calcularPot(base, exp));
        
    }
    
    public static int calcularPot (int base, int expo){
        int resu = 1;
        for (int i = 0; i <= expo; i++) {
            resu = resu * base;
        }
        return resu;
    }
    public static int calcularSuma(){
        Scanner captu = new Scanner (System.in);
        int suma1, suma2;
        System.out.println("********CALCULO DE LA SUMA********");
        System.out.println("Calcula la primera suma: ");
        suma1 = captu.nextInt();
        System.out.println("Captura la segunda suma: ");
        suma2 = captu.nextInt();
        System.out.println("la suma es: " + (suma1 + suma2));
    }
}
