import org.scalatest.funsuite.AnyFunSuite
class testQuestion1 extends  AnyFunSuite {

  test("Question1"){
    assert(Question1.max_num(10,20)===20)
    assert(Question1.max_sized_tuple((26,4,99),Question1.max_num)===99)
  }
}
