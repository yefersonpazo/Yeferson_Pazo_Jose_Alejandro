package co.edu.unicesar;

public class EmailNoti implements Notification {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EmailNoti(String name) {
        this.name = name;
    }

    @Override
    public void send(Message message) {
        System.out.println("SALUDOS CORDIALES");
        System.out.println("Para: "+message.getRecipient());
        System.out.println("Asunto: "+message.getSubjetc());
        System.out.println(" Mensaje: "+message.getContent());
        System.out.println("MENSAJE EMAIL ENVIADO CORRECTAMENTE");
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public void ValidationMsg(String msg) {
        if ((msg == null) || (msg.length()<0 || msg.length()>1000)){
            System.out.println("SU MENSAJE ESTA VACIO O EXCEDIO EL LIMITE DE CARACTERES");
        }
    }
}
