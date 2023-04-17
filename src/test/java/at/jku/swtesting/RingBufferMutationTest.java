package at.jku.swtesting;

import org.junit.jupiter.api.Test;

import static at.jku.swtesting.utils.TestUtils.*;
import static at.jku.swtesting.utils.TestUtils.SECOND_ITEM;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RingBufferMutationTest {
    @Test
    public void smallest_capacity_test(){
        var buffer = new RingBuffer<Integer>((short)1);
        assertEquals(1, buffer.capacity());
    }
    @Test
    public void dequeue_order_test(){
        var buffer = new RingBuffer<String>((short)3);
        buffer.enqueue(FISRT_ITEM);
        buffer.enqueue(SECOND_ITEM);
        buffer.enqueue(THIRD_ITEM);

        assertEquals(FISRT_ITEM, buffer.dequeue());
        assertEquals(SECOND_ITEM, buffer.dequeue());
        assertEquals(THIRD_ITEM, buffer.dequeue());
    }
}
