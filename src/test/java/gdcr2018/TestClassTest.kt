package gdcr2018

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class TestClassTest {

    @Test
    fun test() {
        val mockValue = 456
        val mockTestDependency = mockk<TestDependency>()
        every { mockTestDependency.myFun() } returns mockValue

        val testClass = TestClass(mockTestDependency)

        assertThat(testClass.testFun()).isEqualTo(mockValue)
        verify { mockTestDependency.myFun() }
    }
}