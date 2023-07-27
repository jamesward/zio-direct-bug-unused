import zio.*
import zio.direct.*

object App extends ZIOAppDefault:
  override def run =
    defer:
      ZIO.debug("hello, world").run
      ()
