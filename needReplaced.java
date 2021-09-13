import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class needReplaced extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new needReplaced();
            }
        });

	}
	
	public needReplaced() {
		super("needReplaced");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400); 
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		
	}

}
