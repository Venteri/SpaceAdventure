package pack1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	static int tempKeyHandler = 0;
	
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.movedown=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveleft=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveright=true;
		}
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			
			if(Var.bolschuss==false&&Var.ammo>0) {
				Var.bolschuss = true;
				Var.schussx = Var.x + 15;
				Var.schussy = Var.y - 45;
				Var.ammo--;
			}
		}
		
		if(tempKeyHandler ==0) {
			//Menü
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				Var.inSpiel = false;
				Var.inMenü = true;
				Var.inShop = false;
				Var.inOptionen = false;
				Var.btnresume.setVisible(true);
				Var.btnshop.setVisible(true);
				Var.btnoptionen.setVisible(false);
				Var.btnexit.setVisible(true);
				tempKeyHandler ++;
				}
		}else if (tempKeyHandler==1) {
			if(e.getKeyCode()==KeyEvent.VK_ESCAPE) {
				Var.inSpiel = true;
				Var.inMenü = false;
				Var.inShop = false;
				Var.inOptionen = false;
				Var.btnresume.setVisible(false);
				Var.btnshop.setVisible(false);
				Var.btnoptionen.setVisible(false);
				Var.btnexit.setVisible(false);
				
				Var.btnupgrade1.setVisible(false);
				Var.btnupgrade2.setVisible(false);
				Var.btnupgrade3.setVisible(false);
				Var.btnleben.setVisible(false);
				
				tempKeyHandler--;
				Aktualisierung.tempAktualisierung = 0;
			}
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			Var.moveup=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			Var.movedown=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			Var.moveleft=false;
		}
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			Var.moveright=false;
		}
		
	}
	

}
