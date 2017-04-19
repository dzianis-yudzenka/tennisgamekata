![sg](../images/logo.png)
    
     __ \     _)            _)       \ \   /          |                |
     |   |_  / |  _` | __ \  |  __|   \   / |   |  _` |_  /  _ \ __ \  |  / _` |
     |   |  /  | (   | |   | |\__ \      |  |   | (   |  /   __/ |   |   < (   |
    ____/ ___|_|\__,_|_|  _|_|____/     _| \__,_|\__,_|___|\___|_|  _|_|\_\__,_|
    
# Set Environment

Copyright © Dzianis Yudzenka, 2017. All rights reserved.
Developer: Dzianis Yudzenka <Dzianis.Yudzenka@gmail.com>
Version: 1.0
Since: 4/19/2017


## Set Java environment

Set the `JAVA_HOME` environment variable to point to the base directory location where Java is installed on your machine. 
For example:

| OS      | Output                                                                                        |
|---------|---------------------------------------------------------------------------------------------- |
| Windows | Set the environment variable `JAVA_HOME` to `C:\Program Files\Java\jdk`                       |
| UNIX    | `export JAVA_HOME=/usr/local/java-current`                                                    |

### Append Java to System Path.

| OS      | Output                                                                                        |
|---------|---------------------------------------------------------------------------------------------- |
| Windows | Append the string `;C:\Program Files\Java\jdk\bin` to the end of the system variable, `Path`. |
| UNIX    | `export PATH=$PATH:$JAVA_HOME/bin/`                                                           |


## Set Maven environment

Add `M2_HOME`, `M2`, `MAVEN_OPTS` to environment variables.

| OS      | Output                                                                                        |
|---------|---------------------------------------------------------------------------------------------- |
| Windows | Set the environment variables using system properties.                                        |
|         | `M2_HOME=C:\Program Files\Apache Software Foundation\maven`                                   |
|         | `M2=%M2_HOME%\bin`                                                                            |
|         | `MAVEN_OPTS=-Xms256m -Xmx512m`                                                                |
| UNIX    | Open command terminal and set environment variables.                                          |
|         | `export M2_HOME=/usr/local/apache-maven/maven`                                                |
|         | `export M2=$M2_HOME/bin`                                                                      |
|         | `export MAVEN_OPTS=-Xms256m -Xmx512m`                                                         |

### Add Maven to System Path

Now append `M2` variable to _System Path_.

| OS      | Output                                                                                        |
|---------|---------------------------------------------------------------------------------------------- |
| Windows | Append the string `;%M2%` to the end of the system variable, `Path`.                          |
| UNIX    | `export PATH=$M2:$PATH`                                                                       |


## Verify Java & Maven install

Now open console and execute the following _java_ and _mvn_ command.

| OS             | Task                            | Command                                              |
|----------------|---------------------------------|------------------------------------------------------|
| Windows / UNIX | Open Command Console / Terminal | `java -version`                                      |
| Windows / UNIX | Open Command Console / Terminal | `mvn --version`                                      |


## GL & HF :)

![logo](../images/sg.jpg)
