import org.junit.Test

import org.junit.Assert.*

class HelloTest {

    @Test
    fun returnHello() {
        val hello = Hello()
        assertEquals("Hello", hello.returnHello())
    }
}