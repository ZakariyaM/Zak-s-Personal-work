trait RectangleLike {
  this: java.awt.geom.Ellipse2D =>
  def translate(dx: Int, dy: Int) {
    setFrame(getX + dx, getY + dy, getWidth, getHeight)
  }

  def grow(dw: Int, dh: Int) {
    setFrame(getX, getY, getWidth + dw, getHeight + dh)
  }


}

val egg = new java.awt.geom.Ellipse2D.Double(5,10,20,30) with RectangleLike

egg.translate(10, 10)

assert( egg.getX == 15)
assert( egg.getY == 20)

egg.grow(10, 20)

assert( egg.getWidth == 30)
assert( egg.getHeight == 50)
