
1) The Observer Pattern

The Observer design pattern has been followed by the PlayerLocation 
class, this PlayerLocation is the Subject while other classes objects
are free to register themselves as observers. 

2) Singleton Pattern

The LogAnalytics class makes use of the singleton design pattern in 
that only one instance of LogAnalytics will ever be instantiated.
Note the synchronised tag on the getLogAnalytics to ensure that a second
instance is never created.

3) Factory Pattern

The factory pattern has been used iin the making of the Encounters in the game. 
There is an abstract class Encounter with some default shared methods of all encounters, including
the registration to the PlayerLocation (following the observer pattern.) When the encounter s notified of any 
changes the update method checks if the player is at the same coordinates as the encounter.