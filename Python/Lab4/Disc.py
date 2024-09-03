from math import sqrt, pi
from Shape import Shape

class Disc(Shape):
    def __init__(self, radius=1):
        if radius < 0: raise ValueError("Радіус не може бути відʼємним.")
        self.__r = radius

    def calculate_area(self):
        return pi * self.__r**2
    def calculate_perimeter(self):
        return 2 * pi * self.__r

    @property
    def radius(self):
        return self.__r
    @radius.setter
    def radius(self, value: float):
        if value < 0: raise ValueError("Радіус не може бути відʼємним.")
        self.__r = value
