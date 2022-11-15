class Difference:

    def __printDifferentElements_v1(self, array1, array2):
        print("default version")

        for i in range(len(array1)):
            isElement = False
            for j in range(len(array2)):
                if array1[i] == array2[j]:
                    isElement = True
                    break

            if not isElement:
                print(array1[i], end=" ")

    def __printDifferentElements_v2(self, array1, array2):
        print("alternative version")

        i = 0
        while i < len(array1):
            for j in range(len(array2)):
                if array1[i] == array2[j]:
                    del array1[i]
                    i = i - 1
                    break
            i = i+ 1

        for i in range(len(array1)):
            print(array1[i], end=" ")

    def printDifferentElements(self, array1, array2, altVersion = False):
        print("The elements of A that are not in B are ")

        if not altVersion:
            self.__printDifferentElements_v1(array1, array2)
        else:
            self.__printDifferentElements_v2(array1, array2)

