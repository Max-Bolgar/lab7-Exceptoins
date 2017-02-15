package lab7;

public class Line {
	
	public String getLine(int a, int b, String str){
		String rezult = null;
		// Проверка не за пределом ли индекс массива
		try {
			rezult = str.copyValueOf(str.toCharArray(), a, b);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("\nИндекс за пределами массива.\nВведите меньшее  значение количества выводимых элементов\n");
		}
		return rezult;
	}
}
