package programmers.programmers.java.devMatching;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class toothbrush_20230719 {
    public static int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {
        int[] answer = new int[enroll.length];
        Map<String, Integer> memberInfo = new HashMap<>();
        Map<String, Stack<Integer>> sellAmount = new HashMap<>();
        Stack<String> sell = new Stack<>();
        Stack<String> parent = new Stack<>();
        //<me, parent>
        Map<String, String> tree = new HashMap<>();

        for(int i=0; i<enroll.length; i++){
            memberInfo.put(enroll[i], i);
        }

        for(String s : seller) sell.add(s);

        for(int i = 0; i<referral.length; i++){
            tree.put(enroll[i], referral[i]);
        }
        for(int i=0; i<seller.length; i++){
                sellAmount.putIfAbsent(seller[i], new Stack<>());
            sellAmount.get(seller[i]).add(amount[i]);
        }

        while(!sell.isEmpty()){
            String sellerName = sell.pop();
            int selleAmount = sellAmount.get(sellerName).pop();

            answer[memberInfo.get(sellerName)] += selleAmount * 90;

            int ref = selleAmount * 10;
            parent.add(tree.get(sellerName));

            while (!parent.isEmpty()){
                String name = parent.pop();
                if(!tree.containsKey(name) || ref == 0) break;

                answer[memberInfo.get(name)] += (ref - ref/10);
                ref /= 10;
                parent.add(tree.get(name));
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        String[] e1 = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] r1  = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
//        String[] s1 = {"young", "john", "tod", "emily", "mary"};
        String[] s1 = {"emily", "john", "tod", "emily"};

        String[] e2 = {"john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"};
        String[] r2  = {"-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"};
        String[] s2 = {"sam", "emily", "jaimie", "edward"};

//        int[] a1 = {12, 4, 2, 5, 10};
        int[] a1 = {2, 1, 1, 2};
        int[] a2 = {2, 3, 5, 4};

        int[] o1 = solution(e1, r1, s1, a1);
        int[] o2 = solution(e2, r2, s2, a2);

        for (int o : o1){
            System.out.print(o + " ");
        }
        System.out.println();
//        for (int o : o2){
//            System.out.print(o + " ");
//        }
    }
}
