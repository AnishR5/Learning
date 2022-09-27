#1 prog to find greatest of 4 nums entered by user

a=int(input("Enter 1st number\n"))
b=int(input("Enter 2nd number\n"))
c=int(input("Enter 3rd number\n"))
d=int(input("Enter 4th number\n"))

if(a>b and a>c and a>d):
    print("Greatest number is ",a)
elif(b>a and b>c and b>d):
    print("Greatest number is ",b)
elif(c>a and c>b and c>d):
    print("Greatest number is ",c)
else:
    print("Greatest number is ",d)



#2 Prog to find a student is pass or fail in 3 subjects

sub1=int(input("Enter english marks \n"))
sub2=int(input("Enter maths marks \n"))
sub3=int(input("Enter SST  marks \n"))
tot=sub1+sub2+sub3
print("Total Marks",tot)
if (tot>=120 and sub1>33 and sub2>33 and sub3>33):
    print("PASS")
else:
    print("FAIL")



#3 spam prog

spam=input("Enter text \n")
if("make a lot of money" in spam or "buy now" in spam or "subscribe this" in spam or "click this" in spam):
    print("SPAM")
else:
    print("All okay")


#4 to check text contains less than 10 character

text=input("Enter text \n")
k=len(text)
if(k<10):
    print("Text contains less then 10 charaters")
else:
    print("Text contains more than 10 characters")
    

#5 to check name is present in the list



name=["Anish", "Shubham", "Saket", "Mayuresh", "Saurabh"]
t#ext=input("Enter your name \n")
if(text in name):
    print("Name found ")
else:
    print("Name not found")


#program for grading

marks=int(input("Enter your marks \t"))
if(marks>90):
    print("You have Grade Ex")
elif(marks>80 and marks<=90):
    print("You have Grade A")
elif(marks>70 and marks<=80):
    print("You have Grade B")
elif(marks>60 and marks<=70):
    print("You have Grade C")
elif(marks>50 and marks<=60):
    print("You have Grade D")
else:
    print("You have Grade F")


