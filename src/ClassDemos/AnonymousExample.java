package ClassDemos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


class AnonymousExample  {
    JButton comp = new JButton();
    
    AnonymousExample() {
        ActionListener l = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Do stuff
            }
        };
        comp.addActionListener(l);
    }
}