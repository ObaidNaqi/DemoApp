package in.coursejava.main;

public class MainApp {
    public static void main(String[] args) {
		Integer x = 0;
		Integer y = 0;
		for(Short z = 0; z < 5; z++)
		if((++x > 2) || (++y > 2))
		x++;
		System.out.println(x + " " + y);
		
		StringBuffer sb = new StringBuffer("Obaid");
		int length = sb.append("Naqi").reverse().length();
		System.out.println(length);
		
	} 
}