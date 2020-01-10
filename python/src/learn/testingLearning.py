#!/usr/local/bin/python3

from learning import MyFunctions

import unittest


class InitTests(unittest.TestCase):

    def testStatic(self):
        self.assertEqual(MyFunctions.tem('Canada'), "Maple Leafs")
        self.assertNotEqual(MyFunctions.tem('Canada'), "Maple Leaves")

    def testInstance(self):
        fun = MyFunctions()
        self.assertEqual(fun.cols(), 'blue')

    def testClass(self):
        fun2 = MyFunctions()
        self.assertEqual(fun2.colsCLass(), 'aqua')


if __name__ == "__main__":
    unittest.main()