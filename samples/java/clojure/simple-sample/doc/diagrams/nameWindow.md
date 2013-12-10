# IImage Protocol

Define a protocol for reading, showing, transforming and writing
images. The functions of the protocol should work with every kind of
format for images.

You can read and image from a png/jpg/etc file or you can read an
image from a Matrix or whatever. Same thing about showing,
transforming and even writing.

Ideally the IImage protocol should then supports the following behaviors:

* `read`
* `show`
* `process or transform`
* `write`

All the internals of the OpenCV lib should be hidden to the developer
playing at the REPL.

The `show` and the `write` functions are for side-effect only and
should return `nil` (think about exceptions).

What has to return the `read`? And the `process`? The `process`
function should return an image in the same format of the input image
format.

The `read` should return an image in some format representation. I
don't know in which format. The format of the output could depend on
the intention of the next functions to be applied to them. I would say
that the best thing could be to return an image.




