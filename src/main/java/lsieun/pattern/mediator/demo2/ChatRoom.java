package lsieun.pattern.mediator.demo2;

import java.util.Date;

class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
