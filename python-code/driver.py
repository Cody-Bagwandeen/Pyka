from Game import Game

g = Game()

while not g.gameFinished :  # while the game hasn't been solved, keep asking for guesses and display results
    g.askForGuess()