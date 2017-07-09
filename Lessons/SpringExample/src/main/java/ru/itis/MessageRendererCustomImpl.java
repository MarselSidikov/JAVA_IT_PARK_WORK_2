package ru.itis;

/**
 * Created by Student21 on 09.07.2017.
 */
public class MessageRendererCustomImpl implements MessageRenderer {
    private String info;

    private Message message;

    public MessageRendererCustomImpl(String info, Message message) {
        this.info = info;
        this.message = message;
    }

    public void showMessage() {
        System.out.println(info + " " + message.getText());
    }
}
