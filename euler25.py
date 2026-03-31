a = 1
b = 1
c = 2
while True:
    third = a+b
    if len(list(map(int, str(third)))) == 1000:
        c += 1
        print(c)
        break
    else:
        c += 1
        a = b
        b = third
#Output:4782
