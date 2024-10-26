clear
clc

N = 256; %256, 256, 512
load woman %chess, catherine, porche
x = 0:N-1;

X1 = zeros(N);
for i = 1:N
    y = X(i,:);

    n = 0:N-1;
    k = 0:N-1;
    a = arrayfun(@(n) sum(y.*cos(2.*pi.*n.*(k+1)/N))/N, n);
    b = arrayfun(@(n) sum(y.*sin(2.*pi.*n.*(k+1)/N))/N, n);

    A = sqrt(a.^2 + b.^2);
    T = arrayfun(@(k) sum(a.*cos(2.*pi.*n.*k/N) + b.*sin(2.*pi.*n.*k/N)), k);
    
    X1(i,:) = T;
end

imshow(X, map)
figure
imshow(X1, map)
figure
plot(A), grid
figure
plot(x,y, x,T,'*'), grid
