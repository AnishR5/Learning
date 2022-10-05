class Employee:
    company= "Microsoft"     #class attribute
    salary= 200                #class attribute

harry= Employee()
mina= Employee()
print(harry.company)                
print(mina.company)
print(harry.salary)
print(mina.salary)
Employee.company="Infosys"              #instance attribute
harry.salary= 600                        #instance attribute
print(harry.company)
print(mina.company)
print(harry.salary)
print(mina.salary)
