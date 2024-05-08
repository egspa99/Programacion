package InterfacesDIA;

public class TipoProductosException extends Exception{
		
	    private final String mensaje;
	    private final double temperatura;
	    
	    public TipoProductosException(String mensaje, double temperatura) {
	        this.mensaje = mensaje;
	        this.temperatura = temperatura;
	    }

		public String getMensaje() {
			return mensaje;
		}

		public double getTemperatura() {
			return temperatura;
		}

	  
}
