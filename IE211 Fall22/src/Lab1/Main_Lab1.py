# IE 211 Lab 1 Codes

from Lab1.Animal import Animal
from Lab1.Cat import Cat
from Lab1.Dog import Dog

print("Hello world!!!!")

# ENCAPSULATION : Grouping the properties and the methods, i.e., class definition

myPet = Animal()

'''
myPet.me["name"] = "Kitty"
myPet.me["id"] = 1564

print(f'The name is {myPet.me["name"]} and id is {myPet.me["id"]}')
'''

# ABSTRACTION : (1) Data Hiding for Private Data Security, (2) Easy / Efficient User Interface

myPet.setName("Pamuk")
myPet.setID(1648)

print(f'The last digit of the ID is {myPet.getLastDigit()}')

# INHERITANCE : Parent / Child Relationship - Eliminate unnecessary coding

myCat = Cat()
myDog = Dog()

myCat.setName("Kitty")
myCat.setAge(3)
myCat.isYoungerThan(5)

myDog.setName("Cango")
myDog.setID(2943)
print(f'The last digit of the ID is {myDog.getLastDigit()}')
myDog.setGenre("Golden")
myDog.isGenre("Terrier")

# POLYMORPHISM : The same function with different outcomes

myPet.speak()
myCat.speak()
myDog.speak()

# Reduce code complexity

thePets = [Animal(), Cat(), Dog(), Dog(), Cat(), Animal()]

for animal in thePets:
    animal.speak()

