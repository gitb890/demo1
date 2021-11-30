import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inside:");
        String s = scanner.next();

        HashMap<Character,Integer> str = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (str.get(ch) !=null){
                str.put(ch,str.get(ch)+1);
            }else {
                str.put(ch,1);
            }
        }
        for (Map.Entry entry:str.entrySet()){
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
