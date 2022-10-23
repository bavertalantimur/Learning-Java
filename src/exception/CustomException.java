package exception;

public class CustomException extends Exception{
    private short messageCode;
    public CustomException(String myMessage,short messageCode){
        super(myMessage);
        setMessageCode(messageCode);
    }

    public short getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(short messageCode) {
        this.messageCode = messageCode;
    }
}
