import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;



public class mainFrame extends JFrame {
	


	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new mainFrame();
            }
        });
		
	}
			
	public mainFrame() {
		super("mainFrame");
        this.init();
        this.setVisible(true);
        this.setSize(600, 350);
		
	}
		
	void init() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Duke of Edinburg International Award Database");
		lblNewLabel.setBounds(141, 107, 299, 16);
		getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Student");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkStudent cs = new checkStudent (); 
				cs.show();
				dispose();
			}
		});
		
		btnNewButton.setBounds(226, 174, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Equipments");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkEquipment ce = new checkEquipment (); 
				ce.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(226, 234, 117, 29);
		getContentPane().add(btnNewButton_1);
		
			
	
	}
}
