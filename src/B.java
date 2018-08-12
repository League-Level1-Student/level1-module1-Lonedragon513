import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class B implements ActionListener {
	
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		JButton b = new JButton();
		JTextField t = new JTextField(20);
		JLabel l = new JLabel();
	public static void main(String[] args) {
		new B ().m();
		
	
	}
		
	private void m () {
		f.add(p);
		f.setVisible(true);
		f.setTitle("Convert 8 bits of binary to ASCII");
		b.addActionListener(this);
		b.setText("convert");
		p.add(b);
		p.add(t);
		p.add(l);
		f.pack();
		
	}
	 String convert(String input) {
         if(input.length() != 8){
              JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
              return "-";
         }
         String binary = "[0-1]+";    //must contain numbers in the given range
         if (!input.matches(binary)) {
              JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
              return "-";
         }
         try {
              int asciiValue = Integer.parseInt(input, 2);
              char theLetter = (char) asciiValue;
              return "" + theLetter;
         } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
              return "-";
         }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String jo = t.getText();
		String joo = convert(jo);
		l.setText(joo);
		f.pack();
	}
	
	
}
