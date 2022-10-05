class Employee:
    company= 'Google'
    salary = 200
    age= 20

    def __init__(self, salary, company) :
        self.salary = salary
        self.company = company
        
    def getDetails(self):
        print(f'Employee works in {self.company} and salary is {self.salary}')

a= Employee(300, "microsoft")
print(a.age)


