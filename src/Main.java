
public class Main {

    public static void main(String[] args) {
        System.out.println("The 45 sequence fibonacci");
        fibonnaciHelper(45, 1, 0, 1);
    }

    public static int fibonnaciHelper(int term, int firstNumberFibo, int secondNumberFibo, int count) {
        if (term < 1) {
            return secondNumberFibo;
        }
        System.out.println(secondNumberFibo);
        System.out.print(": " + count + "   ");
         
        return fibonnaciHelper(term - 1, secondNumberFibo, firstNumberFibo + secondNumberFibo, count + 1);
    }
}
