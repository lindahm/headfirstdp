package com.app.headfirst;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MallardDuckTest {

    @Test
    void flyBehavior() {
        Duck mallardDuck = new MallardDuck();
        assertThat(mallardDuck.getFlyBehavior()).isInstanceOf(FlyWithWings.class);
        assertThat(mallardDuck.getQuackBehavior()).isInstanceOf(Quack.class);
    }
}