package control_3CD.Start_PCD_week03._3_1_DetecaoDeQuadrantes.criarComponents;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;

import com.sun.javafx.scene.paint.GradientUtils.Point;

@SuppressWarnings("serial")
public class CriarComponente extends JComponent {
	
	/* atributos */
		
	@SuppressWarnings("unused")
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("A minha Componente!!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MyPanel());
		frame.pack();
		frame.setVisible(true);
		
	}
	
	/* outras rotinas */
	protected void paintComponent(Graphics g) {
		super.paintComponents(g);
		
//		addMouseListener(new MouseAdapter() {
//			Point point = 
//		
//		});
		
		final int TOTAL_ROW = 10;
		final int SIZE_SQUARE = 50;
		for (int i = 0; i < TOTAL_ROW; i++) {
			g.drawLine(i*SIZE_SQUARE,  i*SIZE_SQUARE,  getWidth(), getHeight());
			g.drawString("HELLO", 200, 100);
			g.drawRect(i*SIZE_SQUARE,  i*SIZE_SQUARE,  getWidth(), getHeight());
			g.drawRect(10, 10, bounds().width-20, bounds().height-20);
//			g.drawImage(new ImageIcon("image\\timor1.jpg").getImage(), x, y, null);
			g.setColor(Color.BLUE);
		}
		repaint();
	}
	
	
//	public void repaint() {
//		repaint();
//	}
	
	public void revalidate() {
		//... changing the componentś structure
	}

}
