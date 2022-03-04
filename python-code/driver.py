from Game import Game

g = Game()

while not g.gameFinished :
    g.askForGuess()
print(f'Solved in {g.attemps} guesses.')