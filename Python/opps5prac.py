#calculator capable of finding square, square root and cube

class calculator :
    
    def __init__(self, num) :
        self.num= num

    @staticmethod
    def greet():
        print('Hello user')

    
    def square(self):
        print(f'Square of {self.num} is {self.num**2}')

    def cube(self):
        print(f'Cube of {self.num} is {self.num**3}')

    def sqroot(self):
        print(f'Square root of {self.num} is {self.num**0.5} \n')
        

num1= calculator(3)
num1.greet()
num1.square()
num1.cube()
num1.sqroot()

num2= calculator(36)
num1.greet()
num2.square()
num2.cube()
num2.sqroot()       
