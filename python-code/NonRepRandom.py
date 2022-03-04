import random

class NonRepRandom:
    def __init__(self, max):
        self.max = max
        nums = list(range(0,max+1))

    def generateNum():
        if nums.len == 0 :
            nums = list(range(0,max+1))  # repopulates list if empyy
        return nums.pop(random.randint(0,nums.len + 1)) # remove and return a random element from list
        


