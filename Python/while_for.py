#while syntax
i=0
while i<10:
    print("Number is", i)
    i = i + 1


#print 1 to 50
a=1
while(a<=50):
    print(a)
    a=a+1


#print list by while loop

fruits1= ["Banana", "Apple", "Orange", "Sweetlime", "Guava", "Pineapple"]
while(b<6):
    print(fruits1[b])
    b=b+1


#for loop syntax
list1=["anish",'manish', 'kanish', 'paul']
for item in list1:
    print(item)

#print list by for loop

fruits2= ["Banana", "Apple", "Orange", "Sweetlime", "Guava", "Pineapple"]
for item in fruits2:
    print(item)


# Range continue break and pass
for z in range(10):
    if(z==4):
        continue
    print(z)
else:
    print('The end')


