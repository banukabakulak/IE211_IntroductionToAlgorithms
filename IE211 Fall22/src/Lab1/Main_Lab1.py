# IE 211 Lab 1 Codes

from Lab1.Animal import Animal
from Lab1.Cat import Cat
from Lab1.Dog import Dog

print("Hello world!")

# ENCAPSULATION: Grouping the properties and the methods, ie., class definition

myPet = Animal()

'''
# Public property updates

myPet.me["name"] = "Kitty"
myPet.me["id"] = 1484

print(f'The name is {myPet.me["name"]}')
'''

# Private property update => ABSTRACTION , DATA HIDING

myPet.setName("Kitty")
myPet.setID(1484)

print(f'The last digit of the ID is {myPet.getIDLastDigit()}')

# INHERITANCE: Parent/Child relationship

myCat = Cat()
myDog = Dog()

myCat.setName("Kitty")
myCat.setAge(3)
myCat.isYoungerThan(5)

myDog.setName("Cango")
myDog.setID(2021)
print(f'The last digit of the ID is {myDog.getIDLastDigit()}')
myDog.setGenre("Golden")
myDog.isGenre("Terrier")

# POLYMORPHISM: The same function but different outcomes

myCat.speak()
myDog.speak()

# Reduce code complexity

thePets = [Cat(), Dog()]

for animal in thePets:
    animal.speak()


