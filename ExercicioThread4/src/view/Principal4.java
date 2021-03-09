package view;

import controller.SaposThread;

public class Principal4 {

	public static void main(String[] args) {
		for (int id = 0; id < 5; id++)
		{
			Thread SaposThread = new SaposThread(50, 7, id);
			SaposThread.start();
		}
	}
	}