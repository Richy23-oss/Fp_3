
package eva3_4_paso_valor;


public class Eva3_4_PASO_VALOR {

    
    public static void main(String[] args) {
        int valor = 5; 
        System.out.println("valor (antes) = " + valor);
        incrementar(valor);
        System.out.println("valor (despues) = " + valor);
    }
    //Se sumo uno 
    public static void incrementar(int val){
        val = val + 1;
        //(val++)
    }
}
