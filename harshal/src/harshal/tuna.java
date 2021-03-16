package harshal;
import javax.swing.JOptionPane;

public class tuna {
	public static void main(String args[]) {
		
		
		String fn = JOptionPane.showInputDialog("enter first number mofo:");
		String sn = JOptionPane.showInputDialog("enter second number mofo:");

		int a = Integer.parseInt(fn);
		int b = Integer.parseInt(sn);
		int sum = a + b;
		
		JOptionPane.showMessageDialog(null,"the addition is "+sum,"title to this", sum);
	}

}
