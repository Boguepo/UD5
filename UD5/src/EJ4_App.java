import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ4_App {
	public static void main (String args[]) {
		String val = JOptionPane.showInputDialog("Introduce el radio:");
		double radio = Double.parseDouble(val);
		
		JOptionPane.showMessageDialog(null, "El area del circulo es: "+Math.PI*(Math.pow(radio, 2)));
	}
}
