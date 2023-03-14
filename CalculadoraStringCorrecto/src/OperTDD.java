public class OperTDD {
    public static int suma(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }
        String[] numeros = cadena.split(",");
        int resultado = 0;
        for (String numero : numeros) {
            if (numero.isEmpty()) {
                return -1;
            }
            int valor = Integer.parseInt(numero);
            if (valor < 0) {
                System.out.println("Numero negativo");
                return -1;
            }
            if (valor > 1000) {
                System.out.println("Numero mayor a 1000");
                return 5;
            }
            resultado += valor;
        }
        if (cadena.endsWith(",")) {
            return -1;
        }
        return resultado;
    }
}
