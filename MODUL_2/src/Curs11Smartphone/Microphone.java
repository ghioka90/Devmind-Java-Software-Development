package Curs11Smartphone;

public class Microphone {
    int maxVolume, crtVolume;

    public Microphone(){
    }

    public Microphone(int maxVolume, int crtVolume) {
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    public Microphone(int maxVolume) {
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

    public boolean muteMicrophone(){
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
