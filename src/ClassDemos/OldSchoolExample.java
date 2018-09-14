package ClassDemos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


class OldSchoolExample implements ActionListener {
    JButton comp = new JButton();
    
    OldSchoolExample() {
        comp.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){ 
        //Do stuff
    }
}