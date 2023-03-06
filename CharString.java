package review3;

public class CharString {

	public static void main(String[] args) {
		String s ="avbnvvvftua";
		String alp = "abcdefghijklmnopqrstuvwxyz";
		int count =0;
		for(int i =0;i<alp.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(alp.charAt(i)==s.toLowerCase().charAt(j)) {
					count++;
				}
				}
			if(count>0) {
				System.out.println(alp.charAt(i)+ count);
			}
			
			
		}
		
	}
}