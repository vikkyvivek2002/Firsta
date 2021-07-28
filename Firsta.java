import java.awt.*;  
import java.awt.event.*;  
class First extends Frame{  
First(){  
 
setSize(500,500);//frame size 300 width and 300 height  
setTitle("This is my First AWT example"); 
//setLayout(new FlowLayout());//Setting the layout for the Frame
setVisible(true);//now frame will be visible, by default not visible 

}  
public static void main(String args[]){  
First f=new First();  
}
}