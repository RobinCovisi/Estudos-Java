public class Compras {
    
    public static void main(String[] args) {
      
        double mesada = 50.0;

        while (mesada >0) {
            Double valorDoce = valorAleatorio ();
            if (valorDoce > mesada)
            valorDoce = mesada;

            System.out.println( "Doce do Valor: " + valorDoce + "Adicionado no Carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Você gastou todo o dinheiro em doce");
    }


    
    private static Double valorAleatorio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valorAleatorio'");
    }

}

