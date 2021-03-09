package controller;

import java.util.Random;

public class SaposThread extends Thread {
	private int MaxPulo, percurso, ids;
	static int i = 1;

	public SaposThread(int percurso, int MaxPulo, int ids)
	{
		this.percurso = percurso;
		this.MaxPulo = MaxPulo;
		this.ids = ids;
	}
	@Override
	public void run() 
	{
		Sapo();
	}

	private void Sapo()
	{
		Random random = new Random();
		int pulo;
		int pos = 0;

		while (pos < percurso)
		{
			pulo = random.nextInt(MaxPulo + 1);
			pos += pulo;
			System.out.println("Sapo " + ids + " pulou " + pulo + " m. - ainda restam: " + (percurso - pos) + " m.");
		}
		System.out.println("\n-----------------------------------------\n"
				+ "\n    Sapo " + ids + " chegou em: "  + i + "º colocado \n"
						+ "\n-------------------------------------------\n");
		i++;
	}
}
