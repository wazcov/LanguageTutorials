class Character:
    def __init__(self, name, gender):
        self.name = name
        self.gender = gender
        self.health = 100

    def is_alive(self):
        return self.health > 0

    def get_health(self):
        return self.health

    def __str__(self):
        return "Character: {} : {}".format(self.name, self.gender)