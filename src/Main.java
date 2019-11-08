import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//
//public class Main {
//          苹果只有8个和6个袋子装的，返回最少的袋子数，每个袋子都装满，若不满足则返回-1
//    public static void main(String[] args) {
//        int count = 0 ;
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        if(n<1||n>100){
//            System.out.println(-1);
//            return;
//        }
//        if(n%2!=0||n==10||n<6){
//            System.out.println(-1);
//            return;
//        }
//        if(n%8 == 0){
//            System.out.println(n/8);
//            return;
//        }
//        System.out.println(1+n/8);
//    }
//}
public class Main{
    // 在一个字符串中删除另一个字符串
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        StringBuilder res = new StringBuilder();
     Map<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i<s2.length() ; i++){
            map.put(s2.charAt(i),map.getOrDefault(s2.charAt(i),0)+1);
        }
        int j = 0;
        for(int i = 0 ; i <s1.length() ;i++ ){
          if(!map.containsKey(s1.charAt(i))){
              res.append(s1.charAt(i));
          }
        }
        System.out.println(res);
    }
}