package ClassDemos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


class LocalClassExample  {
    JButton comp = new JButton();

    LocalClassExample() {
	class MyListener implements ActionListener{
                @Override
		public void actionPerformed(ActionEvent e) {
                    //Do stuff
                }
	}
        MyListener l = new MyListener();
        comp.addActionListener(l);
    }
}


