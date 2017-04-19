![sg](images/logo.png)
    
     __ \     _)            _)       \ \   /          |                |
     |   |_  / |  _` | __ \  |  __|   \   / |   |  _` |_  /  _ \ __ \  |  / _` |
     |   |  /  | (   | |   | |\__ \      |  |   | (   |  /   __/ |   |   < (   |
    ____/ ___|_|\__,_|_|  _|_|____/     _| \__,_|\__,_|___|\___|_|  _|_|\_\__,_|

Copyright © Dzianis Yudzenka, 2017. All rights reserved.
Developer: Dzianis Yudzenka <Dzianis.Yudzenka@gmail.com>
Version: 1.0
Since: 4/19/2017

Technologies: 

* Java 8, Maven (wrapper), The Takari Lifecycle...

# Tennis Game Kata


## About

Please click the following link for the details: [About](docs/about.md)


## Set Environment

| Variable          | Value                      |
|-------------------|----------------------------|
| `JAVA_HOME `      | `<Java install dir> `      |
| `M2        `      | `%M2_HOME%\bin      `      |
| `M2_HOME   `      | `<Maven install dir>`      |
| `MAVEN_OPTS`      | `-Xms256m -Xmx512m  `      |

Assumed that the 

* `JAVA_HOME`
* `M2`
* `MAVEN_OPTS`

variables appended to the `Path` (Windows) or `PATH` (UNIX) variable.

Please click the following link for the details: [Set Environment](docs/set_env.md)

**Reboot a computer.**


## Build & Run

1. Open a command line and navigate to the root directory of this project.
2. Type this command to build and deploy the archive:

        mvn install -P prod
        mvn exec:java -Dexec.mainClass="fr.societegenerale.tennis.TennisGameStarter"


## Other

* If you have some problems, please click the following link for the details: [Troubleshooting](docs/trouble.md)
* For future plans and improvements see: [TODO](docs/TODO.txt)


## GL & HF :)

![logo](images/sg.jpg)
