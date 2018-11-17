import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener{
	public static void main(String[] args) {
		NastySurprise NS = new NastySurprise();
	}
	
	public NastySurprise() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();	
		frame.add(panel);
		JButton trick = new JButton();
		frame.add(panel);		
		trick.addMouseListener(this);
		panel.add(trick);
		JButton treat = new JButton();
		panel.add(treat);
		treat.addMouseListener(this);
		JLabel label = new JLabel();
		label.setText("Trick");
		trick.add(label);
		JLabel labels = new JLabel();
		labels.setText("Treat");
		treat.add(labels);
	}
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
