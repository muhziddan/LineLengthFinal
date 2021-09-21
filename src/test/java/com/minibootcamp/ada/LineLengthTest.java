package com.minibootcamp.ada;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineLengthTest {

    @Test
    public void testCalculateZeroLengthLineGivenTwoIdenticalPointsOnOriginExpectReturnZero() {
        LineLength lineLength = new LineLength();

        assertEquals(0, lineLength.calculateZeroLengthLine());
    }
}
