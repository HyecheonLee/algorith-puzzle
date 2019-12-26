if __name__ == '__main__':
    memo = {}


    def fib(n):
        if n in memo:
            return memo[n]
        if n == 0 or n == 1:
            memo[n] = 1
        else:
            memo[n] = fib(n - 1) + fib(n - 2)
        return memo[n]


    a = b = 1
    count = 0
    while count < 11:
        c = a + b
        for e in str(c):
            sum += int(e)
        if c % sum == 0:
            print(c)
            count += 1
        a, b = b, c
