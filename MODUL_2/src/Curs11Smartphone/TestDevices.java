package Curs11Smartphone;

public class TestDevices {

  public static void main(String[] args) {
    Screen aPhoneScreen = new Screen();
    Case aPhoneCase = new Case();
    Speaker aPhoneSpeaker = new Speaker();
    Microphone aPhoneMicrophone = new Microphone();
    Smartphone aSmartphone = new Smartphone(aPhoneScreen, aPhoneCase,
            aPhoneSpeaker, aPhoneMicrophone);


    aSmartphone.pressPowerButton();
    aSmartphone.pressVolumeUp();
    aSmartphone.pressVolumeDown();
    aSmartphone.pressPowerButton();

  }
}