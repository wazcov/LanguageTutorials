#!/usr/local/bin/python3


def test_me(food: str):
    print("You want a bite of " + str(food))


class Pizza:
    def __init__(self, title: str, base):
        self.title = title
        self.base = base


if __name__ == "__main__":
    test_me("cheese")
    test_me(123)
    test_me(["eggs", "toast"])
    p = Pizza("sloppyG", "loaded")
    print(p.base)

