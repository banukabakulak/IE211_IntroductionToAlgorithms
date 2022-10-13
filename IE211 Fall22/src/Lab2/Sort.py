import time

class Sort:
    runTime = 0
    totalIter = 0

    def ImplementAlgorithm(self, nValues):

        # Start clock
        self.runTime = time.time_ns() // 1000000

        for j in range(1, len(nValues)):
            key = nValues[j]
            i = j - 1

            while i >= 0 and nValues[i] > key:
                nValues[i + 1] = nValues[i]
                i -= 1
                self.totalIter += 1

            nValues[i + 1] = key

        # Stop clock
        self.runTime = time.time_ns() // 1000000 - self.runTime

        print(f'The sorted array is')
        print(*nValues)

        print(f'Total iterations: {self.totalIter}')
        print(f'The runtime is {self.runTime} milliseconds')