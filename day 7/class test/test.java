import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                if(i==0||str.charAt(i-1)==' ') count++;
            }
        }
        System.out.println(count);
    }
}
