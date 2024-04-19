public class TratamientoExcepciones04 {
    public static void main(String[] args){

        String[] mensajes = {"En un lugar", null, " de cuyo nombre", " no quiero acordarme", " no ha mucho tiempo viva"};


        try{
            for(int i=0; i<5; i++){
                System.out.println(mensajes[i].toUpperCase());
            }
        } catch (ArrayIndexOutOfBoundsException | NullPointerException ex){ // el nas excepciones el 'or' es solo uno |
            System.err.println("Tratamiento comun a las excepciones");
        }

        System.out.println("Mensaje final");
    }
}
