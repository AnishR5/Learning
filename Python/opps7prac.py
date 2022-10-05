# class train has method to book a ticket, get status(no. of seats) and get fare

class Train:

    def __init__(self, name, status, fare):
        self.name = name
        self.status = status
        self.fare = fare
        print('Welcome User')

    def getInfo(self):
        print(f'Name of train is {self.name} \nNumber of seats available are {self.status} \nFare for the journey is Rs {self.fare}')

    def book(self):
        if self.status>0 :
            print(f'Your ticket is booked and your seat number is {self.status} \n') 
            self.status = self.status - 1   
        else:
            print('You cannot book tickets \n')

    
intercity = Train('Shatabdi Express', 70, 105 )
intercity.getInfo()
intercity.book()
intercity.getInfo()

train2= Train('Karnatak Express', 0, 350)
train2.getInfo()
train2.book()

