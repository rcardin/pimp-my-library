package org.rcardin

import java.time.Period

package object extension {
  implicit class ExtendedInt(val integer: Int) extends AnyVal {
    def days = Period.ofDays(integer)
  }
}
