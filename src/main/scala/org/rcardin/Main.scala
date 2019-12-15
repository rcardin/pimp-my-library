package org.rcardin

import java.time.Period

object Main extends App {
  import extension._
  val days: Period = 42.days
  println(days)
}
