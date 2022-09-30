// Hora de inicio: 08:05am
public class Parcial1 {
    public static void main(String[]args){
        Serie s = new Serie();
        int m = s.genNumero(100);
        int n = s.genNumero(100);
        s.fibo(n);
        System.out.println(n);
    }
}