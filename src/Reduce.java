public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int num = 100;

        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            step++;
        }
        System.out.println("It takes " + step + " steps to reduce 100 to 0.");
    }
}

