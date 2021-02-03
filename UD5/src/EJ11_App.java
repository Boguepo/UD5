import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ11_App {
	public static void main(String args[]) {
		String dia = JOptionPane.showInputDialog("Introducce un dia de la semana");
		
		switch(dia) {
		case "Lunes":
		case "Martes":
		case "Miercoles":
		case "Jueves":
		case "Viernes":
			JOptionPane.showMessageDialog(null, "Hoy es laboral");
			break;
		case "Sabado":
		case "Domingo":
			JOptionPane.showMessageDialog(null, "Hoy es festivo");
		}
	}
}
