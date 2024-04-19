public class TratamientoExcepciones03 {

    public static void main(String[] args){

        try{

            int a = 2;
            int b = 2;

            int resultado = a/b;
            String mensaje = null;

            System.out.println(mensaje.length());
        } catch (ArithmeticException ex){
            System.err.println("Error de división: "+ ex.getMessage());
        } catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Se ha producido un error no esperado");
        }
    }
}
