from Pykanum import Pykanum


class Game:

    def __init__(self, size=4):
        self.attemps = 0  # amount of tries used to guess num
        self.size = size
        self.computernum = Pykanum(None, size) # make a random number for the player to guess
        self.gameFinished = False # keeps track of whether or not the game has been won

    def isInvalidNum(self, val):
        if len(val) != self.size:  # valid num must be same size
            return True
        for x in val:
            if val.count(x) > 1:  # no repeating digits
                return True

        return False

    def askForGuess(self):
        guess = input('Enter a guess.\n') # ask for a guess and see if its valid
        while self.isInvalidNum(guess):
            guess = input('Invalid Input! Enter new a guess.\n')  # if its invalid ask for another guess
        self.attemps += 1  # add 1 to the attemp tracker
        g = Pykanum(guess)
        result = self.computernum.CompareNums((g))  # compare guess to computer num
        print(result)
        if result == '0 pyka and 4 centra.':  # if the guess is correct, end the game
            self.gameFinished = True
            print(f'Solved in {self.attemps} guesses.')  # show how many attemps was used
