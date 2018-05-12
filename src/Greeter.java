import javax.swing.JOptionPane;

public class Greeter {

public static void main(String[] args) {
	
String Name = JOptionPane.showInputDialog(null, "What Is Your Name?");
JOptionPane.showMessageDialog(null, "Hello " + Name);
}
}
