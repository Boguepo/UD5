import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ1_App {
	public static void main (String args[]) {
		String value1 = JOptionPane.showInputDialog("Primer numero: ");
		int num1 = Integer.parseInt(value1);
		
		String value2 = JOptionPane.showInputDialog("Segundo numero:");
		int num2 = Integer.parseInt(value2);
		
		if(num1>num2) {
			JOptionPane.showMessageDialog(null, num1+" es mayor que "+num2);
		}else if(num1<num2) {
			JOptionPane.showMessageDialog(null, num2+" es mayor que "+num1);
		}else {
			JOptionPane.showMessageDialog(null, "Los numeroson iguales");
		}
	}
}
