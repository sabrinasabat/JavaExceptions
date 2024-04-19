public class Main {
    public static void main (String[] args){
        try{
            int[] myNumber = {1,2,3};
            System.out.println(myNumber[1]);
        } catch (Exception e){ // Solamente se ejecuta si ha ido mal
            System.out.println("Índice fuera de lo permitido");
        } finally { // Funciona sí o sí
            System.out.println("The 'try catch' is finished.");
        }
    }
}