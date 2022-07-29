import java.awt.*;
import java.awt.event.*;

public class calculator extends Frame  implements ActionListener{
    
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        
        l= new Label("");
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
    
    public void actionPerformed(ActionEvent e){
        
        String last=l.getText();    
    
        if(e.getSource() ==b1)
        l.setText(last+"1");
        
        else if(e.getSource() ==b2)
        l.setText(last+"2");
        
        else if(e.getSource() ==b3)
        l.setText(last+"3");
        
        else if(e.getSource() ==b4)
        l.setText(last+"4");
        
        else if(e.getSource() ==b5)
        l.setText(last+"5");
        
        else if(e.getSource() ==b6)
        l.setText(last+"6");
        
        else if(e.getSource() ==b7)
        l.setText(last+"7");
        
        else if(e.getSource() ==b8)
        l.setText(last+"8");
        
        else if(e.getSource() ==b9)
        l.setText(last+"9");
        
        else if(e.getSource() ==b10)
        l.setText(last+"+");
        
        else if(e.getSource() ==b11)
        l.setText(last+"-");
        
        else if(e.getSource() ==b12)
        l.setText(last+"*");
        
        else if(e.getSource() ==b13)
        l.setText(last+"/");
        
    }
    
    public static void main(String args[]){
        
        new calculator();
    }

}