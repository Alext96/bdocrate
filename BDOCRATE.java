import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.awt.*;
import java.awt.event.KeyEvent;

public class BDOCRATE  {

    public static void main(String[] args) throws FindFailed, InterruptedException {
        Screen screen = new Screen();
        Thread.sleep(3000);
        Pattern pattern = new Pattern();
        Pattern STORAGE = new Pattern(BDOCRATE.class.getResource("storage.png"));
        screen.wait(STORAGE.similar((float) 0.99), 2).click();
        Thread.sleep(3000);
        Pattern PROCESS = new Pattern(BDOCRATE.class.getResource("process.png"));
        screen.wait(PROCESS.similar((float) 0.99), 2).click();
        Thread.sleep(3000);
        Pattern IMPERIAL = new Pattern(BDOCRATE.class.getResource("imperial.png"));
        screen.wait(IMPERIAL.similar((float) 0.99), 2).click();
        Thread.sleep(3000);
        Pattern CHICKEN = new Pattern(BDOCRATE.class.getResource("chickenfood.png"));
        screen.wait(CHICKEN.similar((float) 0.99), 2).rightClick();
        Thread.sleep(3000);
        Pattern START = new Pattern(BDOCRATE.class.getResource("start.png"));
        screen.wait(START.similar((float) 0.99), 2).click();
}
}
