import random
import time

from src.Lab5.Sort import Sort
from src.Lab5.Search import Search

print("IE 211 Lab 5 Codes...")

SIZE = 10

# Merge Sort Implementation

array = []
for i in range(SIZE):
    array.append(random.randint(0, 100))

print("The unsorted array is ")
print(*array)

# Start clock
runTime = time.time_ns() // 1000000

mergeSort = Sort()
mergeSort.MergeSort(array, 0, len(array) - 1)

# Stop clock
runTime = time.time_ns() // 1000000 - runTime
print(f'The Merge Sort runtime is {runTime} milliseconds')

print("The sorted array is")
print(*array)

# Binary Search Implementation

testValues = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

# Start clock
runTime = time.time_ns() // 1000000

print("The search results are ")

for i in range(len(testValues)):
    mySearch = Search()
    print(mySearch.BinarySearch(array, testValues[i], 0, len(array) - 1), end = " ")

print()
# Stop clock
runTime = time.time_ns() // 1000000 - runTime
print(f'The Binary Search runtime is {runTime} milliseconds')