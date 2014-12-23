import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 * Napravite program koji pita korisnika koliko ima godina, a
 * poslije toga mu ispisuje poruku "Dobro dosao u klub" ako je punoljetan,
 *  odnosno "Cao" ako nije.
 * 
 * @author eminamuratovic
 *
 */
public class Question {

	public static void main(String[] args) {
		MouseButtonListener otherMesagge = new MouseButtonListener();
		MouseButtonListener2 otherMesagge2 = new MouseButtonListener2();
		
		/*
		 * Napravili smo prozor kojem smo dodijelili ime
		 * "Age Test koji ima svoje dimenzije 400 x 200 u kojem se nalazi poruka "
		 * Imate li 18 godina" i dugmici "yes" i "no"
		 */
		JFrame mainWindow = new JFrame("Age Test");
		mainWindow.setSize(400, 200);
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel question = new JLabel("                  							Do you have more than 18 years ?");
		mainWindow.add(question);  //Postavljamo pitanje u prozor Age Test
		mainWindow.setVisible(true);
		
		/*
		 * Na ovaj način pravimo dugme "Yes" koje ima određenu veličinu i
		 * lokaciju u prozoru
		 */
		JButton okButton = new JButton("Yes");
		mainWindow.add(okButton);
		okButton.setSize(60, 25);
		okButton.setLocation(50, 110);
		okButton.setVisible(true);
		
		/*
		 * Na ovaj način pravimo dugme "No" koje ima određenu veličinu i
		 * lokaciju u prozoru
		 */
		JButton okButton1 = new JButton("No");
		mainWindow.add(okButton1);
		okButton1.setSize(60, 25);
		okButton1.setLocation(250, 110);
		okButton1.setVisible(true);
		okButton.addMouseListener(otherMesagge);
		okButton1.addMouseListener(otherMesagge2);

	}//Kraj main-a

	/**
	 * Klasa ima zadatak da u slučaju ako korisnik nakon pitanja
	 * "jesi li punoljetan ?", klikne " da " ispiše poruku
	 * "Dobrodošsao u klub!"
	 * 
	 * @author eminamuratovic
	 *
	 */
	public static class MouseButtonListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			JOptionPane.showMessageDialog(null, "Wellcome in club!!");
		}

		@Override
		public void mousePressed(MouseEvent e) {
	
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
		
		}

	}//Kraj Klase MouseButtonListener

	/**
	 * Klasa ima zadatak da u slučaju ako korisnik nakon pitanja
	 * "jesi li punoljetan ?", klikne " ne " ispiše  poruku "Ćao Ćao!"
	 * 
	 * @author eminamuratovic
	 *
	 */
	public static class MouseButtonListener2 implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			
			JOptionPane.showMessageDialog(null, "Bye Bye :)");
		}

		@Override
		public void mousePressed(MouseEvent e) {
		
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			
		}

	}//Kraj Klase MouseButtonListener2

}//Kraj Klase AgeTestGUI