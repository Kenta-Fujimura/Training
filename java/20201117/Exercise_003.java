public class Exercise_003 {
    public static void main(String[] args) {
 
        int n = 10;
        int remainder = n % 2;
        String message = "";
 
        switch(remainder) {
        case 0:
            message = "偶数です";
        case 1:
            message = "奇数です";
        }
 
        System.out.println(message);
    }
}
