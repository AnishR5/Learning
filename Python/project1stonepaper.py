#Stone paper scissors Game

import random

def game(comp,user):
    if comp == user :
        return None
    elif comp == 'stone':
        if user== 'paper':
            return True
        else:
            return False
    elif comp == 'paper':
        if user== 'sissors':
            return True
        else:
            return False
    elif comp == 'sissors':
        if user== 'stone':
            return True
        else:
            return False
    
    


print("Computer turn: choose Stone or Paper or Sissors")

randomoption= random.randint(1,3)
if (randomoption == 1):
    comp= 'stone'
elif (randomoption == 2):
    comp= 'paper' 
else:
    comp= 'sissors'

user=input("Player turn choose Stone (1) or Paper(2) or Sissors(3)  ")

if user== 1:
    user='stone'
elif user== 2:
    user='paper'
else:
    user='sissor'



a=game(comp, user)

print(f"Computer chose {comp} and You chose {user}")

if a== None:
    print("Its a tie")
elif a:
    print("You win")
else:
    print("You lose")