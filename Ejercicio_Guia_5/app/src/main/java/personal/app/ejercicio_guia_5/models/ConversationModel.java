package personal.app.ejercicio_guia_5.models;

import java.io.Serializable;

public class ConversationModel implements Serializable {

    private int imgConversation;
    private String names, message, time;

    public ConversationModel(int imgConversation, String names, String message, String time) {
        this.imgConversation = imgConversation;
        this.names = names;
        this.message = message;
        this.time = time;
    }

    public int getImgConversation() {
        return imgConversation;
    }

    public void setImgConversation(int imgConversation) {
        this.imgConversation = imgConversation;
    }

    public String getNames() {
        return names;
    }

    public void setName(String names) {
        this.names = names;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "ConversationModel{" +
                "imgConversation=" + imgConversation +
                ", names='" + names + '\'' +
                ", message='" + message + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

}
