# Addition of two numbers
#a=input("Enter first number:")
#a=int(a)
#b=input("Enter second number:")
#b=int(b)
#c=a+b
#print("Addition of a & b is ",c)

import random

randomoption= random.randint(1,3)
if (randomoption == 1):
    comp= 'st'
elif (randomoption == 2):
    comp= 'p' 
else:
    comp= 's'

print(comp)



