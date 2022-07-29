import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame  {
    
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    Label l;
    
    calculator(){
        
        b1 =new Button("1");
        b2 =new Button("2");
        b3 =new Button("3");
        b4 =new Button("4");
        b5 =new Button("5");
        b6 =new Button("6");
        b7 =new Button("7");
        b8 =new Button("8");
        b9 =new Button("9");
        b10 =new Button("+");
        b11 =new Button("-");
        b12 =new Button("*");
        b13 =new Button("/");
        b14 =new Button("Calculate");
        
        b1.setBounds(50,250,30,30);
        b2.setBounds(100,250,30,30);
        b3.setBounds(150,250,30,30);
        b4.setBounds(50,200,30,30);
        b5.setBounds(100,200,30,30);
        b6.setBounds(150,200,30,30);
        b7.setBounds(50,150,30,30);
        b8.setBounds(100,150,30,30);
        b9.setBounds(150,150,30,30);
        b10.setBounds(250,300,30,30);
        b11.setBounds(250,250,30,30);
        b12.setBounds(250,200,30,30);
        b13.setBounds(250,150,30,30);
        b14.setBounds(70,300,100,30);
        
        l= new Label("RESULTS");
        l.setBounds(50,100,150,30);
        
        add(b1);   add(b2);   add(b3);   add(b4);     
        add(b8);   add(b7);   add(b6);   add(b5);      
        add(b9);   add(b10);  add(b11);  add(b12); 
        add(b13);  add(b14);
        add(l);

        addWindowListener (new WindowAdapter(){
              public void windowClosing(WindowEvent e){
			dispose();
		}
	});
        
        setTitle("CALCULATOR");
        setLayout(null);
        setSize(350,500);
        setVisible(true);
        
    }
    
    public static void main(String args[]){
        
        new calculator();
    }

}