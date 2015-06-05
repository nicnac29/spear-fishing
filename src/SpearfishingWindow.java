import java.awt.BorderLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
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

	void window() {
		JPanel panel = new JPanel();
		frame.add(panel);
		frame.setSize(1280, 750);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image = new ImageIcon("spearo.jpg");
		JLabel label = new JLabel("", image, JLabel.CENTER);
		panel = new JPanel(new BorderLayout());
		panel.add( label, BorderLayout.CENTER );
	}

	void spearo() throws IOException {
		URL imageURL = ClassLoader.getSystemResource("spearo.jpg");
		bufferedimg = ImageIO.read(imageURL);
	}
}
