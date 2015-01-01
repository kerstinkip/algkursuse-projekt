package ladina;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ladina {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Programm Ladina alustab tööd");
		
		//Teeme põhiakna
		JFrame mainWindow = new JFrame("Sõnadetöö ladina keeles");
		Container mainPanel = mainWindow.getContentPane();
		mainPanel.setLayout(new BorderLayout());
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //siis sulgeb programmi automaatselt, kui akna kinni panen 
		
		//Teeme paneeli, kus toimub põhiaction		
		JLabel newLabel2 = new JLabel("Täitsa uus tekst");
		int rows = 10;
		JPanel translatePanel = new JPanel(new GridBagLayout());
		
		GridBagConstraints c = new GridBagConstraints();
		c.insets = new Insets(10,10,10,10);  //jätab ruumi vahele 

		
		for (int i = 0; i < rows; i++) {
			
			JLabel label = new JLabel("Suvakas");
			JTextField field = new JTextField("Ükskõik"); 
			
			//label ja textfield on olemas, need on nüüd vaja järjest sisse panna
			
			c.gridx = 0; 
			c.gridy = i; // hakkab muutuma ja i sellepärast, et ta käib tsüklis need läbi 
			
			translatePanel.add(label, c);
		
			c.gridx = 1; 
			c.gridy = i; 
			translatePanel.add(field, c);
			
		}
		

		//Paneme kõik kasutajaliideses kokku
		mainPanel.add(newLabel2, BorderLayout.PAGE_START); 
		mainPanel.add(translatePanel, BorderLayout.CENTER); //paneme sildi paneeli sisse
		
		
		//näitame akent ka
		mainWindow.pack();
		mainWindow.setVisible(true);
		

	}

}
