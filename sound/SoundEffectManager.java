package sound;

public class SoundEffectManager extends SoundManager {
    public void playSound(String s) {
        switch (s) {
            case "gunshot":
                super.setupSound("soundclips/gunshot.wav", s);
                oneShotStream.fire();
                break;
        }
    }
}