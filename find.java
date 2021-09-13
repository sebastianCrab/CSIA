import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JComboBox;

public class find extends JFrame {

public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new find();
            }
        });
		
	}
	
	public find() {
		super("find");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("yo");
		lblNewLabel.setBounds(257, 129, 61, 16);
		getContentPane().add(lblNewLabel);
		
	}

}
