package per.practise;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringJoiner;
  
public class unicConvString {
	
	
	public String conv(int x) {
		String result = "";
		String tmp =  "0000";
		for (int i = 0; i < 4; i++) {
			if (x > 16) {
				result = x % 16 + result;
				x = x / 16;
			} else {
				tmp = tmp.substring(0, 2 - i);
				result = tmp + x + result;
				break;
			}
		}
		return result;
		
	}
	
	public int check(String s) {
		// 存放长度最大的不重复子串
		int max = 0;
        int start =0,end = 0;
        int size = s.length();
        Map<String,Integer> m = new HashMap<>();
        for(end = 0;end < size;end ++){
        	String cur = String.valueOf(s.charAt(end));
        	           
            if(m.containsKey(cur)) {
            	start = Math.max(m.get(cur)+1,start);
            }
            m.put(cur, end); 
            max = Math.max(max, end-start+1);
        }
		return max;
	}
	
	public int getLongestSubstring(String s) {
		int max=0;
		
		return max;
	}
	
	public int findmiss(int start, int end, List<Integer> list) {
		int min = start;
        int max = end;
        int size = list.size();
        int miss = 0;
        boolean flag = false;
 
        if(size > 1){
            for(int k=min;k<=end;k++){
               for(int i:list){
            	   System.out.printf("left:%d,right:%d",k,i);
                   flag = k+1==i?true:false;
                   if(flag){
                       break;
                   }
               }
               if(!flag){
                   return k+1;
               }
               
            }
                
        }
        
        return miss;
	}
	
	
	
	
	public static void main(String[] args) {
		// 请将下面一组int值视为字符的Unicode码，把它们拼成一个字符串：
//		unicConvString uni = new unicConvString();
//		uni.check("abba");
		int a = 72;
		int b = 105;
		int c = 65281;
		char[] ac = Character.toChars(a);
		char[] bc = Character.toChars(b);
		char[] cc = Character.toChars(c);
		String s = Character.toString(ac[0]) + Character.toString(bc[0]) + Character.toString(cc[0]);
		String[] fields = { "name", "position", "salary" };
		StringJoiner jo = new StringJoiner(",");
		for(String field:fields) {
			jo.length();
		}

		System.out.printf(jo.toString());
//
//		final int start = 10;
//        final int end = 20;
//        List<Integer> list = new ArrayList<>();
//        for (int i = start; i <= end; i++) {
//            list.add(i);
//        }
//        // 洗牌算法shuffle可以随机交换List中的元素位置:
//        Collections.shuffle(list);
//        // 随机删除List中的一个元素:
//        int removed = list.remove((int) (Math.random() * list.size()));
//        int found = uni.findmiss(start, end, list);
//        System.out.println(list.toString());
//        System.out.println("missing number: " + found);
//        System.out.println(removed == found ? "测试成功" : "测试失败");
		
	}
}

