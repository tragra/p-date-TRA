package es.unileon.prg1.pdate;

public class MainDate {
public static void main(String[] args) {
	
	try {
		Date today = new Date(1, 2, 2017);
		today.setDay(2);
		System.out.println(today.toString());
	} catch (DateException e) {
		System.out.println(e.getMessage());
	}
	
	
}
	
}
