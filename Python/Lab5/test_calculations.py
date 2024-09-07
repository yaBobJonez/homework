import pytest

from Disc import Disc
from Square import Square

@pytest.mark.parametrize("top_left, bottom_right, expected_area, expected_perimeter", [
    ( (1,1), (2,2), 1, 4 ),
    ( (-5,-9.12), (3.14,-9), 33.137, 23.02589846238361 ),
    ( (0,0), (0,0), 0, 0 ),
])
def test_square_calculations(top_left, bottom_right, expected_area, expected_perimeter):
    sq = Square(top_left, bottom_right)
    assert round(sq.calculate_area(), 14) == expected_area
    assert round(sq.calculate_perimeter(), 14) == expected_perimeter

@pytest.mark.parametrize("radius, expected_area, expected_perimeter", [
    ( 2, 12.56637061435917, 12.56637061435917 ),
    ( 9.12, 261.30008400673887, 57.30265000147782 ),
    ( True, 3.14159265358979, 6.28318530717959 ),
    ( ord('f'), 32685.129967948207, 640.8849013323178 ),
    ( 0, 0, 0 )
])
def test_disc_calculations(radius, expected_area, expected_perimeter):
    disc = Disc(radius)
    assert round(disc.calculate_area(), 14) == expected_area
    assert round(disc.calculate_perimeter(), 14) == expected_perimeter
