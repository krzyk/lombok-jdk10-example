package com.kirela.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BarTest {
    @Test
    void returnsFive() {
        Assertions.assertEquals(5, new Bar().foo());
    }
}
