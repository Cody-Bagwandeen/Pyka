from Pykanum import Pykanum


class Game:

    def __init__(self, size=4):
        self.attemps = 0
        self.size = size
        self.computernum = Pykanum(size)
        self.gameFinished = False

    def isInvalidNum(self, val):
        if len(val) != self.size :
            return True
        for i in range(self.size):
            for j in range(self.size):
                if i != j and self.computernum.num[i] == val[i]:
                    return True
        return False

    def askForGuess(self):
        guess = input('Enter a guess.\n')
        while self.isInvalidNum(guess):
            guess = input('Enter a guess.\n')
        self.attemps += 1
        result = self.computernum.CompareNums(guess)
        if result == '0 pyka and 4 centra.':
            self.gameFinished = True
