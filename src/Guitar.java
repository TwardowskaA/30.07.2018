public class Guitar extends Instrument {

    private String type;

    public Guitar(String producent, String type) {
        super(producent);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void play(){
        System.out.println("Brzdek brzdek");
    }

    @Override
    public void tune() {
        System.out.println("stroju stroju");
    }
}


