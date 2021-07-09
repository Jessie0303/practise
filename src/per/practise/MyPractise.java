package per.practise;

public class MyPractise {

	public double getScore(int old,int fresh) {
		double oldd = old;
		double freshd = fresh;
		double result = (freshd-oldd)/oldd*100;
		
		return result;
	}
	
	public static void main(String[] args) {
		MyPractise my = new MyPractise();
		String re = String.format("%.2f", my.getScore(90, 80))+"%";
		System.out.println(re);
	}
}
