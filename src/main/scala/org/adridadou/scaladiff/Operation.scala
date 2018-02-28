package org.adridadou.scaladiff

case class Operation(op: OperationType.Value, text: String) {
  override def toString: String = {
    import OperationType._
    op match {
      case Insert => s"+$text"
      case Delete => s"-$text"
      case Equals => text
    }
  }
}
