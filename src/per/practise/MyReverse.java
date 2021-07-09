package per.practise;

public class MyReverse {
	public int reverse(int x) {
        int result = 0;
        int range = 1;
        for (int i=0;i<31;i++){
            range = range * 2;
        }
        int left = 0-range;
        int right = range - 1;
        int valuex = x;
        
        if(x < 0){
            valuex = 0 - x;
        }
        String valuer = String.valueOf(valuex);
        String re = "";
        int siz = valuer.length();

        for(int i=0;i<siz;i++){
        	re = valuer.substring(i, i+1)+re; 
        }
        result = Integer.valueOf(re);
        if(x < 0){
            result = 0-result;
        }
        if(result<left || result>right){
            return 0;
        }
        
        return result;

    }
	
	public static void main(String args[]) {
		MyReverse rev = new MyReverse();
		int w = rev.reverse(1234567899);
		System.out.print(w);
	}
}
