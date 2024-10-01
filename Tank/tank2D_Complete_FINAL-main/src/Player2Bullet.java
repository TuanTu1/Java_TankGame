import java.awt.Color;
import java.awt.Graphics;

public class Player2Bullet {
	private double x, y;
	public int speed = 8;

	public Player2Bullet(double x, double y) {
		Sound.BulletFire();
		this.x = x;
		this.y = y;
	}

	public void move(String face) {
		if (face.equals("right"))
			x += speed;
		else if (face.equals("left"))
			x -= speed;
		else if (face.equals("up"))
			y -= speed;
		else
			y += speed;
	}

	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillOval((int) x, (int) y, 10, 10);
	}

	public int getX() {
		return (int) x;
	}

	public int getY() {
		return (int) y;
	}

}