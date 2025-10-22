package co.edu.unicesar;

public abstract class NotificationsBase implements Notification{
    protected String name;

    public String getName() {
        return name;
    }
   @Override
   public String getNombre(){
        return name;
   }
    public void setName(String name) {
        this.name = name;
    }

    public NotificationsBase(String name) {
        this.name = name;
    }
    public void Showname(){
        System.out.println("Notification Channel "+name);
    }
}
