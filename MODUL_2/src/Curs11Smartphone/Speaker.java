package Curs11Smartphone;

public class Speaker {
    int maxVolume, crtVolume;

    public Speaker(){}

    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = (maxVolume * 25) / 100;
    }

    public boolean increaseVolume(){
        if (this.crtVolume < maxVolume){
            this.crtVolume++;
            return true;
        }else{
            return false;
        }
    }

    public boolean decreaseVolume(){
        if (this.crtVolume < 0){
            this.crtVolume--;
            return true;
        }else{
            return false;
        }
    }

    public boolean setSilenceMode(){
        if (this.crtVolume > 0){
            this.crtVolume = 0;
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
    }
}
