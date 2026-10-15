public class recursionFact {
    public int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        } else {
            return n * factorial(n-1);//recursion call
        }
    }
    public static void main(String[] args){
        recursionFact obj = new recursionFact();
        int result = obj.factorial(5);
        System.out.println("Factorial of 5 is: " + result);
    }
}
