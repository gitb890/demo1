import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inside:");
        int a = scanner.nextInt();

        int res = 0;
        while (a!=0){
            int tmp = a%10;
            if (res>214748364 || res==214748364 && tmp>7){
                return;
            }
            if (res<-214748364 || res==-214748364 && tmp<-8){
                return;
            }
            res = res*10 + tmp;
            a/=10;
            System.out.println(res);
        }
    }


}
