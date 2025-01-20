
package de.hsh.steam.resources;

import javax.xml.bind.annotation.XmlRootElement;
 

@XmlRootElement(name = "error")
public class MessageData {
    

    private String message;
    
    public MessageData(){
    }

    public MessageData(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
