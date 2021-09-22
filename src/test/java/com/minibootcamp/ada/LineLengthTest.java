package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthTest {

    @Test
    public void testCalculateZeroLengthLineGivenTwoIdenticalPointsOnOriginExpectReturnZero() {
        LineLength lineLength = new LineLength();

        assertEquals(0, lineLength.calculateZeroLengthLine());
    }

    @Test
    public void testCalculateHorizontalFromOriginGivenSecondPointOnXAxisIsFiveExpectReturnFive() {
        LineLength lineLength = new LineLength();

        assertEquals(5, lineLength.calculateHorizontalFromOrigin(0, 5));
    }

    @Test
    public void testCalculateVerticalFromOriginGivenSecondPointOnYAxisIsSevenExpectReturnSeven() {
        LineLength lineLength = new LineLength();

        assertEquals(7, lineLength.calculateVerticalFromOrigin(0, 7));
    }
}
