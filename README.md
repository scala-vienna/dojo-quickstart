# Quick-start project for Scala Coding Dojos

Provides:

* IDE project generation (Eclipse and IntelliJ IDEA)
* Unit-Test support out-of-the box

Requires:

* **SBT 0.13** (to use SBT 0.12 switch to [branch sbt12](https://github.com/scala-vienna/dojo-quickstart/tree/sbt12))
* Scala 2.10.3 (you will need an IDE that supports it)
* An IDE with unit-testing support, like:
* 1. Eclipse with the Scala-IDE plugins
* 2. IntelliJ IDEA with the Scala plugin

## How-to: use this project

1. [Install SBT](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html) (0.13 or later)
1. Clone this repository to your local computer
1. `cd dojo-quickstart`
1. Type `sbt`
1. On the SBT prompt type either `eclipse` or `gen-idea` to generate Eclipse and IntelliJ IDEA project files.
1. Import the project into your IDE.
1. Start coding! ;-)

## Further customization (optional)

If you want to change the generic names of this quick-start project, follow these instructions:

1. Remove the project from the IDE and exit sbt
1. Rename the directory to your liking
1. Go to `build.sbt` and change the `name` of the project
1. Enter `sbt` again and re-generate the IDE project either with `eclipse` or `gen-idea`
1. Import the project into your IDE
1. Change the name of the main classes, packages, etc.

When re-naming packages, make sure that you rename them **both** under "main" and "test".