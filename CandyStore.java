import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
public class CandyStore {
	
	public static void main(String[] args) {
		
		try 
		{
			Scanner scanner = new Scanner(new FileInputStream(new File("input.txt")));
			int n = scanner.nextInt();
			//System.out.println("n = " + n);
			while (n != 0) 
			{
				int m = (int)(scanner.nextDouble() * 100);
				//System.out.println("m = " + m);
				Candy[] array = new Candy[n + 1];
				array[0] = new Candy(0,0);
				for (int i = 1; i <= n; i++) 
				{
					array[i] = new Candy(scanner.nextInt(), (int)(scanner.nextDouble() * 100));
					//System.out.printf("%d %d %n",array[i].GetCalories(),array[i].GetPrice());
				}
				Algorithm solution = new Algorithm(array, n, (int) m);
				int output = solution.SolveIt();
				System.out.println(output);
				n = scanner.nextInt();
				//System.out.println("n = " + n);
			}
			scanner.close();
		}
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
