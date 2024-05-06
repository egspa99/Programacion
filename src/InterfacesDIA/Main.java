package InterfacesDIA;

import InterfacesDIA.Frescos.Carnes;
import InterfacesDIA.Frescos.Frescos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carnes chuleton = new Carnes(null, 0, 0, 0, 0, null, null);
            
		
		
		Frescos yogur = new Frescos() {
			
			@Override
			public String neveraAbierta() {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String caducar() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		System.out.println(yogur.caducar());
		
	}

}
