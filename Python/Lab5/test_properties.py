import pytest

from Disc import Disc
from Square import Square

@pytest.mark.parametrize("top_left, bottom_right", [
    ( (1,1), (2,2) ),
    ( (-5,-9.12), (3.14,-9) ),
    ( (0,0), (0,0) ),
])
def test_square_properties(top_left, bottom_right):
    sq = Square()
    assert sq.topLeft == (0, 0)
    assert sq.bottomRight == (1, 1)
    sq.topLeft = top_left
    sq.bottomRight = bottom_right
    assert sq.topLeft == top_left
    assert sq.bottomRight == bottom_right

@pytest.mark.parametrize("radius", [2, 9.12, True, ord('f'), 0])
def test_disc_properties(radius):
    disc = Disc()
    assert disc.radius == 1
    disc.radius = radius
    assert disc.radius == radius
@pytest.mark.parametrize("radius", [-5, -9.12, [], 'f'])
def test_disc_properties_wrong(radius):
    disc = Disc()
    assert disc.radius == 1
    with pytest.raises(Exception):
        disc.radius = radius
    assert disc.radius == 1
