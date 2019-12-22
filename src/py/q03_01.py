def q03():
    N = 100
    cards = [False] * N
    for i in range(2, N + 1):
        j = i - 1
        while j < len(cards):
            cards[j] = not cards[j]
            j += i

    for i in range(0, N):
        if not cards[i]:
            print(i + 1)


if __name__ == '__main__':
    q03()
