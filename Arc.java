import java.awt.*;

public class Arc extends Shape{

    private int startAngle;
    private int arcAngle;

    public Arc() {
        super();
        startAngle = 30;
        arcAngle = 70;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }

}
