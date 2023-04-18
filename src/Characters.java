import javax.swing.ImageIcon;

public class Characters {

	public int x, y, w, h;
	public ImageIcon img;
	
	Characters(int xV, int yV, int wV, int hV, ImageIcon i){
		
		x = xV;
		y = yV;
		w = wV;
		h = hV;
		
		img = i;
		
	}
	
	
//	Getters
	public int getX() {
		return x;
	}
	public int gety() {
		return y;
	}
	public int getw() {
		return w;
	}
	public int geth() {
		return h;
	}
	public ImageIcon getImg() {
		return img;
	}
	
//	setter
}
