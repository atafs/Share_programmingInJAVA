package control_3CD.Start_PCD_week02._2_1_MaquinadeCalcular;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorFromScratch extends JFrame {
	
	//ATTRIBUTES
	private static final long serialVersionUID = 1L;
	private JFrame container;
	private JTextField display;
	private String displayContext = "";
	
	private boolean flagIsFirstNumber = true;
	private boolean flagIsCountMade = true;
	private double firstNumber = 0.0;
	private double secondNumber = 0.0;
	private char operation;
	
	//CONSTRUCTOR	
	public CalculatorFromScratch() {
		container = new JFrame();
		
		// Create panel p1 for the buttons and set GridLayout
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(4, 4));

		//BUTTONS
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");
		JButton plus = new JButton("+");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton minus = new JButton("-");
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton multiply = new JButton("*");
		JButton zero = new JButton("0");
		JButton dot = new JButton(".");
		JButton chapeu = new JButton("^");
		JButton divide = new JButton("/");
		
		JButton clean = new JButton("C");
		JButton total = new JButton("=");

		
		//LISTENERS
		p1.add(seven);
		seven.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("7");
				displayContextInTextfield(7.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(7.0);
				

			}
		});
		
		p1.add(eight);
		eight.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("8");
				displayContextInTextfield(8.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(8.0);
				
				
			}
		});
		
		p1.add(nine);	
		nine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("9");
				displayContextInTextfield(9.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(9.0);
				
			}
		});
		
		p1.add(plus);
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("+");
				displayContextInTextfield('+');
				//ONLY WORKS FOR TWO NUMBERS: OPERATION
				keepOperationTwoNumersOnly('+');
				

			}
		});
		
		// ADD 4,5,6,-
		p1.add(four);
		four.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("4");
				displayContextInTextfield(4.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(4.0);
				
			}
		});
		
		p1.add(five);
		five.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("5");
				displayContextInTextfield(5.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(5.0);
				
			}
		});
		
		p1.add(six);
		six.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("6");
				displayContextInTextfield(6.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(6.0);
				
			}
		});
		
		p1.add(minus);
		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("-");
				displayContextInTextfield('-');
				//ONLY WORKS FOR TWO NUMBERS: OPERATION
				keepOperationTwoNumersOnly('-');
				

			}
		});
		
		// ADD 1,2,3,*
		p1.add(one);
		one.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("1");
				displayContextInTextfield(1.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(1.0);
				
			}
		});
		
		p1.add(two);
		two.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("2");
				displayContextInTextfield(2.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(2.0);
				
			}
		});
		
		p1.add(three);
		three.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("3");
				displayContextInTextfield(3.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(3.0);
				
			}
		});
		
		p1.add(multiply);
		multiply.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("*");
				displayContextInTextfield('*');
				//ONLY WORKS FOR TWO NUMBERS: OPERATION
				keepOperationTwoNumersOnly('*');
				

			}
		});
		
		// ADD 1,2,3,*
		p1.add(zero);
		zero.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("0");
				displayContextInTextfield(0.0);
				//ONLY WORKS FOR TWO NUMBERS
				keepNumberForTwoNumersOnly(0.0);
				
			}
		});
		
		p1.add(dot);
		dot.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println(".");
				displayContextInTextfield('.');
				

			}
		});
		
		p1.add(chapeu);
		chapeu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("^");
				displayContextInTextfield('^');
				

			}
		});
		
		p1.add(divide);
		divide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//CHECK IF THERE ID THE NEED TO CLEAN DISPLAY
				cleanDisplayToNewCount();
				System.out.println("/");
				displayContextInTextfield('/');
				//ONLY WORKS FOR TWO NUMBERS: OPERATION
				keepOperationTwoNumersOnly('/');
				

			}
		});
		
		// Create panel p2 to hold a text field and p1
		JPanel p2 = new JPanel(new BorderLayout());
		p2.setLayout(new GridLayout(2, 1));

		//SEPARETE BUTTONS
		p2.add(clean);
		clean.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				displayContext = "";
				display.setText(displayContext);
			}
		});
		
		p2.add(total);
		total.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				//LOCAL VARIABLES
				char key = operation;
				double sum = 0.0;
				
				switch (key) {
				case '+':
					sum = plusValues(firstNumber, secondNumber);
					flagIsCountMade = true;
					flagIsFirstNumber = true;
					break;
					
				case '-':
					sum = subtractValues(firstNumber, secondNumber);
					flagIsCountMade = true;
					flagIsFirstNumber = true;
					break;
					
				case '*':
					sum = multiplyValues(firstNumber, secondNumber);
					flagIsCountMade = true;
					flagIsFirstNumber = true;
					break;
					
				case '/':
					sum = divideValues(firstNumber, secondNumber);	
					flagIsCountMade = true;
					flagIsFirstNumber = true;
					break;
					
				default:
					System.out.println("STILL NEEDS MORE OPERATIONS");
					break;
				}
				
				displayContext = String.valueOf(sum);
				display.setText(displayContext);
				
			}
		});
	
		//DISPLAY
		display = new JTextField("write values");
		display.setBackground(Color.GREEN);
		Font bigFont = display.getFont().deriveFont(Font.PLAIN, 70f);
		display.setFont(bigFont);
		
		// Add contents to the frame
		container.setLayout(new BorderLayout());
		container.add(p1, BorderLayout.WEST);
		container.add(p2, BorderLayout.EAST);
		container.add(display, BorderLayout.CENTER);
	}
	
	/** */
	public void init(JFrame frame) {
		frame.setTitle("CALCULATOR ISCTE IUL");
		frame.setSize(800, 300);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	/** */
	public void execute(Frame frame) {
		frame.setVisible(true);
	}
	
	//OPERATIONS	
	/** */
	public double plusValues(double value1, double value2) {
		return value1 + value2;
	}
	
	/** */
	public double subtractValues(double value1, double value2) {
		return value1 - value2;

	}
	
	/** */
	public double multiplyValues(double value1, double value2) {
		return value1 * value2;

	}
	
	/** */
	public double divideValues(double value1, double value2) {
		return value1 / value2;

	}
	
	/** */
	public void keepNumberForTwoNumersOnly(double number) {
		//ONLY WORKS FOR TWO NUMBERS
		if (flagIsFirstNumber) {
			firstNumber = number;
			flagIsFirstNumber = false;
		} else {
			secondNumber = number;
		}
	}
	
	/** */
	public void keepOperationTwoNumersOnly(char type) {
		operation = type;
	}
	
	/** */
	public void displayContextInTextfield(double number) {
		displayContext += number;
		display.setText(displayContext);
	}
	
	/** */
	public void displayContextInTextfield(char operation) {
		displayContext += operation;
		display.setText(displayContext);
	}
	
	/** */
	public void cleanDisplayToNewCount() {
		if (flagIsCountMade) {
			displayContext = "";
			display.setText(displayContext);
			flagIsCountMade = false;
		}
	}

	//MAIN
	public static void main(String[] args) {
		CalculatorFromScratch gui = new CalculatorFromScratch();
		JFrame frame = gui.container;
		gui.init(frame);
		gui.execute(frame);	
	}
}