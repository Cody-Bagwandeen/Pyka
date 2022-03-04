from Pykanum import Pykanum


class Game:

    def __init__(self, size=4):
        self.attemps = 0
        self.size = size
        self.computernum = Pykanum(None, size)
        self.gameFinished = False

    def isInvalidNum(self, val):
        if len(val) != self.size:
            return True
        for x in val:
            if val.count(x) > 1:
                return True

        return False

    def askForGuess(self):
        guess = input('Enter a guess.\n')
        while self.isInvalidNum(guess):
            guess = input('Invalid Input! Enter new a guess.\n')
        self.attemps += 1
        g = Pykanum(guess)
        result = self.computernum.CompareNums((g))
        print(result)
        if result == '0 pyka and 4 centra.':
            self.gameFinished = True
