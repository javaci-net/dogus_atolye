
public class KacKereDonuyorsunSen {
	public static void main(String[] args) {
		long count = 0;

		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++)
			for (int j = 0; j < 10000; j++)
				for (int k = 0; k < 10000; k++)
					count++;
		
		long end = System.currentTimeMillis();
		
		System.out.println(count);
		System.out.println((end - start) / 1000 + " saniye surdu");
		
	}

}
