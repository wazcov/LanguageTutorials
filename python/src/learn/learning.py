#!/usr/local/bin/python3

teams = {"Canada": "Maple Leafs", "UK": "Man Utd"}

class MyFunctions:
    pass

    #No multiple constructors so have to provide a default
    def __init__(self, colours=["red", "green", "blue"]):
        self.colrs = colours


    @staticmethod
    def itx():
        for i in range(0, 100, 5):
            print(i)

    def cols(self):
        for i, col in enumerate(self.colrs):
            #print(i, col)
            pass
        for c in sorted(self.colrs):
            return(c)

    @classmethod
    def colsCLass(self):
        c = ["aqua", "gold", "bronze"]
        func = MyFunctions(c)
        return func.cols()


    @staticmethod
    def tem(country):
        return teams[country]


