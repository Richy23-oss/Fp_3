/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos;

/**
 *
 * @author rosal
 */
public class Eva3_1_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int val1 = 5, val2 = 10;
       //1.Si necesito guardar el valor de retorno 
       int resu = sumarNumeros(val1, val2);//invocar el metodo
        System.out.println("suma de 5 + 10 = " + resu);
        //2. no necesito guardar el valor, solo uno
        System.out.println("suma de 5 + 10 = " + sumarNumeros(val1, val2));
    }
    //MERTODO PARA SUMAR DOS ENTEROS 
    //LLAMAR A SUS METODOS USANDO VERBOS Y ESCRITURA camelCase
    //1. Modificadores de acceso: public, protected, private, default.
    //2. static --- para usar los metodos dentro del main.
    //3. Valor de Retorno: cualquier tipo de dato 
    //void --- si no quieren regresar un valor 
    //4. nombre del metodo(puede ser cualquiera), mismas reglas que identificadores
    //5. lista de parametros: pueden ser cero o N cantidad 
    //1.   2.     3.   4                  5
    public static int sumarNumeros(int num1, int num2){
    int suma = num1 + num2;
    return suma;
    }
}
