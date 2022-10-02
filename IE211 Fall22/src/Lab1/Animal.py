class Animal:
    __me = {
        "name": None,
        "id": 0
    }

    def __init__(self):
        pass

    def setName(self, name):
        self.__me["name"] = name

    def setID(self, id):
        self.__me["id"] = id

    def getIDLastDigit(self):
        return self.__me["id"] % 10

    def speak(self):
        print("Hi all :)")


