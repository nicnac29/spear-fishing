import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SpearfishingWindow {
	public static void main(String[] args) throws IOException {
		SpearfishingWindow spearfishing = new SpearfishingWindow();
		spearfishing.window();
	}

	JFrame frame = new JFrame();
	private BufferedImage bufferedimg;
	JPanel panel = new JPanel();

	void window() {
		frame.add(panel);
		frame.setPreferredSize(new Dimension(1280, 750));
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = loadImageFromComputer("spearo.jpg");
	    panel.add(label);
	    frame.pack();
	}
	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
		
	}
	void spearo() throws IOException {
		URL imageURL = ClassLoader.getSystemResource("spearo.jpg");
		bufferedimg = ImageIO.read(imageURL);
	}
}
