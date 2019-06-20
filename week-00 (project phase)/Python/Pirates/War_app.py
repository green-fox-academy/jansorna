from Armada import Armada

spanish_armada = Armada()
spanish_armada.fill_armada()
british_armada = Armada()
british_armada.fill_armada()

print(british_armada)
print(spanish_armada)

print(british_armada.war(spanish_armada))