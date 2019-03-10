package gz.hw11.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square extends Figure {

    Square(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }

    @Override
    public void draw() {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.fillRect(x, y, DIAMETER, DIAMETER);
        gc.strokeRect(x, y, DIAMETER, DIAMETER);
    }

}
