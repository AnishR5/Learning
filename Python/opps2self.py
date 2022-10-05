class Employee():
    company="Google"
    def getSalary(self):
        print(f'Salary is {self.salary}k')

harry= Employee()
harry.salary= 200
harry.getSalary() # is equal to Employee.getSalary
