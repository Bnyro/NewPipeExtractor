package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;

/**
 * Screen position of the info card.
 */
public final class InfoCardPosition implements Serializable {
    private final double top;
    private final double left;
    private final double width;
    private final double aspectRatio;

    public InfoCardPosition(
            final double top,
            final double left,
            final double width,
            final double aspectRatio
    ) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.aspectRatio = aspectRatio;
    }

    public double getLeft() {
        return left;
    }

    public double getTop() {
        return top;
    }

    public double getWidth() {
        return width;
    }

    public double getAspectRatio() {
        return aspectRatio;
    }
}
