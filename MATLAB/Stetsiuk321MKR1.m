% ������� �������� [0; 2�].
x = 0:0.01:2*pi;
% � ����, ������, ������� "2�2\pi2�", ���� � ���� ������ 2�.

% ���������� ������� ������� �������.
f1 = sin(x.^2);
f2 = cos(x.^2);
% � ���� x2, �� � ������� �� x �� ������� 2.

% ���������� ������� (����� �� matplotlib � Python)
% ��� ������� �� ����� �����: ���� �������� (r), ������ ����� (b),
plot(x, f1, 'r', x, f2, 'b'),
% �� ����� ������� (������ � �����)
legend('sin(x^2)', 'cos(x^2)'),
% �� ����.
grid on;
