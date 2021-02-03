import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ6_App {
	public static void main (String args[]) {
		final double IVA = 0.21;
		
		String val =  JOptionPane.showInputDialog("Introduce el precio");
		Double precio = Double.parseDouble(val);
		
		JOptionPane.showMessageDialog(null, "El precio total es de "+(precio+(precio*IVA)));
	}
}
