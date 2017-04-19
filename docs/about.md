![sg](../images/logo.png)

     __ \     _)            _)       \ \   /          |                |
     |   |_  / |  _` | __ \  |  __|   \   / |   |  _` |_  /  _ \ __ \  |  / _` |
     |   |  /  | (   | |   | |\__ \      |  |   | (   |  /   __/ |   |   < (   |
    ____/ ___|_|\__,_|_|  _|_|____/     _| \__,_|\__,_|___|\___|_|  _|_|\_\__,_|

# Tennis Game Kata

Copyright © Dzianis Yudzenka, 2017. All rights reserved.
Developer: Dzianis Yudzenka <Dzianis.Yudzenka@gmail.com>
Version: 1.0
Since: 4/19/2017


In this kata, you will focus on the score of a tennis set.

Tennis Scoring [here](http://en.wikipedia.org/wiki/Tennis#Scoring)

SPRINT1: manage a tennis match
User Story 1:
                As a tennis referee
I want to manage the score of a game of a game of 2 players with simple game rules
In order to display the current Game score of each player
 
                Rules details:
- The game starts with a score of 0 point for each player
- Each time a player has a win, the Game score changes as follow:
0 -> 15 -> 30 -> 40-> Win game
 
User Story 2:
                As a tennis referee
I want to manage the specific of the rule DEUCE at the end of a Game
In order to display the current Game score of each player
 
                Rules details:
- If the 2 players reach the score 40, the DEUCE rule is activated
- If the score is DEUCE, the player takes the ADVANTAGE
- If the player who has the ADVANTAGE win the point, he win the game
- If the player has ADVANTAGE loose the point, the score is DEUCE
 
 
SPRINT2: manage a tennis SET within a tennis match
User Story 1:
                As a tennis referee
I want to manage the score of a tennis match between 2 players
In order to display the current Game & Set score of each player
 
                Rules details:
- The set starts with a score of 0 Game for each player
- Each time a player win a Game, the Set score changes as follow:
1 -> 2 -> 3 -> 4 -> 5 -> 6 (-> 7)
- If a player reaches the Set score of 6 and the other player has a Set score of 4 or lower
- If a player win a Game and reach the Set score of 6 and the other player has a score of 5, a new Game must be played and the first player who reach the score of 7 wins the match
 
User Story 2:
                As a tennis referee
I want to manage the specific of the rule of Tie-Break at the end of the Set
In order to display the current Game, Set score & Tie-Break score of each player
 
                Rules details:
- If the 2 players reach the score of 6 Games, the Tie-Break rule is activated
- Each time a player has a win, the score changes as follow:
1 -> 2 -> 3 → 4 → 5 → 6 (-> 7 → 8 → 9 → 10 → ...)
- The Tie-Break
- The player who wins the Tie-Break wins the Set and the match
 
Prerequisites:
Write a program that takes these elements into account for the scoreboard between two tennis players.
 
Players must be able to score points.
The set must be finished with a winner.
After a game is won, the winning player must be determined.
We must be able to follow the score of each player at any time during the game.
