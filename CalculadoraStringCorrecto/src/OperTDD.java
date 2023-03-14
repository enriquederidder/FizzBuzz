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
                return -1;
            }
            resultado += valor;
        }
        if (cadena.endsWith(",")) {
            return -1;
        }
        return resultado;
    }


}
