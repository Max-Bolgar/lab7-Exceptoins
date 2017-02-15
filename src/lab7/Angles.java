package lab7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Angles {
	public  final double Pi = 3.14;
	public  final int grad = 1;
	public  final int rad = 2;
	
	public double getSumSin( double[] angles, int type){
		double SumSin = 0;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
				SumSin += Math.sin(angles[i]);
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				SumSin += Math.sin(angles[i]);
			}
		}
		
		return new BigDecimal(SumSin).setScale(3, RoundingMode.HALF_UP).doubleValue();		
	}
	
	public double getSumCos( double[] angles, int type){
		double SumCos = 0;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
				SumCos += Math.cos(angles[i]);
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				SumCos += Math.cos(angles[i]);
			}
		}
		
		return new BigDecimal(SumCos).setScale(3, RoundingMode.HALF_UP).doubleValue();	
	}
	
	public double getDiffSin( double[] angles, int type){
		double DiffSin = 0;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				for (int j = i + 1; j < angles.length - 1; j++) {
					angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
					DiffSin += Math.sin(angles[i] - angles[j]);
				}	
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				for (int j = i + 1; j < angles.length - 1; j++) {
					DiffSin += Math.sin(angles[i] - angles[j]);
				}			
			}
		}
		
		return new BigDecimal(DiffSin).setScale(3, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getDiffCos( double[] angles, int type){
		double DiffCos = 0;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				for (int j = i + 1; j < angles.length - 1; j++) {
					angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
					DiffCos += Math.cos(angles[i] - angles[j]);
				}	
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				for (int j = i + 1; j < angles.length - 1; j++) {
					DiffCos += Math.cos(angles[i] - angles[j]);
				}			
			}
		}
		
		return new BigDecimal(DiffCos).setScale(3, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getCompSin( double[] angles, int type){
		double CompSin = 1;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
				CompSin *= Math.sin(angles[i]);
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				CompSin *= Math.sin(angles[i]);
			}
		}
		
		return new BigDecimal(CompSin).setScale(3, RoundingMode.HALF_UP).doubleValue();
	}
	
	public double getCompCos( double[] angles, int type){
		double CompCos = 1;
		
		if (type == grad) {
			
			for (int i = 0; i < angles.length; i++) {
				angles[i] = angles[i] / 57;  // Перевожу градусы в радианы
				CompCos *= Math.cos(angles[i]);
			}
		} else {
			
			for (int i = 0; i < angles.length; i++) {
				CompCos *= Math.cos(angles[i]);
			}
		}
		
		return new BigDecimal(CompCos).setScale(3, RoundingMode.HALF_UP).doubleValue();	
	}
}
