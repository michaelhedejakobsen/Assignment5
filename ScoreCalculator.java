/**
 * The class ScoreCalculator contains the method calculateAvgScore with the double attributes testScore and weight.
 * The method calculates the weighted average score, using the arrays testScore and eight from the ScoreGUI class.
 * ScoreCalculator returns totalScore.
 * @author Michael H. Jakobsen
 * Date: 04. November 2014
 *
 */
public class ScoreCalculator {

/**
 * Constructs new public method with the following parameters.
 * @param testScore
 * @param weight
 * @return totalScore
 */
public static double calculateAvgScore(double [] testScore, double [] weight){
	
	/**
	 * Initialize the double totalScore
	 */
	double totalScore=0;
	
	/**
	 * for loop to calculate the weighted average of testscores.
	 */
	for(int i=0; i<testScore.length; i++){
		
		totalScore += testScore[i] * weight[i];
	}
	
	/**
	 * Returns totalScore
	 */
	return totalScore;
	
	}
}
