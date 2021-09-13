import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.SwingUtilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class findEquipments extends JFrame {
	
	
    public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new findEquipments();
            }
        });
		
	}
	
	
	
	
	public findEquipments() {
		super("findEquipments");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
        
	}
	
	
	void init() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Need Replaced");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				needReplaced nR = new needReplaced (); 
				nR.show();
				dispose();
				
			}
		});
		btnNewButton.setBounds(236, 81, 128, 37);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("In school");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inSchool iS = new inSchool (); 
				iS.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(243, 149, 117, 37);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Borrowed");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				borrowed b = new borrowed (); 
				b.show();
				dispose();
			}
		});
		btnNewButton_2.setBounds(243, 218, 117, 37);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				search s = new search (); 
				s.show();
				dispose();
				
			}
		});
		btnNewButton_3.setBounds(58, 292, 117, 37);
		getContentPane().add(btnNewButton_3);
		
		
		
	}
}
