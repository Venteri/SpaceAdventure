package pack1;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Label extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g;

		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		if(Var.inSpiel) {
		
		g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
		g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);

		for (int i = 0; i <= 4; i++) {
			g.drawImage(Var.ischrott1, Var.schrottx1[i], Var.schrotty1[i], 48, 38, null);
		}
		for (int i = 0; i <= 1; i++) {
			g.drawImage(Var.ischrott2, Var.schrottx2[i], Var.schrotty2[i], 48, 38, null);
		}
		g.drawImage(Var.ischrott3, Var.schrottx3, Var.schrotty3, 48, 38, null);

		for (int i = 0; i <= 4; i++) {
			g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 60, 80, null);
		}
		
		if(Var.schusskollision==true) {
			g.drawImage(Var.gifgegner, Var.posgegnerx, Var.posgegnery, 60, 80, null);
		}

		if(Var.schildanzahl >0 && Var.schildanzahl <= Var.ischild.length) {
			g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-20, Var.y-5, 90, 100, null);
		}else if (Var.schildanzahl>Var.ischild.length) {
			g.drawImage(Var.ischild[Var.schildarraymax], Var.x-20, Var.y-5, 90, 100, null);
		}
		
		if (Var.flammeanimation == 0) {
			g.drawImage(Var.iflamme1, Var.x - 3, Var.y + 65, 50, 50, null);
		} else if (Var.flammeanimation == 1) {
			g.drawImage(Var.iflamme2, Var.x - 3, Var.y + 65, 50, 50, null);
		}
		
		if(Var.bolschuss == true) {
			g.drawImage(Var.gifschuss, Var.schussx, Var.schussy, 40, 40, null);
		}
		
		

		g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
		
		g.drawImage(Var.ileben, 610, 500, 50, 50, null);
		g.setFont(new Font("Arial", Font.BOLD, 55));
		g.drawString(""+Var.leben, 660, 545);
		g.setFont(new Font("Arial", Font.BOLD, 25));
		g.drawString("/ "+Var.maxleben, 730, 545);
		
		g.drawImage(Var.iammo, 20, 495, 64, 64, null);
		g.setFont(new Font("Arial", Font.BOLD, 55));
		g.drawString(""+Var.ammo, 90, 545);
		g.setFont(new Font("Arial", Font.BOLD, 25));
		
		repaint();
		

		if (Var.verloren) {
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 25));
			g.drawString("Punkte:" + Var.schrott, 310, 200);
			g.setColor(new Color(100,100,100,128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenhight);
			repaint();
		} else {
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			g.drawString("Punkte:" + Var.schrott, 20, 50);
			repaint();

		}
		
		if(Var.kollidiert) {
			
			for(int i=0;i<=16;i++) {
				if(Var.expanimation==i) {
					g.drawImage(Var.iexplosion[i], Var.x - 10, Var.y-10,73,100,null);
				}
			
			}
			
			
			if(Var.expanimation>1&&Var.expanimation<=4) {
				g.setColor(new Color(230, 0, 0, 45));
				g.fillRect(0, 0, Var.screenwidth, Var.screenhight);
			}else if (Var.expanimation>=6&&Var.expanimation<=9) {
				g.setColor(new Color(230,0,0,45));
				g.fillRect(0, 0, Var.screenwidth, Var.screenhight);
			}
			
		}

		repaint();
		
		}else if(Var.inMenü||Var.inOptionen||Var.inShop) {
			
			
			g.drawImage(Var.ib1, 0, Var.backgroundY1, 800, 600, null);
			g.drawImage(Var.ib2, 0, Var.backgroundY2, 800, 600, null);
			
			if(Var.schildanzahl >0 && Var.schildanzahl <= Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildanzahl-1], Var.x-20, Var.y-5, 90, 100, null);
			}else if (Var.schildanzahl>Var.ischild.length) {
				g.drawImage(Var.ischild[Var.schildarraymax], Var.x-20, Var.y-5, 90, 100, null);
			}
			
			if (Var.flammeanimation == 0) {
				g.drawImage(Var.iflamme1, Var.x - 3, Var.y + 65, 50, 50, null);
			} else if (Var.flammeanimation == 1) {
				g.drawImage(Var.iflamme2, Var.x - 3, Var.y + 65, 50, 50, null);
			}
			
			g.drawImage(Var.irakete, Var.x, Var.y, 50, 70, null);
			
			if(Var.schusskollision==true) {
				g.drawImage(Var.gifgegner, Var.posgegnerx, Var.posgegnery, 60, 80, null);
			}
			
			if(Var.bolschuss == true) {
				g.drawImage(Var.gifschuss, Var.schussx, Var.schussy, 40, 40, null);
			}
			
			for (int i = 0; i <= 4; i++) {
				g.drawImage(Var.igegner1, Var.gegnerx[i], Var.gegnery[i], 60, 80, null);
			}
			
			g.setColor(new Color(100,100,100,128));
			g.fillRect(0, 0, Var.screenwidth, Var.screenhight);
			
		
			
			if (Var.verloren) {
				g.setColor(new Color(0, 230, 115));
				g.setFont(new Font("Arial", Font.BOLD, 25));
				g.drawString("Punkte:" + Var.schrott, 310, 200);
			repaint();
			}
			
			if(Var.inShop) {
				g.setColor(new Color (0,230,115));
				g.setFont(new Font("Arial",Font.BOLD,35));
				g.drawString("Punkte:" + Var.schrott, 310, 200);
				
				g.drawString("Leben", 75, 340);
				g.drawString("Schüsse", 75, 415);
				g.drawString("Plasmaschild", 75, 485);
				
				g.drawString("St." + Var.up1anzahl, 550, 340);
				g.drawString("Übrig:"+ Var.ammo, 550, 415);
				g.drawString("St." + Var.up3anzahl, 550, 485);
				
				g.drawString(Var.up1preis+" Pkt.", 310, 340);
				g.drawString(Var.up2preis+" Pkt.", 310, 415);
				g.drawString(Var.up3preis+" Pkt.", 310, 485);
				
				g.drawString(Var.uplebenpreis+" Pkt.", 675, 185);
				g.drawImage(Var.ileben, 590, 195, 50, 50, null);
				g.drawString("+1", 650, 235);
				
				g.setColor(Color.BLACK);
				g.drawLine(50, 362, 750, 362);
				g.drawLine(50, 438, 750, 438);
				
				g.drawLine(300, 300, 300, 500);
				
				repaint();
			}
			g.setColor(new Color(0, 230, 115));
			g.setFont(new Font("Arial", Font.BOLD, 35));
			
		}
		
	}

}
