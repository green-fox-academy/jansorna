from Pirate import Pirate
from random import randint

class Ship:
    def __init__(self):
        self.captain = Pirate("Captain")
        self.crew = []
        self.alive_crew = 0
        self.fill_ship()
    
    def fill_ship(self):
        self.captain.promotion()
        for pirate in range(1,randint(5,20)):
            self.crew.append(Pirate("Pirate " + str(pirate)))
        self.alive_crew = len(self.crew)

    def battle(self, challenged_ship):
        if self.alive_crew - self.captain.consumed_rum > challenged_ship.alive_crew - challenged_ship.captain.consumed_rum:
            self.party_hard()
            challenged_ship.crew_lost()
            return True
        else:
            self.crew_lost()
            challenged_ship.party_hard()
            return False

    def party_hard(self):
        for pirate in range(len(self.crew)):
            self.crew[pirate].drink_some_rum()
        self.captain.drink_some_rum()

    def crew_lost (self):
        crew_number_of_loses = randint(1, len(self.crew) - 1)
        self.alive_crew = len(self.crew) - crew_number_of_loses

        for pirate in range(randint(0, crew_number_of_loses)):
            self.crew[pirate].die
       
    def __str__(self):
        return "Captain: " + str(self.captain) + "\nAlive crew: " + str(self.alive_crew)