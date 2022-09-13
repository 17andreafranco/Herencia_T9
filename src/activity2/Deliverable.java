package activity2;

/**
 * @author Andrea
 * Interfaz con diferentes metodos que comparten Show y Videgame
 */
public interface Deliverable {
	
	public void deliver();
	
	public void returned();
	
	public boolean isDelivered();
	
	public int compareTo (Object a);
}
