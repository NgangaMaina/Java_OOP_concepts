package Decorators;

import java.text.DecimalFormat;

public class FormatDecorator extends RectangleDecorator {
    private String format;

    public FormatDecorator(Recctangle rectangle, String format) {
        super((Recctangle) rectangle);
        this.format = format;
    }

    @Override
    public String formattedArea() {
        double area = area();
        switch (format.toLowerCase()) {
            case "scientific":
                return new DecimalFormat("0.###E0").format(area);
            case "decimal":
            default:
                return new DecimalFormat("#.##").format(area);
        }
    }
}

