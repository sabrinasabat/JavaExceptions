public class TratamientoExcepciones05 {

    public static void main(String[] args){

        try{
            int a = 2;
            int b = 0;

            int resultado = a/b;
            String mensaje = null;

            System.out.println(mensaje.length());
        } catch(ArithmeticException ex){
            System.err.println("Error de división: "+ ex.getMessage());
        } finally{
            System.out.println("\nSe ha producido un error inesperado.");
        }
    }
}
