public class OperacionesTDD {
    public String calc(String a){
        if (a.equals("")) {
            return "0";
        }else {
            return a;
        }
    }
    public int calc(int a, int b){
        if (a < 0 || b < 0){
            return -1;
        }
        return a + b;
    }
    public int calc(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0){
            System.out.println("Numero negativo no permitido");
            return -1;
        }
        return a + b + c;
    }



}
