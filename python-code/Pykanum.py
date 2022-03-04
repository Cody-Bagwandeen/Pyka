from NonRepRandom import NonRepRandom


class Pykanum:
    def __init__(self, size=4, pnum=None):
        if pnum == None:  # genreate a new pykanum if there isn't one given
            self.size = size
            self.num = []
            n = NonRepRandom()
            for i in range(4):
                self.num.append(n.generateNum())
        else:  # if a num is given, turn that num into a pyka num
            for x in pnum:
                self.size = len(pnum)
                self.num.insert(0, x)

    def CompareNums(self, other):
        pyka = 0
        centra = 0
        guess = Pykanum(other)
        for i in range(self.size):
            if self.num[i] == other.num[i]:
                centra += 1
            elif other.num.contains(self.num[i]):
                pyka += 1
        return f"{pyka} pyka and {centra} centra."
