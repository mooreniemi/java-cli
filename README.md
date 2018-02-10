# java-cli

Just a basic CLI in Java using Spring Shell.

## how to run

```
gradle build
# gradle bootRun works, but garbles input
java -jar build/libs/java-cli-0.1.0.jar
```

When inside the shell (`shell:>`) you can try out `greet` or use `help` to see commands.

## project structure

`Bootstrap.class` just using Spring Boot to give a `main` for Spring Shell to plug into, and does the `ComponentScan` necessary to inject our `Greeter.class` into `HelloWorld.class`. `HelloWorld.class` is where the actual `ShellComponent` lives that defines the `greet` command.

```
.
├── build
│   ├── classes
│   │   └── java
│   │       └── main
│   │           └── hello
│   │               ├── Bootstrap.class
│   │               ├── Greeter.class
│   │               └── HelloWorld.class
│   ├── libs
│   │   └── java-cli-0.1.0.jar
│   ├── reports
│   │   └── checkstyle
│   │       ├── main.html
│   │       └── main.xml
│   └── tmp
│       ├── bootJar
│       │   └── MANIFEST.MF
│       └── compileJava
├── build.gradle
├── config
│   └── checkstyle
│       └── checkstyle.xml
├── README.md
├── spring-shell.log
└── src
    └── main
        └── java
            └── hello
                ├── Bootstrap.java
                ├── Greeter.java
                └── HelloWorld.java

17 directories, 14 files
```
