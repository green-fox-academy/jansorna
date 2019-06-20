from Aircraft import Aircraft

class F16(Aircraft):
        def __init__(self):
            self.maxAmmo = 8
            self.base_damage = 30
            self.type = "F16"
            Aircraft.__init__(self)

        @property
        def fight(self):
            pass

        @property
        def fighting_potential(self):
            pass

        def __str__(self):
                return str(self.amunution) + str(self.base_damage) + self.type + str(self.amunution)
