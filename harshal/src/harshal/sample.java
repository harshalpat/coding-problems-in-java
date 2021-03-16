package harshal;
public class sample{
public static void main(String args[]) {

	int hat[]= {2,3,45,6,7,8};
	change(hat);
	for(int s: hat) {
		System.out.println(s);
	}
}
public static void change (int c[]) {
	for(int x = 0;  x<c.length;x++) {
		c[x]= 5+ c[x];
	}
	
}
}