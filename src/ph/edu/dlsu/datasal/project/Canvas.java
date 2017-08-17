package ph.edu.dlsu.datasal.project;

import acm.graphics.*;
import java.awt.*;
import java.util.*;

public class Canvas extends GCanvas implements Constants{
    
    public void showWelcomeMessage(String msg) {
        GLabel message = new GLabel(msg, getWidth()/2, getHeight()/2);
        message.setFont("BOLD-65");
        message.setColor(Color.RED);
        message.move(-message.getWidth()/2, -message.getHeight()/2);
        add(message);
        
        GLabel click = new GLabel("Click Home to Start");
        double w = click.getWidth();
        double h = click.getAscent();
        add(click, (getWidth() - w) / 2, ((getHeight() - h) / 2) + (getHeight() / 4));
    }
    
}
