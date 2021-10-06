busV = 50; carV = 60
carDistance = 475.4; busDistance = 475.4 - busV*2.5
busTime = busDistance/busV; carTime = carDistance/carV
print( "Автобусом швидше." if busTime < carTime else "Автомобілем швидше." )
