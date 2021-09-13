import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTable;
import javax.swing.JScrollBar;

public class sortingFrame extends JFrame {
	private JTable table;
	private JTable table_1;
	public sortingFrame() {
		super("sortingFrame");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400);
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new borrowed();
            }
        });

	}
	
	void init() {
		getContentPane().setLayout(null);
		
		table_1 = new JTable();
		table_1.setBounds(80, 53, 447, 280);
		getContentPane().add(table_1);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(512, 53, 15, 280);
		getContentPane().add(scrollBar);
		
		
		
	}
}
