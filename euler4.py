largest = 0
for i in range(999, 99, -1):
    for j in range(i, 99, -1):  # avoid redundant pairs
        product = i * j
        if product <= largest:
            break  # since j is decreasing, products will decrease
        if str(product) == str(product)[::-1]:
            largest = product
