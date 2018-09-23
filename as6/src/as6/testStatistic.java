/*
 * Bogdan Gordin
 * 9/21/2018
 * COMSC-255-8213
 * Mr. Khaja
 * 
 * Statistic Test Program hm6
 */

package as6;

import javax.swing.JOptionPane;

public class testStatistic {
	public static void main(String[] args) {
		//Input vector length
		String myInput = JOptionPane.showInputDialog("Please enter the size of the vector: ");
		int theDataLength = Integer.parseInt(myInput);
		
		//Create the vector
		double [] theData = new double[theDataLength];
		
		//Input the vector data
		for (int i=0; i < theDataLength; i++) {
			myInput = JOptionPane.showInputDialog("Please enter the date for #" + i + ": ");
			theData[i] = Integer.parseInt(myInput);
		}
		
		//Create the object
		Statistic myStats = new Statistic(theData);
		double[] myOriginalData = myStats.originalData();
		double[] mySortedData = myStats.findSortedData();
		double myMinimum = myStats.findMinimum();
		double myMaximum = myStats.findMaximum();
		double myMean = myStats.findMean();
		double myMedian = myStats.findMedian();
		
		//Print out the output
		String myOutput = "This is the original data:\n";
		for(int i = 0;i < myOriginalData.length; i++){
			myOutput += myOriginalData[i] + " ,";
		}
		
		myOutput += "\n\nThis is the sorted data:\n";
		for(int i = 0;i < mySortedData.length; i++){
			myOutput += mySortedData[i] + " ,";
		}
		
		myOutput += "\n\nMinimum: " + myMinimum + "\nMaximum: " + myMaximum + "\nMean: " + myMean + "\nMedian: " + myMedian;
		JOptionPane.showMessageDialog(null, myOutput);
		
		System.exit(0);
	}
	
}
