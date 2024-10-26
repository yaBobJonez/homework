N = 100;
t = linspace(0, pi, N);

a = [-0.2; 0.8; 0.3; -0.6];
x = [sin(t); cos(t); sin(2*t); cos(2*t)];

S = a(1)*x(1,:) + a(2)*x(2,:) + a(3)*x(3,:) + a(4)*x(4,:);

V = 1 ./ (1 + exp(-S));

plot(t,x), grid, legend('-0.2', '0.8', '0.3', '-0.6')
figure
plot(t,S), grid
figure
plot(t,V), grid
