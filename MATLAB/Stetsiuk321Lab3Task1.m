clear all
N = 64; % задання кількості відліків
t = 0:N-1;

y0 = cos(2*pi*2*t/N); % задання гармонічного сигналу
y = y0+0.2*randn(1,N); % додання до сигналу шуму

tic
M = [sum(t.^6), sum(t.^5), sum(t.^4), sum(t.^3);
     sum(t.^5), sum(t.^4), sum(t.^3), sum(t.^2);
     sum(t.^4), sum(t.^3), sum(t.^2), sum(t.^1);
     sum(t.^3), sum(t.^2), sum(t.^1), sum(t.^0)];

Y = [sum(y.*t.^3); sum(y.*t.^2); sum(y.*t.^1); sum(y.*t.^0)];

X = M\Y;

P = X(1)*t.^3 + X(2)*t.^2 + X(3)*t + X(4); % будування полінома
time=toc

std(y0-y) % середньоквадратичні відхилення
std(y0-P)

plot(t,y, t,y0, t,P), grid % виведення графіка на екран
