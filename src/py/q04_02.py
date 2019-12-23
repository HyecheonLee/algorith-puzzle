def cutbar(m, n):
    count = 0
    current = 1
    while n > current:
        current += current if current < m else m
        count += 1
    print(count)


if __name__ == '__main__':
    cutbar(3, 20)
    cutbar(5, 100)
