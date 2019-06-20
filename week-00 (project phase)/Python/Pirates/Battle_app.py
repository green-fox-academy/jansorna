from Ship import Ship

ship1 = Ship()
ship1.fill_ship()

ship2 = Ship()
ship2.fill_ship()

print(ship1)
print(ship2)
ship1.battle(ship2)
print(ship1)
print(ship2)