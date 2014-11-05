import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * The class ScoreGUI contains the graphic user interface for a program to calculate the average weighted score of 4 testscores and their weight.
 * The design is 4 panels, using grid layout, located north, south, east and west.
 * North is a JLabel with instructions.
 * East is 4 text fields for input of test scores.
 * West is 4 text fields for input of weights.
 * South is  a button with the actionperformer to create 2 separate arrays of doubles. then using the class ScoreCalculator to calculate the weighted average.
 * And a text field for displaying the result.
 * @author Michael H. Jakobsen
 * Date: 04. November 2014
 *
 */
public class ScoreGUI extends JFrame implements ActionListener {

	/**
	 * Create static long, containing the serial number of the version.
	 */
	private static final long serialVersionUID = -4531264310145778200L;
	
	/**
	 * Initializing variables; text fields, labels, button and panels
	 */
	public JTextField jtxTestscore1, jtxTestscore2, jtxTestscore3, jtxTestscore4;
	public JTextField jtxWeight1, jtxWeight2, jtxWeight3, jtxWeight4, jtxWeightedAverage;
	JLabel jlWeight, jlTestscore, jlDescription;
	JButton jbtCalculate;
	JPanel panelTestScore, panelWeight, panelButton;
	
	/**
	 * Construct new public method ScoreGUI to create the design of the GUI.
	 */
	public ScoreGUI(){	
		
		/**
		 * Creating 3 panels with grid layout, for test scores, weights, and buttons
		 */
		panelTestScore = new JPanel();
		panelTestScore.setLayout( new GridLayout(5,1) );
		panelTestScore.setBackground(Color.LIGHT_GRAY);
		panelWeight = new JPanel();
		panelWeight.setLayout( new GridLayout(5,1) );
		panelWeight.setBackground(Color.GRAY);
		panelButton = new JPanel();
		panelButton.setLayout(new GridLayout(2,1));

		/**
		 * Create a new label, to explain the user what to do.
		 */
		jlDescription = new JLabel("  Input 4 testscores and their weight, hit button to calculate the weighted average:  ");
		
		/**
		 * Creating 4 text fields for input of test scores, and a label for the column
		 */
		jtxTestscore1= new JTextField(20);
		jtxTestscore2= new JTextField(20);
		jtxTestscore3= new JTextField(20);
		jtxTestscore4= new JTextField(20);
		jlTestscore= new JLabel("  Testscores");
		
		/**
		 * Adding the label and text fields to the panel TestScore
		 */
		panelTestScore.add(jlTestscore);
		panelTestScore.add(jtxTestscore1);
		panelTestScore.add(jtxTestscore2);
		panelTestScore.add(jtxTestscore3);
		panelTestScore.add(jtxTestscore4);
		
		/**
		 * Creating 4 text fields for input of weights, and a label for the column
		 */
		jtxWeight1= new JTextField(20);
		jtxWeight2= new JTextField(20);
		jtxWeight3= new JTextField(20);
		jtxWeight4= new JTextField(20);
		jlWeight= new JLabel("  Weight");
		
		/**
		 * Adding the label and text fields to the panel Weight
		 */
		panelWeight.add(jlWeight);
		panelWeight.add(jtxWeight1);
		panelWeight.add(jtxWeight2);
		panelWeight.add(jtxWeight3);
		panelWeight.add(jtxWeight4);
		
		/**
		 * Create a new button, to calculate the weighted average, and add it to the panel Button
		 */
		jbtCalculate = new JButton("Calculate Average");
		panelButton.add(jbtCalculate);
		jbtCalculate.addActionListener(this);
		
		/**
		 * Create a new text field, for display of the weighted average, and add it to the panel Button
		 */
		jtxWeightedAverage = new JTextField("The weighted average of your scores is: ");
		panelButton.add(jtxWeightedAverage);	
		
		/**
		 * Add the panels to the BorderLayout
		 */
		add(jlDescription, BorderLayout.NORTH);
		add(panelTestScore, BorderLayout.WEST);
		add(panelWeight, BorderLayout.EAST);
		add(panelButton, BorderLayout.SOUTH);

		/**
		 * Set the GUI visible and pack to fit the window
		 */
		setVisible(true);
		pack();

	}
	
	@Override
	/**
	 * Method for actionPerformed
	 */
	public void actionPerformed(ActionEvent arg0) {
		
		/**
		 * Create a new array of doubles, containing the test scores imported from the left 4 text fields.
		 */
		double testscore [] = new double[4];
		testscore [0] = Double.parseDouble(jtxTestscore1.getText());
		testscore [1] = Double.parseDouble(jtxTestscore2.getText());
		testscore [2] = Double.parseDouble(jtxTestscore3.getText());
		testscore [3] = Double.parseDouble(jtxTestscore4.getText());
		
		/**
		 * Create a new array of doubles, containing the weight of the test scores imported from the right 4 text fields.
		 */
		double weight [] = new double[4];
		weight [0] = Double.parseDouble(jtxWeight1.getText());
		weight [1] = Double.parseDouble(jtxWeight2.getText());
		weight [2] = Double.parseDouble(jtxWeight3.getText());
		weight [3] = Double.parseDouble(jtxWeight4.getText());

		/**
		 * Displays the weighted average score, calculated by the class ScoreCalculator, in the WeightedAverage text field.
		 */
		jtxWeightedAverage.setText("The weighted average of your scores is: " + 
									ScoreCalculator.calculateAvgScore(testscore, weight) + "");
	}

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		
		/**
		 * Creates new instance of the class Score GUI.
		 */
		new ScoreGUI();
		
	}


	
}
