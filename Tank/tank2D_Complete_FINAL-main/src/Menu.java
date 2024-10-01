import java.awt.*;

public class Menu {

    public Rectangle playButton = new Rectangle(350, 200, 150, 50);
    public Rectangle controlButton = new Rectangle(350, 300, 150, 50);
    public Rectangle exitButton = new Rectangle(350, 400, 150, 50);

    public void render(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g.setColor(Color.black);
        g.fillRect(0, 0, 800, 630);

        Font font = new Font("Arial", Font.BOLD, 50);
        g.setFont(font);
        g.setColor(Color.white);
        drawCenteredString(g, "TANK 2D", new Rectangle(25, 100, 800, 50), font);

        Font buttonFont = new Font("Arial", Font.BOLD, 30);
        drawCenteredString(g, "Play", playButton, buttonFont);
        drawCenteredString(g, "Control", controlButton, buttonFont);
        drawCenteredString(g, "Exit", exitButton, buttonFont);

        g2d.draw(playButton);
        g2d.draw(controlButton);
        g2d.draw(exitButton);
    }

    private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
        FontMetrics metrics = g.getFontMetrics(font);
        int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
        int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
        g.setFont(font);
        g.drawString(text, x, y);
    }
}
