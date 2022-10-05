class Employee :
    company = 'Google'

    def getDetails(self):
        print('This is a employee ')

class Programmer(Employee):
    language= "Python"
    company= 'Youtube'
    


e= Employee()
p= Programmer()
e.getDetails()
print(p.language)
p.getDetails()
print(p.company)