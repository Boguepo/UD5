import javax.swing.JOptionPane;

/*
 * @author Toni Arjona
 * */
public class EJ10_App {
	public static void main(String args[]) {
		String val = JOptionPane.showInputDialog("Numero de ventas");
		int nVentas = Integer.parseInt(val);
		int i=0;
		double totalVentas = 0;
		
		while(i<nVentas) {
			String val1 = JOptionPane.showInputDialog("Venta "+(i+1));
			double precio = Double.parseDouble(val1);
			
			totalVentas += precio;
			i++;
		}
		
		JOptionPane.showMessageDialog(null, "Eltotal es de "+totalVentas);
	}
}
