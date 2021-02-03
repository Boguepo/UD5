import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ13_App {
	public static void main(String args[]) {
		String val1 = JOptionPane.showInputDialog("Primer numero");
		int num1 = Integer.parseInt(val1);
		
		String val2 = JOptionPane.showInputDialog("Segundo numero");
		int num2 = Integer.parseInt(val2);
		
		String operador = JOptionPane.showInputDialog("Que operacion quieres realizar?");
		
		switch(operador) {
		case "+":
			JOptionPane.showMessageDialog(null, "Suma: "+(num1+num2));
			break;
		case "-":
			JOptionPane.showMessageDialog(null, "Resta: "+(num1-num2));
			break;
		case "*":
			JOptionPane.showMessageDialog(null, "Producto: "+(num1*num2));
			break;
		case "/":
			JOptionPane.showMessageDialog(null, "Division: "+(num1/num2));
			break;
		case "^":
			JOptionPane.showMessageDialog(null, "Potencia: "+Math.pow(num1, num2));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, "Residuo: "+(num1%num2));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Operador  erroneo");
			break;
		}
	}
}
