package control_3CD.Start_PCD_week03._3_2_GaleriaDeFotos;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Gallery {
	
	//ATTRIBUTES
	private JFrame window;
	private ImageIcon[] images;
	private int index;

	//CONSTRUCTOR
	public Gallery() {
		loadImages();
		index = 0;
		
		window = new JFrame("GALLERY");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(600, 400);
		
		//LISTS
		final DefaultListModel<String> content = new DefaultListModel<String>();
		
		final JList<String> list = new JList<String>();
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				JOptionPane.showInputDialog(null, "indice="+list.getSelectedIndex());				
			}
		});
		
		//LABEL
		final JLabel image = new JLabel("", SwingConstants.CENTER);
		image.setIcon(images[index]);

		//ICON
		ImageIcon icon = new ImageIcon("control_3CD\\Start_PCD_week03\\_3_2_GaleriaDeFotos\\images\\timor1.jpg");
		
		window.add(image, BorderLayout.CENTER);;
		
		//BUTTON
		JButton next = new JButton("add");
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s = JOptionPane.showInputDialog("HELLO");
				content.addElement(s);
			}
		});
		
		//BUTTON
		JButton previous = new JButton("<");
		next.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index >= images.length) {
					image.setIcon(null);
					image.setText("no image");
				} else {
					image.setIcon(images[index]);
				}
				index++;
				
				
			}
		});
				
		window.add(next, BorderLayout.SOUTH);
		window.add(previous, BorderLayout.NORTH);

	
	}
	
	/** */
	public void loadImages() {
		File root = new File("src\\control_3CD\\Start_PCD_week03\\_3_2_GaleriaDeFotos\\images");
		File[] files = root.listFiles();
		images = new ImageIcon[files.length];
		
		for (int i = 0; i < files.length; i++) {
			images[i] = new ImageIcon(files[i].getAbsolutePath());
			
		}
	}
	
	/** */
	public void open() {
		window.setVisible(true);

	}
	
	/** */
	public static void main(String[] args) {
		new Gallery().open();
	}
	

}
