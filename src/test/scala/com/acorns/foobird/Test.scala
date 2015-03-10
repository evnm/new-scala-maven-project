package com.acorns.newservice

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Test extends FunSuite {
  test("2 equals 2") {
    assert(2 === 2)
  }
}
