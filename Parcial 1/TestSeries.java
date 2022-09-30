// Hora de inicio: 08:05am
public class TestSeries {
    public static void main(String[]args){
        Serie s = new Serie();
        int m = s.genNumero(100);
        // s.primos(m);
        // int o = s.primoN(m/10);
        // System.out.println(o);
        int n = s.genNumero(100);
        s.fibo(n);
        // int p = s.fiboN(3, 11);
        System.out.println(n);
    }
}
