package ClassDemos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


class InnerClassExample  {
    JButton comp = new JButton();

    class MyListener implements ActionListener{
        @Override
	public void actionPerformed(ActionEvent e) {
            //Do stuff
        }
    }
    
    InnerClassExample() {
        MyListener l = new MyListener();
        comp.addActionListener(l);
    }
}
//Trots att MyListener är en inre klass går det att komma åt den utifrån, via InnerClassExample
class anotherClass{
    InnerClassExample i = new InnerClassExample();
    InnerClassExample.MyListener innerObject = i.new MyListener();
    InnerClassExample.MyListener innerObject2 = new InnerClassExample().new MyListener();
}
