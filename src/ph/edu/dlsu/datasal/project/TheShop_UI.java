package ph.edu.dlsu.datasal.project;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class TheShop_UI extends Program implements Constants {
    
    private Canvas canvas = new Canvas();
    
    private JButton home = new JButton("Home");
    private JButton store = new JButton("Store");
    private JButton account = new JButton("Account Profile");
    private JButton about = new JButton("About");
    private JButton search = new JButton("Search");
    
    private JTextField searchbar = new JTextField(TEXT_FIELD_SIZE);
    
    public void init(){
        add(canvas);
        
        welcomeScreen();
        
        add(home, NORTH);
        add(store, NORTH);
        add(account, NORTH);
        add(about, NORTH);
        
        add(searchbar, NORTH);
        add(search, NORTH);
        
        searchbar.addActionListener(this);
        addActionListeners();
    }
    
    public void welcomeScreen(){
        canvas.showWelcomeMessage("WELCOME TO THE SHOP");
    }
    
    public void actionPerformed(ActionEvent e) {
        String enteredItem = searchbar.getText();
        
        if(e.getActionCommand().equals("Home")){
            canvas.removeAll();
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("Store")){
            canvas.removeAll();
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("Account Profile")){
            canvas.removeAll();
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("About")){
            canvas.removeAll();
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("Search") && !enteredItem.equals("")) {
            canvas.removeAll();
            
            //Fill this in
            
            searchbar.setText(null); //to remove text entered from the search bar after hitting the "search" button
        }
    }
    
    public static void main(String[] args) {
        new TheShop_UI().start(args);
    }

}