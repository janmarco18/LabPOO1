public class Ciclos {
    public static void main(String [] args) {
        String mensaje = "";
        elwhile: 
        while (true){
            int n = (int)(Math.random()*10);
            int m = (int)(Math.random()*1000);
            switch (n){
                case 9:
                case 6:
                case 3: // Verificar si "m" es multiplo de "n"
                    mensaje = (esMultiplo(m,n))?
                        (m+" Es multiplo de "+n):
                        (m+" No es multiplo de "+n);
                    break;
            }
        }
    }
    public static boolean esMultiplo( int m, int n ){
        return m%n==0;
    }
    public static boolean esPar(int m){
        return esMultiplo(m,2);
    } 
    public static boolean esPrimo(int m){
        for (int i = 2; i < m; i++)
        {
            if(esMultiplo(m,i)){
                return false;
            }
        }
        return true;
    }
}
