def abu(n):
    divisors = [i for i in range(1, int(n ** 0.5)+1) if n%i == 0]
    su = sum(divisors + [n//i for i in divisors if i*i != n]) - n 
    if su > n:
        return True
    else:
        return False
abundant = []
for i in range(1, 28124):
    if abu(i):
        abundant.append(i)
limit = 28124
sumtwo = [False] * limit

for i in range(len(abundant)):
    for j in range(i, len(abundant)):
        s = abundant[i] + abundant[j]
        if s < limit:
            sumtwo[s] = True
        else:
            break

total_sum = sum(i for i, nsum in enumerate(sumtwo) if not nsum)
print(total_sum)

#Output:4179871
        
