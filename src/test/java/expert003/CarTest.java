package expert003;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration("expert003.xml")
public class CarTest {
    @Autowired
    Car car;

    @Test
    public void 미국브랜드_테스트(){
        Assertions.assertEquals("장착된 타이어: 미국 타이어", car.getTireBrand());
    }
}
