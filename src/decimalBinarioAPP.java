import javax.swing.JOptionPane;
public class decimalBinarioAPP {

	public static void main(String[] args) {
		String texto=JOptionPane.showInputDialog("Introdice un numero"); //Pedimos el numero
		int numero=Integer.parseInt(texto); //Pasamos el numero a int
		String binario=decimalBinario(numero); //Declaramos ya el binario
		System.out.println("El numero "+numero+" en binario es "+binario); //Solucion final
	}
	public static String decimalBinario (int numero) {
		String binario=""; //
		String digito;
		for(int i=numero;i>0;i/=2) {
			if(i%2==1) {
				digito="1";
			}else {
				digito="0";
			}
			binario=digito+binario;
		}
		return binario;
	}
}
