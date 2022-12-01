package baseball.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComputerTest {

    public static final List<Integer> COMPUTER_NUMBER = List.of(1, 2, 3);

    @Test
    void 객체_생성_테스트() {
        Computer computer = Computer.createByNumber(COMPUTER_NUMBER);
        Assertions.assertEquals(COMPUTER_NUMBER.get(0), computer.getNumberByPosition(0));
        Assertions.assertEquals(COMPUTER_NUMBER.get(1), computer.getNumberByPosition(1));
        Assertions.assertEquals(COMPUTER_NUMBER.get(2), computer.getNumberByPosition(2));
    }
}