# What is COPI? #
The aim of this project is to provide a graphical tool helping users to sort their images (taken from different unsynchronized sources) by preparing a chronological order (timeshifting the exif-information and renaming).

All images coming from a certain device (by specifying a source directory) are rendered (using OpenGl) on a timeline that can be shifted towards the other timelines. When all timelines are properly justified all images with the differences obtained by the shifts are written to the specified target directory with an updated exif time and a time-formatted filename.

![http://copi.googlecode.com/files/COPI-Screenshot.jpg](http://copi.googlecode.com/files/COPI-Screenshot.jpg)

## Dependencies ##
  * Scala - http://www.scala-lang.org/
  * Eclipse SWT - http://www.eclipse.org/swt/
  * LWJGL Binding - http://lwjgl.org/
  * Apache Sanselan - http://commons.apache.org/sanselan/

## Building ##
There is a .project file in the `src` directory.

The best is either to use Eclipse with the Scala-Plugin and with a Mercurial-Eclipse-Plugin (www.vectrace.com/mercurialeclipse/):
  * active the checkbox _search for .project files ..._
or if not using a Mercurial-Eclipse-Plugin import an _already existing project_.

### Classpath ###
Don't forget to setup the classpath to all the libraries (this is the case for Linux):
  * `<eclipse>/plugins/scala.tools.nsc_2.7.7.final.jar`
  * `<eclipse>/plugins/org.eclipse.swt.gtk.linux.x86_3.5.1.v3555a.jar`
  * `<lwjgl-lib>/lwjgl.jar`
  * `<lwjgl-lib>/lwjgl-debug.jar`
  * `<lwjgl-lib>/lwjgl_test.jar`
  * `<lwjgl-lib>/lwjgl_util.jar`
  * `<lwjgl-lib>/lwjgl_util_applet.jar`
  * `<sanselan-lib>/sanselan-0.97-incubator.jar`
  * `<sanselan-lib>/sanselan-0.97-incubator-javadoc.jar`
  * `<sanselan-lib>/sanselan-0.97-incubator-sources.jar`

### Run Configuration ###
When setting up the **Run Configurations** don't forget to address the nativ libraries:
  * on Linux: `-Djava.library.path="<lwjglnative>/linux"`
  * on Windows: `-Djava.library.path="<lwjglnative>/windows"`

## Packaging & Execution ##
Do an Eclipse Executable-Jar export (whether you include the libraries in the copi.jar file or put them in a external directory is doesn't matter).

Important is that beside the copi.jar file there is a directory `./lib/lwjglnative` that contains the opengl-native stuff.

If all things are done right, just execute with `java -jar copi.jar` or by a right-click and executing with Java.

or follow http://code.google.com/p/copi/downloads/list