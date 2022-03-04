import random

class NonRepRandom:
    def __init__(self, max):
        self.max = max
        nums = list(range(0,max+1))

    def generateNum():
        if nums.len == 0 :
            nums = list(range(0,max+1))
        return nums.pop(random.randint(0,nums.len + 1))
        


