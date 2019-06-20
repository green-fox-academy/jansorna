from Pirate import Pirate
from Ship import Ship
from random import randint

class Armada:
    def __init__(self):
        self.armada = []

    def fill_armada(self):
        for ship in range(1,randint(5,20)):
            self.armada.append(Ship())

    def __str__(self):
        return "Number of ships: " + str(len(self.armada))

    def war (self, challenged_Armada):
        ship_first_armada = 0
        ship_second_armada = 0

        while ship_first_armada < len(self.armada) - 1 and ship_second_armada < len(challenged_Armada.armada) - 1:
            while self.armada[ship_first_armada].battle(challenged_Armada.armada[ship_second_armada]) == True:
                ship_second_armada += 1
            while challenged_Armada.armada[ship_second_armada].battle(self.armada[ship_first_armada]) == True:
                ship_first_armada += 1

        if ship_first_armada > ship_second_armada:
            return True
        else:
            return False