public class FizzBuzz {
    private int number;
    public String Comprobar(int number){
        String mode;
        this.number = number;
        if (number % 3 == 0 && number % 5 == 0) {
            return mode = "FizzBuzz";
        } else if (number % 3 == 0) {
            return mode = "Fizz";
        } else if (number % 5 == 0) {
            return mode = "Buzz";
        } else {
            return null;
        }
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }


}
