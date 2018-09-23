/*
 * Bogdan Gordin
 * 9/21/2018
 * COMSC-255-8213
 * Mr. Khaja
 * 
 * Statistic Program hm6
 */

package as6;

import java.util.Arrays;

public class Statistic {
	
	private double[] myData;
	private double[] myCopyData;
	
	public Statistic(double[] data) {
		//myData = new double[data.length];
		//System.arraycopy(data, 0, myData, 0, data.length);
		
		myData = data.clone();
		myCopyData = data.clone();
		Arrays.sort(myCopyData);
	}
	
	public double findMinimum() {
		double minimum = myCopyData[0];
		return minimum;
	}
	
	public double findMaximum() {
		double maximum = myCopyData[myCopyData.length-1];
		return maximum;
	}
	
	public double findMean() {
		double sum = 0;
		for(int i = 0; i < myCopyData.length;i++) {
			sum = myCopyData[i];
		}
		
		double mean = sum/myCopyData.length;
		return mean;
	}
	
	public double findMedian() {
		double median;
		if (myCopyData.length%2 == 0) {
			int highMedianIndex = myCopyData.length/2;
			int lowMedianIndex = highMedianIndex-1;
			median = ((myCopyData[lowMedianIndex] + myCopyData[highMedianIndex])/2.0);
		}
		
		else {
			int medianIndex = myCopyData.length/2;
			median = myCopyData[medianIndex];
		}
		
		return median;
	}
	
	public double[] originalData() {
		double [] myOriginalData = myData.clone();
		return myOriginalData;
	}
	
	public double[] findSortedData() {
		double [] mySortedData = myCopyData;
		return mySortedData;
	}
	
}
