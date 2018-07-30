public abstract class Instrument implements Playable,Tunable{

    private String producent;

    public Instrument(String producent) {
        this.producent = producent;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

//    public abstract void play();
}
