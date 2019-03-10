package gz.hw11.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ball extends Figure {

    Ball(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }

    @Override
    public void draw() {
        gc.setFill(Color.RED);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.fillOval(x, y, DIAMETER, DIAMETER);
        gc.strokeOval(x, y, DIAMETER, DIAMETER);
    }

}
