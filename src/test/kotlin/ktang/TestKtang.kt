package ktang

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestKtang {

    @Test
    fun testStringTimes() {
        assertEquals("hello" * 1, "hello", "times")
    }

    @Test
    fun testStringTimes2() {
        assertEquals("hello" * 2, "hellohello", "times")
    }

    @Test
    fun testTime() {
        val (d, r) = time {
            Thread.sleep(1000)

            "hello"
        }

        assertEquals("hello", r)
        assertTrue { d >= 1000 }

        val (d2, r2) = time here@{
            Thread.sleep(1000)

            return@here "hello2"
        }

        assertEquals("hello2", r2)
        assertTrue { d2 >= 1000 }
    }
}
