public class FizzBuzz {
    public String translate(int input) {
        String result = "";
        if (input % 3 == 0) {
            result = "fizz";
        } if (input % 5 == 0) {
            result += "buzz";
        }
        return result == "" ? Integer.toString(input) : result;
    }
}
