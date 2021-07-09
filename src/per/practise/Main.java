package per.practise;

import java.util.Deque;
import java.util.LinkedList;

//public class Main {
//    public static void main(String[] args) {
//        String hex = toHex(12500);
//        if (hex.equalsIgnoreCase("30D4")) {
//            System.out.println("测试通过");
//        } else {
//            System.out.println("测试失败");
//        }
//    }
//
//    // 整数转16进制
//    static String toHex(int n) {
//    	Deque<String> dq = new LinkedList<>();
//    	String cur = "";
//    	String result = "";
//    	while(n > 0) {
//    		int tmp = n%16;
//    		switch(tmp)
//    		{
//    			case 15:cur="F";
//    			break;
//    			case 14:cur="E";
//    			break;
//    			case 13:cur="D";
//    			break;
//    			case 12:cur="C";
//    			break;
//    			case 11:cur="B";
//    			break;
//    			case 10:cur="A";
//    			break;
//    			default:cur=String.valueOf(tmp);
//    			break;
//    		}
//    		dq.push(cur);
//    		n = n/16;
//    	}
//    	while(!dq.isEmpty()) {
//    		result = result + dq.pop();
//    	}
//        return result;
//    }
//}

public class Main {
    public static void main(String[] args) {
        String exp = "1 + 2 * (9 - 5)";
        SuffixExpression se = compile(exp);
        int result = se.execute();
        System.out.println(exp + " = " + result + " " + (result == 1 + 2 * (9 - 5) ? "✓" : "✗"));
    }

    static SuffixExpression compile(String exp) {
        // TODO:
        return new SuffixExpression();
    }
}

class SuffixExpression {
    int execute() {
        // TODO:
        return 0;
    }
}
