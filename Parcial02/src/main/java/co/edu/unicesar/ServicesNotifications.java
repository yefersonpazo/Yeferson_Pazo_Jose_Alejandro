package co.edu.unicesar;

import java.util.ArrayList;
import java.util.List;

public class ServicesNotifications {
    private List<Notification>  channels;

    public ServicesNotifications() {
        this.channels = new ArrayList<Notification>();
    }
    public void addChannel(Notification channel){
        channels.add(channel);
        System.out.println("CANAL AGREGADO "+channel.getNombre());
    }
    public void SentoEveryone(Message message){
        System.out.println("INICIANDO ENVIO ");
        for(Notification channel : channels){
            channel.send(message);
        }
        System.out.println("ENVIADO");
    }
    public void sendthrough(Message message, int index){
        if(index >= 0  && index < channels.size()){
            channels.get(index).send(message);
        }else{
            System.out.println("No enviado");
        }
    }
    public void ShowChannels(){
        System.out.println("Canales disponibles");
        for (int i=0 ; i < channels.size();){
            System.out.println(i +"."+channels.get(i).getNombre());
        }
    }
}
