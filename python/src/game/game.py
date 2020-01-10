#!/usr/local/bin/python3


from game_player import Player
from random import randint


def play():
    player = Player("Fred Smith", "Male")
    while player.is_alive():
        alive = randint(0, 9)
        print("Health: " + str(player.health))
        if (alive == 0):
            player.health = 0
            print(player.name + " is Dead")
        else:
            player.give_bonus_health()


if (__name__ == "__main__"):
    play()
