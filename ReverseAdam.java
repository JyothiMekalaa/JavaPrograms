import java.util.Scanner;

public class ReverseAdam {
public static int reverse(int n){
    int rev=0;
    while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
    }
    return rev;
}
public static boolean isreverseAdam(int n){
    int rev=reverse(n);
    int sq=rev*rev;
    int resq=reverse(sq);
    int squ=n*n;
    if(squ==resq){
        return true;
    }
    else{
        return false;
    }
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isreverseAdam(n)){
            System.out.println("is a reverseadam number ");
        }
        else{
            System.out.println("is not a reverseadam number ");
        }

    }
}
