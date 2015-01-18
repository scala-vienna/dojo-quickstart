# Quick-start project for Scala Coding Dojos

Provides:

* Basic Scala project
* IDE project generation (Eclipse and IntelliJ IDEA)
* Unit-Test support out-of-the box

Requires:

* **SBT 0.13** (consider "sbt12" branch deprecated)
* Scala 2.11.4 (SBT will download this for you)
* Recommended: an IDE with unit-testing support, like:
    1. [Eclipse](http://www.eclipse.org/downloads/) plus the [Scala-IDE](http://scala-ide.org/download/current.html) plugins
    2. [Scala-IDE](http://scala-ide.org/download/sdk.html) (Eclipse with pre-configured Scala support)
    2. [IntelliJ IDEA](https://www.jetbrains.com/idea/) with the [Scala plugin](https://confluence.jetbrains.com/display/SCA/Getting+Started+with+IntelliJ+IDEA+Scala+Plugin)
* Alternatively, you can use any text-editor and run `sbt ~test` from the console

## How-to: use this project

1. [Install SBT](http://www.scala-sbt.org/0.13/tutorial/index.html) (0.13 or later!)
1. Clone this repository to your local computer
1. `cd dojo-quickstart`
1. Type `sbt`
1. Within the sbt-console, type `test`
1. You should see `All tests passed`

## How-to: generate IDE projects

1. On the sbt-console type either `eclipse` or `gen-idea`
1. Import the project into your IDE
1. Run tests from your IDE

## Further customization (optional!)

If you want to change the generic names of this quick-start project, follow these instructions:

1. Remove the project from the IDE and exit sbt
1. Rename the directory to your liking
1. Go to `build.sbt` and change the `name` of the project
1. Enter `sbt` again and re-generate the IDE project either with `eclipse` or `gen-idea`
1. Import the project into your IDE
1. Change the name of the main classes, packages, etc.

When re-naming packages, make sure that you rename them **both** under "main" and "test".