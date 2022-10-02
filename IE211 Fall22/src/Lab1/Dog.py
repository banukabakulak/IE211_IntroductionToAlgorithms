from Lab1.Animal import Animal

class Dog(Animal):
    __genre = None

    def __init__(self):
        pass

    def setGenre(self, genre):
        self.__genre = genre

    def isGenre(self, genre):
        if self.__genre == genre:
            print(f"The genre of the dog is {genre}")
        else:
            print(f"The genre of the dog is not {genre}")

    def speak(self):
        print("Hav hav :)")