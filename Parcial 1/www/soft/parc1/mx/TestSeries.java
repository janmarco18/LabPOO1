// Hora de inicio: 08:05am
package www.soft.parc1.mx;
public class TestSeries {
    public static void main(String[]args){
        Serie s = new Serie();
        int m = s.genNumero(10);
        int n = s.genNumero(10);
        s.fibo(int)(Math.random()*m*10);
        s.fibo(int)(Math.random()*n*10);
        System.out.println(n);
        System.out.println(m);
    }
}