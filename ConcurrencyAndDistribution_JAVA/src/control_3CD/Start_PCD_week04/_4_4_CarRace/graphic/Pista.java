package control_3CD.Start_PCD_week04._4_4_CarRace.graphic;


import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class Pista extends JLabel{

	//ATTRIBUTES
	private int carro1 = 0;
	private int carro2 = 0;
	private int carro3 = 0;
	private int carro4 = 0;
	
	private int x1, x2, x3, x4;
	private int y1, y2, y3, y4;

	
	private final int NUM_STEPS = 15;
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	private ImageIcon icon4;
	
	//CONSTRUCTOR
	public Pista() {
		this.carro1 = 0;
		this.carro2 = 0;
		this.carro3 = 0;
		this.carro4 = 0;
		
		this.icon1 = new ImageIcon(getClass().getResource("/control_3CD/Start_PCD_week04/_4_4_CarRace/fotos/car5.jpg"));
		this.icon2 = new ImageIcon(getClass().getResource("/control_3CD/Start_PCD_week04/_4_4_CarRace/fotos/car6.jpg"));
		this.icon3 = new ImageIcon(getClass().getResource("/control_3CD/Start_PCD_week04/_4_4_CarRace/fotos/car7.jpg"));
		this.icon4 = new ImageIcon(getClass().getResource("/control_3CD/Start_PCD_week04/_4_4_CarRace/fotos/car8.jpg"));
		
	}
	
	//MOVE CAR
	public boolean move(int car) {
		repaint();
		if(car == 1) {
			return (++carro1 == NUM_STEPS);
		} else if(car == 2) {
			return (++carro2 == NUM_STEPS);
		} else if(car == 3) {
			return (++carro3 == NUM_STEPS);
		} else {
			return (++carro4 == NUM_STEPS);
		}
	}
	
	//AUX METHODS
	public void updatePositionCars() {
		x1 = getWidth() / NUM_STEPS * carro1;
		x2 = getWidth() / NUM_STEPS * carro2;
		x3 = getWidth() / NUM_STEPS * carro3;
		x4 = getWidth() / NUM_STEPS * carro4;
	}
	
	public void updateDrawImages(Graphics g) {
		//DRAW
		g.drawImage(icon1.getImage(), x1, y1, null);
		g.drawImage(icon2.getImage(), x2, y2, null);
		g.drawImage(icon3.getImage(), x3, y3, null);
		g.drawImage(icon4.getImage(), x4, y4, null);
	}
	
	public void cleanCounterCars() {
		carro1 = 0;
		carro2 = 0;
		carro3 = 0;
		carro4 = 0;
	}
	
	//PAINT
	public void paint(Graphics g) {
		
		super.paint(g);
		y1 = 1 * getHeight() / 6;
		y2 = 2 * getHeight() / 6;
		y3 = 3 * getHeight() / 6;
		y4 = 4 * getHeight() / 6;
		
		updatePositionCars();
		
		g.drawLine(0, getHeight()/6*1 + icon1.getIconHeight(), getWidth(), getHeight()/6*1 + icon1.getIconHeight());
		g.drawLine(0, getHeight()/6*2 + icon2.getIconHeight(), getWidth(), getHeight()/6*2 + icon2.getIconHeight());
		g.drawLine(0, getHeight()/6*3 + icon3.getIconHeight(), getWidth(), getHeight()/6*3 + icon3.getIconHeight());
		g.drawLine(0, getHeight()/6*4 + icon4.getIconHeight(), getWidth(), getHeight()/6*4 + icon4.getIconHeight());

		//CHECK IF IT THE RACE HAS ENDED
		if (x1 > (getWidth()-NUM_STEPS) || x2 > (getWidth()-NUM_STEPS) || x3 > (getWidth()-NUM_STEPS) || x4 > (getWidth()-NUM_STEPS) ) {
			if (x1 > (getWidth())) {
				g.drawImage(icon1.getImage(), getWidth()-NUM_STEPS, y1, null);
			} else if (x2 > (getWidth())) {
				g.drawImage(icon2.getImage(), getWidth()-NUM_STEPS, y2, null);
			} else if (x3 > (getWidth())) {
				g.drawImage(icon3.getImage(), getWidth()-NUM_STEPS, y3, null);
			} else if (x4 > (getWidth())) {
				g.drawImage(icon4.getImage(), getWidth()-NUM_STEPS, y4, null);
			}
			
			//CLEAN
			cleanCounterCars();
			
			//DRAW
			updateDrawImages(g);

		} else {
			//DRAW
			updateDrawImages(g);
		}
	}
}
