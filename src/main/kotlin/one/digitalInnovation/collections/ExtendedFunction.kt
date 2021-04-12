package one.digitalInnovation.collections

import java.math.BigDecimal

fun Array<BigDecimal>.summation() = this.reduce {
    ac, valor -> ac + valor
}

fun Array<BigDecimal>.average() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.summation() / this.size.toBigDecimal()