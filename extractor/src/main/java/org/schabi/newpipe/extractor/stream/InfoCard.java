package org.schabi.newpipe.extractor.stream;

import java.io.Serializable;

/**
 * Card that is supposed to be shown at a specific time of the video.
 */
public final class InfoCard implements Serializable {
    private final InfoCardPosition screenPosition;
    private final long startTimeMs;
    private final long endTimeMs;

    public InfoCard(
            final InfoCardPosition screenPosition,
            final long startTimeMs,
            final long endTimeMs
    ) {
        this.screenPosition = screenPosition;
        this.startTimeMs = startTimeMs;
        this.endTimeMs = endTimeMs;
    }

    public InfoCardPosition getScreenPosition() {
        return screenPosition;
    }

    public long getStartTimeMs() {
        return startTimeMs;
    }

    public long getEndTimeMs() {
        return endTimeMs;
    }
}
