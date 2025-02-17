package appiumPractise;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import java.util.Collections;

import java.awt.*;
import java.time.Duration;

public class ScrollUpAndDown {


    public void ScrollUp()
    {
        Dimension size;
        size = CommonUtils.androidDriver.get().manage().window().getSize();

        int x=size.getWidth()/2;
        int y=size.getHeight()/2;


        int endX=x;
        int endY= (int)(size.getHeight()*0.15);


        PointerInput finger1=new PointerInput(PointerInput.Kind.TOUCH,"finger1");
        Sequence sequence=new Sequence(finger1,1)
                .addAction(finger1.createPointerMove(Duration.ZERO,PointerInput.Origin.viewport(),x,y))
                .addAction((finger1.createPointerDown(PointerInput.MouseButton.LEFT.asArg())))
                .addAction(new Pause(finger1,Duration.ofMillis(200)))
                .addAction(finger1.createPointerMove(Duration.ofMillis(200),PointerInput.Origin.viewport(),endX,endY))
                .addAction(finger1.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));


        CommonUtils.androidDriver.get().perform(Collections.singletonList(sequence));


    }


    public void ScrollDown()
    {

    }
}
