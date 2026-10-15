public class recursionF {
    public void printNumbers(int n) {
        if(n==0){
            return;
        } else {
            System.out.println(n);
            printNumbers(n-1);
        }
    }
    public static void main(String[] args){
        recursionF obj = new recursionF();
        obj.printNumbers(5);
    }
}
