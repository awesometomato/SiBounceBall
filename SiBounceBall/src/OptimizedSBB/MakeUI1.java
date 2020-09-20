package OptimizedSBB;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

class MakeUI1 extends JFrame {
	public static JFrame f;
	//private Image screenImage;
	//private Graphics screenGraphics;

	private ArrayList<ImageIcon> stageImage = new ArrayList<ImageIcon>();
	private ArrayList<JButton> stageButton = new ArrayList<JButton>();
	private Image startBackground = new ImageIcon(SBBMain.class.getResource("../Image/startBackground.jpeg")).getImage();
	private Image stageBackground = new ImageIcon(SBBMain.class.getResource("../Image/stageBackground.jpeg")).getImage();
	private Image manualImage = new ImageIcon(SBBMain.class.getResource("../Image/manual.png")).getImage();
	private JButton startButton = new JButton(new ImageIcon(SBBMain.class.getResource("../Image/start_button1.png")));
	private JButton manual = new JButton(new ImageIcon(SBBMain.class.getResource("../Image/gamemanual.png")));
	private JButton Rar = new JButton(new ImageIcon(SBBMain.class.getResource("../Image/Rar.png")));
	private JButton Lar = new JButton(new ImageIcon(SBBMain.class.getResource("../Image/Lar.png")));
	private JButton btn = new JButton(new ImageIcon(SBBMain.class.getResource("../Image/back.png")));
	
	
	private int stageNum=1;
	private static int i;
	public MakeUI1(){
		MakeImage();
		JFrame f = new JFrame();
		f.setTitle("SibounceBall");
		f.setSize(800, 620);
		f.setResizable(false);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyPanel panel = new MyPanel();
        Stage panel1 = new Stage();
        Menual panel2 = new Menual();
        startButton.setBounds(330, 80, 119, 49);
        startButton.addMouseListener(new MouseAdapter(){
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		startButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        	}
        	@Override
        	public void mousePressed(MouseEvent e) {
        		//게임 시작 이벤트 
        		System.out.println("1");
        		startButton.setVisible(false);
        		btn.setVisible(true);
        		manual.setVisible(false);
        		panel.setVisible(false);
        		Rar.setVisible(true);
        		f.add(panel1);
        		panel1.setVisible(true);
        		for(int i=0;i<4;i++) {
        			stageButton.get(i).setVisible(true);
        		}
        	}
        });
		startButton.setBorderPainted(false);
		startButton.setContentAreaFilled(false);
		startButton.setFocusPainted(false);
		f.add(startButton);
		
