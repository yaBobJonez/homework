clear

t=1:5; % �������� ������� �����
Y=[7, 5, 1, 12, 8]; % ����������� ������-�������� Y
% ���� ������ �� ���� ����� ����� ��� ������������ ������� 4-�� �������

[t2, P] = polynom4Interpol(t, Y);

plot(t, Y, '*', t2, P), grid % ���� ������� �� �����
