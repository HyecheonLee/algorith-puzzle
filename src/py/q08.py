def q08_00():
    def move(x, y, log_map, cnt):
        if cnt > 12:
            return 0
        if cnt == 12:
            return 1

        log_map[x][y] = False
        count = 0
        for d in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
            if log_map[x + d[0]][y + d[1]]:
                count += move(x + d[0], y + d[1], log_map, cnt + 1)
                log_map[x + d[0]][y + d[1]] = True
        return count

    moveMap = [[True for col in range(100)] for row in range(100)]
    print(move(50, 50, moveMap, 0))


def q08_01():
    N = 12

    def move(log):
        if len(log) == N + 1:
            return 1
        cnt = 0
        for d in [[1, 0], [-1, 0], [0, 1], [0, -1]]:
            next_pos = [log[-1][0] + d[0], log[-1][1] + d[1]]
            check = False

            for p in log:
                if p[0] == next_pos[0] and p[1] == next_pos[1]:
                    check = True
            if check == False:
                cnt += move(log + [next_pos])
        return cnt

    print(move([[0, 0]]))


if __name__ == '__main__':
    q08_00()
    q08_01()
