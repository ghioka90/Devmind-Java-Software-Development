package Curs11Smartphone;

public class TestDevices {

  public static void main(String[] args) {
//    Screen aPhoneScreen = new Screen();
//    Case aPhoneCase = new Case();
//    Speaker aPhoneSpeaker = new Speaker(100);
//    Microphone aPhoneMicrophone = new Microphone(100);
//    Smartphone Smartphone = new Smartphone(aPhoneScreen, aPhoneCase,
//            aPhoneSpeaker, aPhoneMicrophone);
    Smartphone samsung = new Smartphone(4, 20,20,20,100,100);
    Smartphone iphone = new Smartphone(6, 20,30,10,150,150);


    samsung.setPixel(0,"green");

    samsung.pressPowerButton();
    samsung.pressVolumeUp();
    samsung.pressVolumeDown();
    samsung.increaseMicrophoneVolume();
    samsung.decreaseMicrophoneVolume();
    System.out.println(samsung);
    samsung.setSilenceMode();
    samsung.muteMicrophone();
    System.out.println(samsung);
    samsung.pressVolumeUp();
    samsung.pressVolumeUp();
    samsung.pressVolumeUp();
    samsung.colorScreen("blue");
    System.out.println(samsung);
    samsung.increaseMicrophoneVolume();
    samsung.increaseMicrophoneVolume();
    samsung.pressPowerButton();
    System.out.println(samsung);

  }
}