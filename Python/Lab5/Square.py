from math import sqrt
from Shape import Shape

class Square(Shape):
    def __init__(self, topLeft=(0, 0), bottomRight=(1, 1)):
        self.__x1 = topLeft[0]
        self.__y1 = topLeft[1]
        self.__x2 = bottomRight[0]
        self.__y2 = bottomRight[1]

    def calculate_area(self):
        return self.__diag()**2 / 2
    def calculate_perimeter(self):
        return 2 * sqrt(2) * self.__diag()

    @property
    def topLeft(self):
        return self.__x1, self.__y1
    @topLeft.setter
    def topLeft(self, value: tuple[float, float]):
        self.__x1, self.__y1 = value

    @property
    def bottomRight(self):
        return self.__x2, self.__y2
    @bottomRight.setter
    def bottomRight(self, value: tuple[float, float]):
        self.__x2, self.__y2 = value

    def __diag(self):
        return sqrt( (self.__x2 - self.__x1)**2 + (self.__y2 - self.__y1)**2 )
