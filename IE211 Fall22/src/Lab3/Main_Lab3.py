from Lab3.Subset import Subset

print("IE 211 Lab 3 Codes...")

SIZE = 3

# STEP # 1: Generate a set S with SIZE elements

set = []

for i in range(SIZE):
    set.append(2 * i + 1)

print("The input set S is ")
print(*set)

# STEP # 2: Implement Subset Generation by calling the function of Subset class

mySubsets = Subset()
mySubsets.GenerateSubsets(set)
