from game_character import Character

class Player(Character):
    def __init__(self, name, gender):
        super().__init__(name, gender)

    def give_bonus_health(self):
        self.health = 200

    def is_alive(self):
        return self.health > 0

    def __str__(self):
        return "Character: {} : {}".format(self.name, self.gender)