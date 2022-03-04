import random

class NonRepRandom:
    def __init__(self, max = 9): # default value of 9 because that is what is needed for this
        self.max = max
        self.nums = list(range(0,max+1)) # gernate a list from [0...9]

    def generateNum(self):
        if self.nums.len == 0 :
            self.nums = list(range(0,max+1))  # repopulates list if empyy
        return self.nums.pop(random.randint(0,self.nums.len + 1)) # remove and return a random element from list
        


