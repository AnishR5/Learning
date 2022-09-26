mydict= {
    "Quick" : "Fast",
    "Anish" : "The mastermind",
    "Marks" : "100"
      
}
print(mydict["Anish"])


#dict of hindi words
hindidic ={
    "vkya":"sentence",
    "gend":"ball",
    "ghar":"home",
   "paani":"ghar"

}
print("Options are ", hindidic.keys())
a= input("Type the word you want the meaning\t")
print("The meaning of the word is ",hindidic.get(a))


#display unique numbers
num1 = int(input("type 1st number\t"))
num2 = int(input("type 2nd number\t"))
num3 = int(input("type 3th number\t"))
num4 = int(input("type 4th number\t"))
num5 = int(input("type 5th number\t"))
num6 = int(input("type 6th number\t"))
num7 = int(input("type 7th number\t"))
num8 = int(input("type 8th number\t"))
s = {num1, num2, num3, num4, num5, num6, num7, num8}
print(s)

#prog to create dictionary of friends and their fav lang


favlang={}
a = input("Enter your fav lang shubham\t")
b = input("Enter your fav lang saurabh\t")
c = input("Enter your fav lang arya\t")
d = input("Enter your fav lang anish\t")
favlang["shub"] = a
favlang["sau"] = b 
favlang["arya"] = c
favlang["anish"] = d
print(favlang)






