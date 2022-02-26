package Curs11Smartphone;

public class Smartphone {
  private Screen theScreen;
  private Case theCase;
  private Speaker theSpeaker;
  private Microphone theMicrophone;

  private boolean power = false;

  // Aggregation:
  private Cover aCover;
  private ScreenProtector aScreenProtector;

  public Smartphone() {
    this.theScreen = new Screen(16,4,4,0);
    this.theSpeaker = new Speaker(100);
    this.theMicrophone = new Microphone(100);
  }

  public Smartphone(int spkVolume, int micVolume) {
    this.theSpeaker.crtVolume = spkVolume;
    this.theMicrophone.crtVolume = micVolume;
  }
  public Smartphone(Screen theScreen, Case theCase,
                    Speaker theSpeaker, Microphone theMicrophone) {
    this.theScreen = theScreen;
    this.theCase = theCase;
    this.theSpeaker = theSpeaker;
    this.theMicrophone = theMicrophone;
  }

  public void pressPowerButton(){
    if (this.power == true){
      System.out.println("Good bye!");
      this.power = false;
    }else{
      System.out.println("Welcome to Android!");
      this.power = true;
    }
  }


  public void pressVolumeUp(){
    this.theCase.pressVolumeUp();
    this.theSpeaker.increaseVolume();
  }

  public void pressVolumeDown(){
    this.theCase.pressVolumeDown();
    this.theSpeaker.decreaseVolume();
  }


  public void setPixel(int index, String color){
    this.theScreen.setPixels(index, color);
  }

  public void colorScreen(String color){
    this.theScreen.colorScreen(color);
  }

  public void increaseMicrophoneVolume(){
    this.theMicrophone.increaseVolume();
  }

  public void decreaseMicrophoneVolume(){
    this.theMicrophone.decreaseVolume();
  }

  public void muteMicrophone(){
    this.theMicrophone.muteMicrophone();
  }

  public void setSilenceMode(){
    this.theSpeaker.setSilenceMode();

  }


//  public Smartphone(int pixelsNo, int width, int length, int depth, int speakerMaxVol,
//                    int speakerCrtVol, int microMaxVol, int microCrtVol) {
//    this.theScreen = new Screen(pixelsNo, width, length, depth);
//    this.theCase = new Case();
//    this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
//    this.theMicrophone = new Microphone(microMaxVol, microCrtVol);
//  }

  public boolean setCover(Cover aCover) {
    if (this.aCover != null) {
      System.out.println("Err: A cover is already in place!");
      return false;
    }
    this.aCover = aCover;
    return true;
  }


  public Cover removeCover() {
    Cover referenceToCover = this.aCover;
    this.aCover = null; // remove cover
    return referenceToCover;
  }
}