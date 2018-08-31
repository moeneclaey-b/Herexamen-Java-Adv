package edu.ap.spring.view;

import edu.ap.spring.jpa.Quote;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Component
public class UI implements InitializingBean {

    private static final String newline = "\n";

	public UI (){
        initStart();
    }

    public void initStart(){
        JFrame jFrame = new JFrame();
        jFrame.setLayout(new GridLayout(1, 1));

        JButton jButton1 = new JButton();
        jButton1.setText("Initializeer");
        jButton1.setPreferredSize(new Dimension(40, 40));

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initAlles();
            }
        });

        jFrame.add(jButton1);

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public void initAlles(){
	    JFrame jFrame = new JFrame();
	    jFrame.setLayout(new GridLayout(2,1));

	    JButton jButton2 = new JButton();
	    jButton2.setText("Laad hele tekst");
        jButton2.setPreferredSize(new Dimension(40, 40));

	    JTextArea textArea = new JTextArea();
	    textArea.setPreferredSize(new Dimension(40, 40));

	    jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quote q = new Quote();
                textArea.append(q.loadFile() + newline);
            }
        });

	    jFrame.add(jButton2);
	    jFrame.add(textArea);

	    jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    jFrame.setVisible(true);
    }

	@Override
	public void afterPropertiesSet() throws Exception {
		System.setProperty("java.awt.headless", "false");
	}
}
