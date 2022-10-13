# IE 211 Lab 2 Codes
import random

from Lab2.Sort import Sort

print("Hello world!")

SIZE = 8
'''
# STEP 1: Way 1: Create input list instance manually 

nValues = [5, 2, 4, 6, 1, 3] 

# print the elements in the array in a line
print(*nValues)

nValues[2] = 10

print(*nValues) 

for value in nValues:
    print(value, end= " ")

print()
for i in range(6):
    print(nValues[i], end= " ")
print()

nValues.append(5)
print(*nValues)
'''

# STEP 1: Way 2: Create input list instance randomly

nValues = []

for i in range(SIZE):
    nValues.append(random.randint(0, 50))

print(f'The input array is')
print(*nValues)

insertionSort = Sort()
insertionSort.ImplementAlgorithm(nValues)