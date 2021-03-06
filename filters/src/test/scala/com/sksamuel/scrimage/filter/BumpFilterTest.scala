package com.sksamuel.scrimage.filter

import org.scalatest.{OneInstancePerTest, BeforeAndAfter, FunSuite}
import com.sksamuel.scrimage.Image

/** @author Stephen Samuel */
class BumpFilterTest extends FunSuite with BeforeAndAfter with OneInstancePerTest {

    val original = getClass.getResourceAsStream("/bird_small.png")
    val expected = getClass.getResourceAsStream("/com/sksamuel/scrimage/filters/bird_small_bump.png")

    test("filter output matches expected") {
        assert(Image(original).filter(BumpFilter) === Image(expected))
    }
}
