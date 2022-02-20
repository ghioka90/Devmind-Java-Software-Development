package Curs11Smartphone;

public class Speaker {
    int maxVolume, crtVolume;

    public Speaker(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public Speaker(int maxVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = (maxVolume * 25) / 100;
    }

    public boolean increaseVolume(){
        if (crtVolume < maxVolume){
            crtVolume++;
            return true;
        }else{
            return false;
        }
    }

    public boolean decreaseVolume(){
        if (crtVolume < 0){
            crtVolume--;
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
    }
}
