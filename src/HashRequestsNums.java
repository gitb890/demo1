import java.util.HashSet;
import java.util.Scanner;

public class HashRequestsNums {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入：");
//        int a = scanner.nextInt();

        int[] nums = new int[]{1,2,3,4,5,6,7};
        HashSet<Integer> dic = new HashSet<>();
        for (int num:nums){
            if (dic.contains(num)) {
                System.out.print("this is:"+num);
            }
            dic.add(num);
        }
        System.out.println(nums.hashCode());;
    }
}
