package ClassDemos;

import javax.swing.JButton;


public class LambdaExample  {
    JButton comp = new JButton();
    
    LambdaExample() {
        comp.addActionListener(l -> { /*Do stuff*/ });
    }
}
