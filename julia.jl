# cerner_2^5_2019

#super clean math
p(x) = 2x^2 + 2
f(x, y) = 1 + 2p(x) / y
println( f(1,3) ) #3.66666666

#chained comparisons
println(1 < 2 < 3 < 4 < 5 == 5 != 6) #true

#bitshifts ftw
times2(x) = x << 1
times3(x) = x + x << 1
times10(x) = x << 3 + x << 1

n = 45
println("n  = " * string(n))
println("2x = " *  string(times2(n)))
println("3x = " *  string(times3(n)))
println("10x = " * string(times10(n)))

#1-based arrays!?!?
s = ["a", "b", "c"]
println(s[1])  #a