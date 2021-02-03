import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ12_App {
	public static void main(String args[]) {
		String contra = "pepito24";
		boolean acierto = false;
		int intentos = 3;
		
		do {
			String intento = JOptionPane.showInputDialog("Introduce el password\nTe quedan "+intentos+" intentos");
			
			if(contra.equals(intento)) {
				acierto = true;
				break;
			}else {
				JOptionPane.showMessageDialog(null, "Password incorrecto");
				intentos--;
			}
		} while (acierto==false && intentos>0);
		
		if(acierto == true) {
			JOptionPane.showMessageDialog(null, "Enhorabuena!!");
		}else {
			JOptionPane.showMessageDialog(null, "Intentos agotados");
		}
	}
}
