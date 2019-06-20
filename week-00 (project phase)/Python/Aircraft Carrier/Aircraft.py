import abc
from abc import ABC, abstractmethod

class Aircraft(ABC):
    def __init__(self):
        self.amunution = 0

    @abc.abstractproperty
    def fight(self):
        damage_dealt = self.amunution * self.base_damage
        self.amunution = 0
        return damage_dealt

    @abc.abstractproperty
    def fighting_potential(self):
        return self.base_damage * self.amunution
