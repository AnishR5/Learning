class Employee :
    company = "Google"

    def __init__ (self, name, salary):
        self.name= name 
        self.salary= salary
        print('Employee is created')

    def getInfo(self):
        print(f'Name of Employee is {self.name}')
        print(f'Salary of Employee is {self.salary}k')
        
    @staticmethod
    def greet(a,b):
        print(f'Hello user {a} and  {b}')

harry = Employee("Harry", 30)
harry.greet(10,5) 
harry.getInfo()