package control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.main;

import control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.gui.GUI_RACE03_HORSES_control84;
import control_3CD.Start_PCD_week04._4_2_CorridaDeCavalosSimulada.thread.MyThread;

public class Start_SWING_RACE03_HORSES_control84 {
	
	/* ************************main******************************** */
	public static void main(String[] args) {

		// instanciar as threads e iniciar
		
		GUI_RACE03_HORSES_control84 gui = new GUI_RACE03_HORSES_control84();
		for (int i = 0; i < gui.getNumThreads(); i++) {
			gui.getThreads().add(new MyThread(i, "HorseISCTE" + i, gui));
		}
	
		try {
			// junta as threads na posicao zero do array 
			for (int i = 0; i < 3; i++) {
				gui.getThreads().get(i).join();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < gui.getNumThreads(); i++) {
			// mata as threads e confirma se estao mesmo mortas
			gui.getThreads().get(0).interrupt();
			gui.getThreads().get(i).isAlive();
			System.out.println(gui.getThreads().get(i).toString());	
		}
	
		}

}
