public class ConcatenarTextos {
    public static void main(String[] args) {
        String[] nombres = {"Juan", "Pedro", "Luis", "Maria"};
        String resultado = "";
        
        for (int i = 0; i < nombres.length; i++) {
            resultado += nombres[i];
        }
        
        System.out.println(resultado);
    }
}
