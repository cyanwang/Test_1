package util;

import java.awt.List;
import java.util.ArrayList;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;
import org.apache.commons.math3.stat.descriptive.moment.Variance;

public class UseMath {

	public static void main(String[] args) { 
		UseMath test = new UseMath();
		test.getMean(null);
		test.getStandardDeviation(null);
		test.getvariance(null);
		test.getSum(null);
	}
		
		public double getMean(double value[]) {
			Mean mean = new Mean(); // ����ƽ��ֵ 
			double[] values1 = new double[] {1,1,1,1,1,1,1,1,1,1}; 
			System.out.println("����ƽ��ֵ: " +mean.evaluate(values1));
			return 0;
		}
		
		public double getStandardDeviation(double value[]) {
			double[] values2 = new double[] {1,1,1,1,1,1,1,1,1,1}; 			
			StandardDeviation StandardDeviation =new StandardDeviation();//��׼�� 
			System.out.println("��׼��: " +StandardDeviation.evaluate(values2));
			return 0; 
		}
		
		public double getvariance(double value[]) {
			double[] values3 = new double[] {1,1,1,1,1,1,1,1,1,1};
			Variance variance = new Variance();//����		
			System.out.println("����: " +variance.evaluate(values3));
			return 0;
		}
		public int getSum(ArrayList<Integer> a)
		{
			ArrayList a1= new ArrayList<Integer>();
			a1.add(1);
			a1.add(2);
			int sum=0;
			 for(int i=0;i<a1.size();i++)
			 {
				 sum+=(int)a1.get(i);
			 }
			 System.out.println("��: " +sum);
			 return sum;
		}
      
}
