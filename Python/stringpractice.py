#prog to display user entered name after good morning
a=input("Enter your name ")
print("Good afternoon ",a)


#letter template

letter= '''Dear, <name> 
You are selected.
<date>'''
a=input("Enter your name \n")
b=input('Enter date \n')
letter= letter.replace('<name>',a)
letter=letter.replace("<date>",b)
print(letter)


#prog to detect double spaces
a= "These examples have been  automatically selected and  may contain sensitive content that does not reflect the opinions or policies of Collins"
print(a.count("  "))
print(a.replace("  "," "))

#Format the foll

letter="Dear Anish,This Python course is nice. Thanks!"
letter="Dear Anish,\n\tThis Python course is nice.\nThanks!"
print(letter)