public class Main {
    public static void main(String[] args) {
        System.out.println(computeFibonacci(5));
    }



    public static int computeFibonacci(int n) {
        int value = 0;
        if(n > 2){
            return value = computeFibonacci(n-1) + computeFibonacci(n-2);
        }
        else{
            return n;
        }

    }

}

