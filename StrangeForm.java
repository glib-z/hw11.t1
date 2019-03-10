package gz.hw11.t1;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class StrangeForm extends Figure {

    StrangeForm(GraphicsContext gc, double x, double y) {
        super(gc, x, y);
    }

    @Override
    public void draw() {
        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.fillRect(x, y, DIAMETER, DIAMETER);
        gc.strokeRect(x, y, DIAMETER, DIAMETER);

        gc.setFill(Color.YELLOW);
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        gc.fillOval(x + 5, y + 5, DIAMETER, DIAMETER);
        gc.strokeOval(x + 5, y + 5, DIAMETER, DIAMETER);

    }

}
