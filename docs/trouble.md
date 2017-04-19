![sg](../images/logo.png)
    
     __ \     _)            _)       \ \   /          |                |
     |   |_  / |  _` | __ \  |  __|   \   / |   |  _` |_  /  _ \ __ \  |  / _` |
     |   |  /  | (   | |   | |\__ \      |  |   | (   |  /   __/ |   |   < (   |
    ____/ ___|_|\__,_|_|  _|_|____/     _| \__,_|\__,_|___|\___|_|  _|_|\_\__,_|
    
# Troubleshooting

Copyright © Dzianis Yudzenka, 2017. All rights reserved.
Developer: Dzianis Yudzenka <Dzianis.Yudzenka@gmail.com>
Version: 1.0
Since: 4/19/2017


## Run single threaded build

        mvn -T1 install:


## Run standard build strategy
Build for _SonarQube_ conflicts with _Smart Builder_. Because of `--builder smart` option is turned on by default.

        mvn --builder multithreaded sonar:sonar

or

        mvn --builder singlethreaded sonar:sonar


## Nexus M2 mirror global-settings

        .mvn/settings.xml


## GL & HF :)

![logo](../images/sg.jpg)
