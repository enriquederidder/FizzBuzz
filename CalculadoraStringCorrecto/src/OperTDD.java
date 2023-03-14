public class OperTDD {
    public static int suma(String cadena) {
        if (cadena.isEmpty()) {
            return 0;
        }

        String[] numeros = cadena.split(",");
        int resultado = 0;
        for (String numero : numeros) {
            resultado += Integer.parseInt(numero);
        }

        return resultado;
    }

}
