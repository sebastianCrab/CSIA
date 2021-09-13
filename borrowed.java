import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import java.awt.Insets;

public class borrowed extends JFrame {
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new borrowed();
            }
        });
		
		
		
	}
	
	
	public borrowed() {
		super("borrowed");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
		
	}
	
	
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Standard");
		lblNewLabel.setBounds(272, 121, 61, 16);
		getContentPane().add(lblNewLabel);
		
		/*String[] standards = {"Bronze", "Silver", "Gold"};
		JComboBox comboBox = new JComboBox(standards);
		comboBox.setBounds(227, 180, 161, 43);
		getContentPane().add(comboBox);
		*/


	}
}
