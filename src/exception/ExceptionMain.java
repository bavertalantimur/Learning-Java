package exception;

public class ExceptionMain  {
    public static void main(String[] args) {
        try {
            //Computer c=new Computer(6,"abc");
            Computer.Hurra();
        }
        catch (CustomException ce){
            System.out.println(ce.getMessage());
            System.out.println(ce.getMessageCode());
        }
        catch (Exception e){
            //System.out.println(e.getMessage());
        }
    }
}
