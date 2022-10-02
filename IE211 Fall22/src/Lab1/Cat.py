from Lab1.Animal import Animal

class Cat(Animal):

    __age = 0

    def __init__(self):
        pass

    def setAge(self, age):
        self.__age  = age

    def isYoungerThan(self, age):
        if self.__age < age:
            print(f"The cat is younger than {age}")
        else:
            print(f"The cat is older than {age}")

    def speak(self):
        print("Meow :)")