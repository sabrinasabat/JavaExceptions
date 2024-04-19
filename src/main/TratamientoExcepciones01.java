public class TratamientoExcepciones01 {

    public static void main(String[] args){


        try{
            int a = 2, b = 0;
            System.out.println(a/b); // Error de división entre 0
        } catch(ArithmeticException ex){
            System.err.println("Error: " + ex.getMessage());
        }

        System.out.println("\nMensaje tras la división");
    }
}
