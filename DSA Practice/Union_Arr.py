def union_of_arrays(arr1, arr2):
   
    union_set = set(arr1) | set(arr2)
    return list(union_set)


arr1 = [1, 2, 3, 4]
arr2 = [3, 4, 5, 6]
result = union_of_arrays(arr1, arr2)
print("Union:", result)