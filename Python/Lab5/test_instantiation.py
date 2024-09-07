import pytest

from Shape import Shape
from Disc import Disc
from Square import Square

# Створення екземпляра суперкласу
def test_base_class_instantiation():
    with pytest.raises(TypeError):
        shape = Shape()

# Створення Квадратів
@pytest.mark.parametrize("top_left, bottom_right", [
    ( (1,1), (2,2) ),
    ( (-5,-9.12), (3.14,-9) ),
    ( (0,0), (0,0) ),
])
def test_square_valid_instantiation(top_left, bottom_right):
    sq = Square(top_left, bottom_right)
    assert top_left == sq.topLeft
    assert bottom_right == sq.bottomRight
@pytest.mark.parametrize("top_left, bottom_right", [
    ( [3,4], [1,2] ),
    ( '23', '67' ),
    ('test', 'strings'),
    ( {0: 8, 1: 9.23}, {0: -5, 1: 0} )
])
def test_square_part_valid_instantiation(top_left, bottom_right):
    sq = Square(top_left, bottom_right)
    assert sq.topLeft != top_left
    assert sq.bottomRight != bottom_right
@pytest.mark.parametrize("top_left, bottom_right", [
    ( 4, True ),
    ( 't', 's' ),
    ( {2, 4}, {8, 0} )
])
def test_square_invalid_instantiation(top_left, bottom_right):
    with pytest.raises(Exception):
        sq = Square(top_left, bottom_right)

# Створення Кругів
@pytest.mark.parametrize("radius", [2, 9.12, True, ord('f'), 0])
def test_disc_valid_instantiation(radius):
    disc = Disc(radius)
    assert disc.radius == radius
@pytest.mark.parametrize("radius", [-5, -9.12, [], 'f'])
def test_disc_invalid_instantiation(radius):
    with pytest.raises(Exception):
        disc = Disc(radius)
