package exercises;

public class ZeroAreBoring {

    public static void main(String[] args) {
        System.out.println(zeroBoring(10030));
    }

    public static int zeroBoring(int n) {

        if (n == 0) {
            return n;
        }
        String str = n + "";
        String divide = "";
        for (int i = 0; i < str.length() - 1; i++) {
            int zero = 0;
            divide = divide + zero;
        }
        divide = 1 + divide;
        String temp = (n / Double.parseDouble(divide) + "").replace(".", "");
        int result = Integer.parseInt(temp);
        return result;
    }
}
