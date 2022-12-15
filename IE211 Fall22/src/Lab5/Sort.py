class Sort:

    runTime = 0
    bigM = 10000

    def __Merge(self, array, p, q, r):
        n1 = q - p + 1
        n2 = r - q

        leftArray = []
        rightArray = []

        for i in range(n1):
            leftArray.append(array[p + i])
        leftArray.append(self.bigM)
        print(f' The left array is {leftArray}')

        for j in range(n2):
            rightArray.append(array[q + j + 1])
        rightArray.append(self.bigM)
        print(f' The right array is {rightArray}')

        i = 0
        j = 0

        for k in range(p, r+1):
            if leftArray[i] <= rightArray[j]:
                array[k] = leftArray[i]
                i = i + 1

            else:
                array[k] = rightArray[j]
                j = j + 1

    def MergeSort(self, array, p, r):

        if(p < r):
            q = int((p + r) / 2)

            self.MergeSort(array, p , q)
            self.MergeSort(array, q + 1, r)
            self.__Merge(array, p, q, r)