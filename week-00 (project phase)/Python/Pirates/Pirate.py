from random import randint

class Pirate:
    def __init__(self, name):
        self.name = name
        self.consumed_rum = 0
        self.is_captain = False
        self.alive = True
        self.passed_out = False

    def drink_some_rum(self):
        self.consumed_rum += randint(1,10)

    def howsItGoingMate(self):
        if self.alive == False:
            print("He`s dead!")
        elif self.consumed_rum > 0:
            print("Pour me anudder! " * 4)
        else:
            print("Arghh, I'ma Pirate. How d'ya d'ink its goin?")
            self.passed_out = True

    def die(self):
        self.alive = False

    def promotion(self):
        self.is_captain = True

    def brawl (self, chalange_Pirate):
        if self.alive == False:
            print("He`s dead!")
        else:
            result_of_battle = randint(1,3)
            if result_of_battle == 1:
                self.die()
            elif result_of_battle == 2:
                chalange_Pirate.die()
            else:
                self.die()
                chalange_Pirate.die()

    def __str__(self):
        return "Name: " + self.name + ", consumed rum: " + str(self.consumed_rum)
