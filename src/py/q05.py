from collections import deque


def q05_01():
    cnt = 0
    for coin_500 in range(0, 2 + 1):
        for coin_100 in range(0, 10 + 1):
            for coin_50 in range(0, 15 + 1):
                for coin_10 in range(0, 15 + 1):
                    if coin_500 + coin_100 + coin_50 + coin_10 <= 15:
                        if coin_500 * 500 + coin_100 * 100 + coin_50 * 50 + coin_10 * 10 == 1000:
                            cnt += 1

    print(cnt)


cnt: int = 0


def q05_02():
    def change(target, coins, usable):
        global cnt
        coin = coins.popleft()
        if len(coins) == 0:
            if target // coin <= usable:
                cnt += 1
        else:
            for i in range(0, target // coin + 1):
                change(target - coin * i, coins.copy(), usable - i)

    change(1000, deque([500, 100, 50, 10]), 15)


if __name__ == '__main__':
    q05_01()
    q05_02()
    print(cnt)
