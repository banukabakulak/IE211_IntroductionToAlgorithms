import time

class Subset:

    __runTime = 0
    __binVal = []

    def __Binary(self, n):
        if n > 1:
            self.__Binary(int(n / 2))
        self.__binVal.insert(0, n % 2)

    def GenerateSubsets(self, set):

        # Test the Binary(n) function

        self.__Binary(12)
        print(*self.__binVal)

        # end of test

        # Start clock
        self.__runTime = time.time_ns() // 1000000

        setSize = len(set)

        for i in range(pow(2, setSize)):

            self.__binVal.clear()
            self.__Binary(i)
            #print(f'Binary({i}) is ')
            #print(*self.__binVal)


            print(f'The {i}th subset is ')

            for j in range(len(self.__binVal)):
                if self.__binVal[j]:
                    print(set[j], end= " ")

            print()

        # Stop clock
        self.__runTime = time.time_ns() // 1000000 - self.__runTime

        print(f'The runtime is {self.__runTime} milliseconds')

