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
        
        // background image attempt
        /*String bgfilename = "01.jpg";
        GImage background = null;
        background = new GImage(bgfilename);
        add(background, 10, 10);*/
        
    }
    
    public void homePage(){
        //page displaying store name and project members
        
        GLabel home = new GLabel("theSHOP");
        home.setFont("BOLD-55");
        home.setColor(Color.ORANGE);
        double w = home.getWidth();
        double h = home.getAscent();
        add(home, (getWidth() - w) / 2, 80);
        
        GLabel members = new GLabel("Developed by:");
        members.setFont("25");
        members.setColor(Color.ORANGE);
        double w2 = members.getWidth();
        //double h2 = members.getAscent();
          add(members, (getWidth() - w2) / 2, 200);
        
        GLabel members2 = new GLabel("Ang, Ryan Jasper V.");
        members2.setFont("25");
        members2.setColor(Color.ORANGE);
        double w3 = members.getWidth();
        //double h2 = members.getAscent();
        add(members2, (getWidth() - w3) / 2, 220);
        
        GLabel members3 = new GLabel("Parro, Manuel Lorenzo L.");
        members3.setFont("25");
        members3.setColor(Color.ORANGE);
        double w4 = members.getWidth();
        //double h2 = members.getAscent();
        add(members3, (getWidth() - w4) / 2, 240);
        
        GLabel members4 = new GLabel("Wenceslao, Luis Paolo D.");
        members4.setFont("25");
        members4.setColor(Color.ORANGE);
        double w5 = members.getWidth();
        //double h2 = members.getAscent();
        add(members4, (getWidth() - w5) / 2, 260);
        
        
        
    }
    
    public void productPage(){
        //page displaying all available items
       
        GLabel products = new GLabel("theSHOP Products");
        products.setFont("BOLD-55");
        products.setColor(Color.ORANGE);
        //double w = products.getWidth();
        //double h = products.getAscent();
        add(products, 40,80);
        
                
        
    }
    
    public void searchResult(){
        //page after searching for specific item
        
        //Fill this in
        
    }
    
    public void shoppingCart(){
        //page displaying all selected items to be purchased
           
        //Fill this in
        
    }
    
    public void itemBilling(){
        //page requesting for user address and credit/debit card credentials
        
        //Fill this in
        
    }
    
    public void productLayoutTest(){
        int numProducts = 10;  //numProducts = number of products at start or as returned by search results
        
        GRect prodOne = new GRect(PRODUCT_IMAGE_WIDTH,PRODUCT_IMAGE_WIDTH);
        add(prodOne,(1*180),((numProducts/5)*180));
        
        GRect prodTwo = new GRect(PRODUCT_IMAGE_WIDTH,PRODUCT_IMAGE_WIDTH);
        add(prodTwo,(2*180),((numProducts/5)*180));
        
        GRect prodThree = new GRect(PRODUCT_IMAGE_WIDTH,PRODUCT_IMAGE_WIDTH);
        add(prodThree,(3*180),((numProducts/5)*180));
        
        GRect prodFour = new GRect(PRODUCT_IMAGE_WIDTH,PRODUCT_IMAGE_WIDTH);
        add(prodFour,(4*180),((numProducts/5)*180));
        
        GRect prodFive = new GRect(PRODUCT_IMAGE_WIDTH,PRODUCT_IMAGE_WIDTH);
        add(prodFive,(5*180),((numProducts/5)*180));
        
    }
    
   
          
    
}
