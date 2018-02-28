package org.adridadou.scaladiff

object OperationType extends Enum {
  case object Insert extends OperationType.Value; Insert
  case object Delete extends OperationType.Value; Delete
  case object Equals extends OperationType.Value; Equals
}
