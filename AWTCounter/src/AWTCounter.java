

import java.awt.event.*;
import java.awt.*;

public class AWTCounter extends Frame {
    private Label lblCount;
    private TextField tfCount;
    private Button btnCount;
    private int count = 0;

    public AWTCounter (){
        setLayout(new FlowLayout());
        lblCount = new Label("counter");
        add(lblCount);

        tfCount = new TextField(count+ "",10);
        tfCount.setEditable(false);
        add(tfCount);

        btnCount = new Button("count");
        add(btnCount);

        BtnCountListener listener = new BtnCountListener();
        btnCount.addActionListener(listener);

        setTitle("AWTCounter");
        setSize(300, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        new AWTCounter();
    }

    private class BtnCountListener implements ActionListener {
        @Override
        public void  actionPerformed(ActionEvent evt){
            ++count;
            tfCount.setText(count +"");
        }

    }
}