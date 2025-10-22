package co.edu.unicesar;

public interface Notification  {
    public void send(Message message);
    public void ValidationMsg(String msg);
    String getNombre();
}
