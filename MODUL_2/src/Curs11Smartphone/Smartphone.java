package Curs11Smartphone;

public class Smartphone {
  private Screen theScreen;
  private Case theCase;
  private Speaker theSpeaker;
  private Microphone theMicrophone;

  // Aggregation:
  private Cover aCover;
  private ScreenProtector aScreenProtector;

  public Smartphone(Screen theScreen, Case theCase,
                    Speaker theSpeaker, Microphone theMicrophone) {
    this.theScreen = theScreen;
    this.theCase = theCase;
    this.theSpeaker = theSpeaker;
    this.theMicrophone = theMicrophone;
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