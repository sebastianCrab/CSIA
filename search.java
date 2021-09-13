import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class search extends JFrame {
	
	public search() {
		super("search");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400); 
	}
	
	
	private JTextField textField;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new search();
            }
        });
		
	}

	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Type");
		lblNewLabel.setBounds(160, 141, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(160, 202, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(271, 137, 173, 27);
		getContentPane().add(comboBox);
		textField = new JTextField();
		textField.setBounds(271, 197, 173, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		
		
	}
}
    