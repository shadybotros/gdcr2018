package gdcr2018

class TestClass(private val testDependency: TestDependency) {

    fun testFun() = testDependency.myFun()
}

class TestDependency {

    fun myFun() = 123
}