package co.edu.unicesar;

public class SMSNoti implements Notification{
    @Override
    public void send(Message message) {
        System.out.println("ENVIANDO SMS");
        System.out.println("Numero : "+message.getRecipient());
        System.out.println("Mensaje : "+message.getContent());
        System.out.println("MENSAJE SMS ENVIADO CORRECTAMENTE");
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public void ValidationMsg(String msg) {
        if ((msg == null) || (msg.length()<0 || msg.length()>500)){
            System.out.println("SU MENSAJE ESTA VACIO O EXCEDIO EL LIMITE DE CARACTERES");
        }
    }
}
