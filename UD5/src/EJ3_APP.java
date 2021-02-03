import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ3_APP {
	public static void main (String args[]) {
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		JOptionPane.showMessageDialog(null, "bienvenido "+nombre);
	}
}
