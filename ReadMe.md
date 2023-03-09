
1) The Observer Pattern

The Observer design pattern has been followed by the PlayerLocation 
class, this PlayerLocation is the Subject while other classes objects
are free to register themselves as observers. 

2) Singleton Pattern

The LogAnalytics class makes use of the singleton design pattern in 
that only one instance of LogAnalytics will ever be instantiated.
Note the synchronised tag on the getLogAnalytics to ensure that a second
instance is never created.