package exception;

public class Computer {
    private int ram;
    private String brand;
    Computer(int ram,String brand) throws Exception{
        this.setRam(ram);
        this.setBrand(brand);
    }

    public   int getRam(){
        return this.ram;
    }
    public void setRam(int ram){
        if(ram %2 !=0)
            throw new ArithmeticException("RAM HATALI GİRİLDİ");
        this.ram=ram;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand) throws Exception{
        if (brand.equals("abc"))
            throw new Exception("invalid brand");
        this.brand=brand;
    }
    public static void Hurra() throws CustomException{
        throw new CustomException("Here ıs my awesome detailed message", (short) 404);
    }
}
