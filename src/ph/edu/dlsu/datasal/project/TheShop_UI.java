package ph.edu.dlsu.datasal.project;

import acm.graphics.*;
import acm.program.*;
import acm.util.*;
import java.sql.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;


public class TheShop_UI extends Program implements Constants {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private Canvas canvas = new Canvas();
    
    private JButton home = new JButton("Home");
    private JButton store = new JButton("Store");
    private JButton account = new JButton("Account Profile");
    private JButton about = new JButton("About");
    private JButton search = new JButton("Search");
    private JButton enterItemCode = new JButton("Enter Item Code");
    private JButton login = new JButton("Login");
    private JButton signup = new JButton("Signup");
    
    private JLabel Username = new JLabel ("Username: ");
    private JLabel Password = new JLabel ("Password: ");
    
    
    private JTextField searchbar = new JTextField(TEXT_FIELD_SIZE);
    private JTextField itemcode = new JTextField(TEXT_FIELD_SIZE);
    private JTextField username = new JTextField(TEXT_FIELD_SIZE);
    private JTextField password = new JTextField(TEXT_FIELD_SIZE);
    
    public void init(){
        add(canvas);
        
        welcomeScreen();
        
        add(home, NORTH);
        add(store, NORTH);
        add(account, NORTH);
        add(about, NORTH);
        
        add(searchbar, NORTH);
        add(search, NORTH);
        
       //EAST 
        add(Username, EAST);
        add(username, EAST);
        add(Password, EAST);
        add(password, EAST);
        add(login, EAST);
        add(signup, EAST);
        accountVisFalse();
        
        
        
        enterItemCode.setVisible(false);
        itemcode.setVisible(false);
        add(itemcode, SOUTH);
        add(enterItemCode, SOUTH);
        
        searchbar.addActionListener(this);
        itemcode.addActionListener(this);
        addActionListeners();
    }
    
    public void accountVisFalse(){
        Username.setVisible(false);
        username.setVisible(false);
        Password.setVisible(false);
        password.setVisible(false);
        login.setVisible(false);
        signup.setVisible(false);
    }
        
        
    
    public void welcomeScreen(){
        canvas.showWelcomeMessage("WELCOME TO THE SHOP");
    }
    
    public void actionPerformed(ActionEvent e) {
        String enteredItem = searchbar.getText();
        String enteredCode = itemcode.getText();
        String enteredUser = username.getText();
        String enteredPass = password.getText();
        
        if(e.getActionCommand().equals("Home")){
            canvas.removeAll();
            accountVisFalse();
            enterItemCode.setVisible(false);
            itemcode.setVisible(false);
            
            canvas.homePage();
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("Store")){
            canvas.removeAll();
            accountVisFalse();
            enterItemCode.setVisible(true);
            itemcode.setVisible(true);
            
             canvas.productPage();
             canvas.productLayoutTest();
        }
        
        else if(e.getActionCommand().equals("Account Profile")){
            //canvas.removeAll();
            
            enterItemCode.setVisible(false);
            itemcode.setVisible(false);
            Username.setVisible(true);
            username.setVisible(true);
            Password.setVisible(true);
            password.setVisible(true);
            login.setVisible(true);
            signup.setVisible(true);
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("About")){
            canvas.removeAll();
            accountVisFalse();
            enterItemCode.setVisible(false);
            itemcode.setVisible(false);
            
            //Fill this in
        }
        
        else if(e.getActionCommand().equals("Search") && !enteredItem.equals("")) {
            canvas.removeAll();
            accountVisFalse();
            enterItemCode.setVisible(true);
            itemcode.setVisible(true);
            
            //Fill this in
            
            searchbar.setText(null); //to remove text entered from the search bar after hitting the "search" button
            
            canvas.searchResult();
        }
        
        else if(e.getActionCommand().equals("Enter Item Code") && !enteredCode.equals("")) {
            canvas.removeAll();
            
            enterItemCode.setVisible(true);
            itemcode.setVisible(true);
            
            //Fill this in
            canvas.shoppingCart();
            itemcode.setText(null); //to remove text entered from the code bar after hitting the "enter item code" button
        }
        else if(e.getActionCommand().equals("Login") && !enteredUser.equals("") && !enteredPass.equals("")) {
            
            // TODO add your handling code here:
            String sql = "select * from accountcreation where Username = ? and Password =?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, enteredUser);
                pst.setString(2, enteredPass);

                rs = pst.executeQuery();
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Username and Password is correct");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Username and Password is not correct");
                }
            }
            catch(Exception f){
                JOptionPane.showMessageDialog(null, f);
            }
        }
    }
        
    public static void main(String[] args) {
        new TheShop_UI().start(args);
    }

}
