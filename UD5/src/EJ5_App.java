import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ5_App {
	public static void main(String args[]) {
		String val= JOptionPane.showInputDialog("Introduce el numero");
		int num = Integer.parseInt(val);
		
		if((num%2)==0) {
			JOptionPane.showMessageDialog(null, "El numero es par");
		}else {
			JOptionPane.showMessageDialog(null, "El numero es impar");
		}
	}
}
