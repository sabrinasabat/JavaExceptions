import java.sql.SQLOutput;

public class TratamientoExcepciones {

    public static void main(String[] args){
        int a = 2, b = 0;

        try{
            System.out.println(a/b);
        } catch(Exception ex){
            System.out.println("Error de división entre cero");
        }

        System.out.println("La aplicación continua");
    }
}
