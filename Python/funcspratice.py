


#1 func to find greatest number of 3 numbers

def great(a, b, c, d):
    if(a>b and a>c and a>d):
        print("Greatest number is ",a)
    elif(b>c and b>d):
        print("Greatest number is ",b)
    elif(c>d):
        print("Greatest number is ",c)
    else:
        print("Greatest number is ",d)

a=int(input('Enter 1st number  '))
b=int(input('Enter 2nd number  '))
c=int(input('Enter 3rd number  '))
d=int(input('Enter 4th number  '))

great(a, b, c, d)


#2 func to convert celsius into farhenite 

def convert (celsius):
    farh= (celsius*9)/5+32
    return print(f'{celsius} C  =   {farh} F' )

celsius=int(input('Enter temp (Celsius)  '))
convert(celsius)

#3 recusive fun to find sum of first n numbers
# s= n(n+1)/2

def sumofnaturalnum(n):
    if (n<=1):
        return n
    else:    
         return n + sumofnaturalnum(n-1)
    
n=int(input('Enter number  '))
print(f'sum of first {n} natural number is {sumofnaturalnum}')

#4 fun to convert inch to cms

def cms(inch):
    return print(f"{inch} in = {inch*2.54} cms")

inch= int(input('Enter length  '))
cms(inch)

# function to remove a given word from list and stop it at same time

def stop(word):
    li.remove(word)
    print(li)

li= ['anish', 'manish', 'akshay', 'saurabh', 'shubham', 'arya']
print(li)
word=input("Enter word you want to remove  ")
stop(word)

#funct for multiplication

def mul(number):
    for i in range(1,11):
         print (f'{number} X {i} = {number*i}')


number=int(input('Enter a number  '))
mul(number)

    