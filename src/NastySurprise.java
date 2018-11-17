import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements MouseListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();	
	JButton trick = new JButton();
	JButton treat = new JButton();
	JLabel label = new JLabel();
	JLabel labels = new JLabel();
	public static void main(String[] args) {
		NastySurprise NS = new NastySurprise();
	}
	
	public NastySurprise() {
		frame.setVisible(true);
		frame.add(panel);
		frame.add(panel);		
		trick.addMouseListener(this);
		panel.add(trick);
		panel.add(treat);
		treat.addMouseListener(this);
		label.setText("Trick");
		trick.add(label);
		labels.setText("Treat");
		treat.add(labels);
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getSource().equals(trick)) {
			showPictureFromTheInternet("https://s3.amazonaws.com/cdn-origin-etr.akc.org/wp-content/uploads/2017/11/12193133/German-Shepherd-Puppy-Fetch.jpg");
		}
		else if(e.getSource().equals(treat)) {
			showPictureFromTheInternet("https://1.bp.blogspot.com/-ym8M046R3yg/VugWOXBZYRI/AAAAAAAAJYQ/DcVK8wOK0PYsApO73-s6T3_b4IJrpaaLQ/s1600/4A.jpg");
		}
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
