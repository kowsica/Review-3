package review3;

public class SpecialCharRemove {

	public static void main(String[] args) {
	String line = "*&*&* Hi ()@$%^ how @%^&* are $# you";
	line = line.replaceAll("[^a-zA-Z]"," ");
	System.out.println(line);
	

	}

}
