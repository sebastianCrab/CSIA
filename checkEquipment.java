import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class checkEquipment extends JFrame {
	

public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new checkEquipment();
            }
        });
		
	}
	
	
	public checkEquipment() {
		super("checkEquipment");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
	}
	
	
	void init() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Equipment Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				findEquipments fE = new findEquipments (); 
				fE.show();
				dispose();
			}
		});
		btnNewButton.setBounds(217, 119, 178, 37);
		getContentPane().add(btnNewButton);
		
		
		JButton btnEquipmentSort = new JButton("Equipment Sort");
		btnEquipmentSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sortingFrame sF = new sortingFrame ();
				sF.show();
				dispose();
			}
		});
		btnEquipmentSort.setBounds(217, 200, 178, 37);
		getContentPane().add(btnEquipmentSort);
		
		
		
		
	}

}