		manual.setBounds(650, 515, 137, 62);
        manual.addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		startButton.setVisible(false);
        		manual.setVisible(false);
        		btn.setVisible(true);
        		panel.setVisible(false);
        		panel2.setVisible(true);
        		f.add(panel2);
        	}
        });
        manual.setBorderPainted(false);
        manual.setContentAreaFilled(false);
        manual.setFocusPainted(false);
		f.add(manual);
		
		btn.setBounds(10, 10, 50, 50);
		btn.addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		panel.setVisible(true);
        		panel1.setVisible(false);
        		for(int i=0;i<8;i++) {
        			stageButton.get(i).setVisible(false);
        		}
        		Lar.setVisible(false);
        		Rar.setVisible(false);
        		manual.setVisible(true);
        		btn.setVisible(false);
        		startButton.setVisible(true);
        		panel1.setVisible(false);
        		panel2.setVisible(false);
        		
        	}
        });
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		f.setFocusable(true);
		f.add(btn);
		btn.setVisible(false);
		
		Lar.setBounds(37, 500, 41, 45);
		Lar.addMouseListener(new MouseAdapter(){
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		Lar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		Lar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        	}
        	@Override
        	public void mousePressed(MouseEvent e) {
        		stageNum=1;
        		switch(stageNum) {
        			case 1:
        				for(int i=0;i<4;i++) {
                			stageButton.get(i).setVisible(true);
                		}
        				for(int i=4;i<8;i++) {
                			stageButton.get(i).setVisible(false);
                		}
        				Lar.setVisible(false);
        				Rar.setVisible(true);
        				
        				break;
        			case 2:
        				break;
        			default :
        				System.out.println("stageNum Error : ");
        				break;
        		}	
        	}
        });
		Lar.setBorderPainted(false);
		Lar.setContentAreaFilled(false);
		Lar.setFocusPainted(false);
		f.add(Lar);
		Lar.setVisible(false);
		
		Rar.setBounds(724, 500, 39, 45);
		Rar.addMouseListener(new MouseAdapter(){
        	@Override
        	public void mouseEntered(MouseEvent e) {
        		Rar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		Rar.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        	}
        	@Override
        	public void mousePressed(MouseEvent e) {
        		stageNum=2;
        		switch(stageNum) {
    			case 1:
    				break;
    			case 2:
    				for(int i=4;i<8;i++) {
            			stageButton.get(i).setVisible(true);
            		}
    				for(int i=0;i<4;i++) {
            			stageButton.get(i).setVisible(false);
            		}
    				Rar.setVisible(false);
    				Lar.setVisible(true);
    				break;
    			default :
    				System.out.println("stageNum Error : ");
    				break;
    		}	
        	}
        });
		Rar.setBorderPainted(false);
		Rar.setContentAreaFilled(false);
		Rar.setFocusPainted(false);
		f.add(Rar);
		Rar.setVisible(false);
		
		for(i=0;i<8;i++) {
			switch(i%4) {
				case 0:
					stageButton.get(i).setBounds(175, 120, 200, 150);
					break;
				case 1:
					stageButton.get(i).setBounds(425, 120, 200, 150);
					break;
				case 2:
					stageButton.get(i).setBounds(175, 350, 200, 150);
					break;
				case 3:
					stageButton.get(i).setBounds(425, 350, 200, 150);
					break;
				default :
					System.out.println("Error : ");
					break;
			}
			f.add(stageButton.get(i));
			stageButton.get(i).setVisible(false);
			
		}
		
		stageButton.get(0).addMouseListener(new MouseAdapter(){
           	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=1;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(1).addMouseListener(new MouseAdapter(){
           	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=2;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(2).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=3;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(3).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=4;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(4).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=5;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(5).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=6;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(6).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=7;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		
		stageButton.get(7).addMouseListener(new MouseAdapter(){
        	@Override
        	public void mousePressed(MouseEvent e) {
        		SBBMain.sceneNum=8;
        		SBBMain.f.setVisible(true);
        		f.setVisible(false);
        	}
        });
		f.add(panel);
		f.setVisible(true);
    }
	private void MakeImage() {
		for(i=0;i<8;i++) {
			stageImage.add(new ImageIcon(SBBMain.class.getResource("../Image/"+String.valueOf(i+1)+".png")));
			stageButton.add(new JButton(stageImage.get(i)));
		}
	}
	class MyPanel extends JPanel{
        public void paintComponent(Graphics g){
        	super.paintComponent(g);
            g.drawImage(startBackground, 0, 0, null);
        }
    }
	class Stage extends JPanel{
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            
            g.drawImage(stageBackground, 0, 0, null);
            g.setColor(Color.WHITE);
            g.fillRect(175-3, 120-3, 200+6, 150+6);
            g.fillRect(425-3, 120-3, 200+6, 150+6);
            g.fillRect(175-3, 350-3, 200+6, 150+6);
            g.fillRect(425-3, 350-3, 200+6, 150+6);
            g.setFont(new Font("Courier New", Font.BOLD, 40));
            g.drawString(String.format("STAGE"), 340, 70);
            g.setFont(new Font("Courier New", Font.BOLD, 30));
            g.drawString(String.format("Level "+((stageNum-1)*4+1)), 210, 305);
            g.drawString(String.format("Level "+((stageNum-1)*4+2)), 460, 305);
            g.drawString(String.format("Level "+((stageNum-1)*4+3)), 210, 545);
            g.drawString(String.format("Level "+((stageNum-1)*4+4)), 460, 545);
        }
	}
	class Menual extends JPanel{
        public void paintComponent(Graphics g){
        	super.paintComponent(g);
            g.drawImage(manualImage, 0, 0, null);
        }
    }
	
}