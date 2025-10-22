package co.edu.unicesar;

public class PushNoti implements Notification {
    @Override
    public void send(Message message) {
        System.out.println("**ENVIANDO MENSAJE PUSH**");
        System.out.println("**Usuario: "+message.getRecipient()+"**");
        System.out.println("**Titulo: "+message.getSubjetc()+"**");
        System.out.println("**Contenido : "+message.getContent()+"**");
        System.out.println("MENSAJE PUSH ENVIADO CORRECTAMENTE");
    }

    @Override
    public String getNombre() {
        return "";
    }

    @Override
    public void ValidationMsg(String msg) {
        if ((msg == null) || (msg.length()<0 || msg.length()>100)){
            System.out.println("SU MENSAJE ESTA VACIO O EXCEDIO EL LIMITE DE CARACTERES");
        }
    }
}
