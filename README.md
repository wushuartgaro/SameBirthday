# SameBirthday
Simple calculation program for the probability of the occurrence of same birthday among a group of people


P: Probability that no one has the same birthday among a group of people

One person： P = 365/365 = 1 <br> 
Two person(s)： P = 365/365 x 364/365 = 0.9973 <br>
Three person(s)： P = 365/365 x 364/365 x 363/365 = 0.9918 <br>

Therefore， for N person(s)： P = 365 x 364 x … x （365-n+1）/ 365^n <br>

Ten person(s)： P = 88.31%  （Probability that no one has the same birthday among 10 person(s)）<br>
                1-P = 11.69%  （Probability that at least two person has the same birthday among 10 person(s)）<br>
Twenty person(s)： P = 58.86% （Probability that no one has the same birthday among 20 person(s)））<br>
                   1-P = 41.14% (Probability that at least two person has the same birthday among 20 person(s)）<br>
Fifty person(s)： P = 2.96% （Probability that no one has the same birthday among 50 person(s)）） <br>
                  1-P = 97.04%  (Probability that at least two person has the same birthday among 50 person(s)） <br>
Hundred person(s)： P = 3.07 x 10^-5 % （Probability that no one has the same birthday among 100 person(s) ））<br>
                    1-P = 99.99%  (Probability that at least two person has the same birthday among 100 person(s)）<br>