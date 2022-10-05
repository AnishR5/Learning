# create a class programers fro storing info of few programrs

class programmer:
    company='Microsoft'

    def __init__(self, name):
        self.name= name
        print('Programmer created')
        
    def getDetails(self):
        print(f'Programmer name is {self.name} and is working in {self.company}')

harry = programmer('Harry')
harry.getDetails()
mina = programmer('mina')
mina.getDetails()
tina = programmer('tina')
tina.getDetails()