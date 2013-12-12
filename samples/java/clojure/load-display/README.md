# Fill the Gap

In the [previous tutorial][1] we saw how to setup OpenCV and CLojure
(CLJ) to be able to interactively learn the OpenCV lib by using the
Clojure REPL.

We learnt how to:

* instantiate few opencv classes (.e.g. `Point`, `Rect`, etc.);
* read a `.png` image into a `Mat` instance from a file by using the
  `imread` static method of the `Highgui` opencv class;
* blur the `Mat` instance of the image by using the `GaussianBlur`
  static method of the `Imgproc` opencv class;
* save the blurred `Mat` instance into a `.png` file by using the
  `imwrite` static method of the `Highgui` opencv class.

    > NOTE 1: As you see, to read, transform and write the `.png`
    > image we only used statics methods from two opencv classes
    > (i.e. `Highgui` and `Imgproc`). If you take a look at the
    > [OpenCV Java API][2] for those two classes you'll discover that,
    > aside from the methods inherited from their hierarchies of
    > classes, they only offer static methods. This is one of the
    > large number of incidental complexities caused by any class
    > based OOP language. In this series of tutorials on OpenCV I'll
    > progressively try to overcome those incidental complexities by
    > introducing few abstraction layers that will make the usage of
    > OpenCV more friendly with a FP language like CLJ.

## What will do in this tutorial

This tutorial will fill the current gap between the C++ version of the
OpenCV lib with the corresponding Desktop Java platform missing
everything has to do with GUI stuff.

This gap is very unfortunate, because the interactive experience
offered by the CLJ REPL would be much more enjoyable if you could show
the resulting images while you process them from the REPL.

## Easy made complex

One of the direct solution to fill the above gap is to import the Java
Swing and then use the CLJ/Java high level of interoperability to
create windows and to show images through them.

### Create a new project

We already now how to create a new CLJ project by using `lein`:

```bash
lein new load-display
```

Now `cd` into the `load-display` folder created by the above `lein`
task and edit its `project.clj` as we did in the
[previous tutorial][1].

```clojure
(defproject load-display "0.1.0-SNAPSHOT"
  :description "A simple project to load and display an image from the REPL"
  :url "http://example.com/FIXME"
  :license {:name "BSD 3-Clause License"
            :url "http://opensource.org/licenses/BSD-3-Clause"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [opencv/opencv "2.4.7"]
                 [opencv/opencv-native "2.4.7"]
                 [seesaw "1.4.4"]]
  :injections [(clojure.lang.RT/loadLibrary org.opencv.core.Core/NATIVE_LIBRARY_NAME)])
```

Now execute the `lein repl` task from the home folder of the project.

```bash
lein repl
...
user=>
```

You already know that for interoperating with a Java lib you need to
import the classes you're going to use of that lib. At the moment we
want just to create a `JFrame` where later we're going to show an
image.

```clojure
user=> (def frame (JFram. "Hello, Swing"))
user=> (def f (JFrame. "Hello, Swing"))
#'user/f
user=> (.setSize f 200 200)
nil
```

The next step is to



To reach this goal we're going to use the Swing library
## Usage

FIXME

## License

Copyright © 2013 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
