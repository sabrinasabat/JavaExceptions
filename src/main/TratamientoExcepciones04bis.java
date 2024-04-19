public class TratamientoExcepciones04bis {

    public static void main(String[] args){

        String[] mensajes = {"En un lugar", null, " de cuyo nombre", " no quiero acordarme", " no ha mucho tiempo"};

        try{
            for(int i=0; i<5; i++){
                System.out.println(mensajes[i].toUpperCase());
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.err.println("Tratamiento particular a las excepciones ArrayIndex...");
        } catch (NullPointerException ex){
            System.err.println("Tratamiento particular a las excepciones NullPonter");
        }

        System.out.println("Mensaje final");
    }
}
