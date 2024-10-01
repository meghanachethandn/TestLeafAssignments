package week3.day1.InterfacePratices;

public interface DataBaseConnection {
	
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();
	
}
