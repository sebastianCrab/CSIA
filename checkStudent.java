import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class checkStudent extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new checkStudent();
            }
        });
		
	}
	
	
	
	
	public checkStudent() {
		super("checkStudent");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);  	
	}
	
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Year");
		lblNewLabel.setBounds(137, 95, 40, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Standard");
		lblNewLabel_1.setBounds(137, 147, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		String[] standards = {"Bronze", "Silver", "Gold"};
		JComboBox comboBox = new JComboBox(standards);
		comboBox.setBounds(307, 143, 150, 27);
		getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(307, 90, 130, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(307, 236, 130, 26);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(137, 241, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
	}
}
