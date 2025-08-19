package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Members;
import academy.devdojo.maratonajava.javacore.ZZFthreads.service.EmailDeliveryServiceService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();

        Thread jiraya = new Thread(new EmailDeliveryServiceService(members),"Jiraya");
        Thread kakashi = new Thread(new EmailDeliveryServiceService(members),"kakashi");
        jiraya.start();
        kakashi.start();

        while(true) {
            String email = JOptionPane.showInputDialog("Entre com seu email");
            if(email == null || email.isEmpty()) {
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }

    }
}
