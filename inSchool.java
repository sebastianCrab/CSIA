import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class inSchool extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new inSchool();
            }
        });

	}
	
	public inSchool() {
		super("inSchool");
        this.init();
        this.setVisible(true);
        this.setSize(600, 400); 
	}
	
	void init() {
		getContentPane().setLayout(null);
		
		
	}

}
