package com;

import javax.swing.JFrame;

import java.awt.EventQueue;
import java.awt.Toolkit;

public class mainclass extends JFrame {

	public mainclass() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				".\\img_btn_play.png"));

		setTitle("flag_poligon_move");
		setBounds(100, 100, 740, 480);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new board());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new mainclass().setVisible(true);
			}
		});
	}

}
