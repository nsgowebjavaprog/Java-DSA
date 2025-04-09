def intersection_of_arrays(arr1, arr2):
    # Use set to find common elements
    intersection = set(arr1) & set(arr2)
    return list(intersection)

# Example usage
arr1 = [1, 2, 3, 4]
arr2 = [3, 4, 5, 6]
result = intersection_of_arrays(arr1, arr2)
print("Intersection:", result)
