
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class Kata {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException{  
        Numeros numero;
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int num;
	String resultado;
        System.out.print("Ingrese numero : ");
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a traducir: "));
		numero = new Numeros(num);
		resultado = numero.convertirLetras(num);
		JOptionPane.showMessageDialog(null, resultado);
	}	
    }
    
