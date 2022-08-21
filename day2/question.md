This question is based on the Object-Oriented Programming (OOP) concepts. You are going to 
implement a code for a “MenInblack” video game. There is an Alien class to represent a monster 
and an AlienPack class that represents a pack including different types of aliens. MenInBlack class 
has different types of agents who is going to kill the aliens and obtain the scores. 

a) You can refer the output given in Main class and adjust your code accordingly.

    i). Implement the Alien interface and declare getScore() method
    ii). Create three classes called MarshmalloAlien, OgreAlien and SnakeAlien and implement 
    the Alien interface in each class. MarshmalloAlien has 15, OgreAlien has 10 and 
    SnakeAlien has 5 as their scores. 
    iii). Similarly create a class called AlienPack and implement the property of aliens array 
    (Alien[]).
    iv). Implement the constructor in the AlienPack class. Distinguish the number of aliens. 
    v). Implement the method called addAlien which accept a specific alien and the index.
    vi). Implement the method called getAliens() which returns the alien array.
    vii). Implement the MenInBlack class and implement the property of score and 
    alienpack(AlienPack).
    viii). Implement the constructor in the MenInBlack class, which accept and initialize the 
    alienpack. Make the starting agent score as zero. 
    ix). Implement the getters and setters for score and alienpack.
    x). Implement the kill() method which kills the aliens in the alienpack and calculate the total 
    score depending on each alien.

b) “MenInblack” video game has another level where while the agent is killing the aliens, alien will 
do a damage for the agent and he will reduce the score accordingly. 

    i). Implement the MenInBlackLevel2 class which is a child of the MenInBlack class.
    ii). Implement the constructor in the MenInBlackLevel2 class, which accept and initialize 
    the alienpack.
    iii). Override the kill method where it calculate the total score depending on each alien. 
    Additionally, generate a random number for each alien. Each time the random number is 
    an ODD, the total score will be reduce by 2. 
    Hint: Math.random() *10 will generate a random decimal number between 1 and 10.