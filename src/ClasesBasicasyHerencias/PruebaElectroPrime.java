package ClasesBasicasyHerencias;

public class PruebaElectroPrime {
	public static void main(String[] args) {
        // TODO code application logic here
        
        Electrodomestico e1 = new Electrodomestico("Microwave","Electrolux",0.20);
        
        e1.setPotencia(0.67);
        e1.setMarca("Electrolux");
        
        System.out.println(e1);
        
        int horas = 10;
        double consum = e1.getConsumo(horas);
        double preciokwh = 0.5;
        double coste = e1.getCosteConsumo(horas, preciokwh);
        System.out.println("Ha consumido: "+consum+" kW en "+horas+" horas");
        System.out.println("Debe pagar: "+coste+" €");
        
        
        Lavadora lava1 = new Lavadora("Indesit",500,0.7,false);
        
        System.out.println(lava1);
        lava1.setAguaCaliente(true);
        System.out.println("Consumo de la lavadora en 10 horas: "+lava1.getConsumo(10));
        System.out.println("Coste del consumo en 10 horas: "+lava1.getCosteConsumo(10, 2));
        
    }
    
}
