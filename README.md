# MatrixSDD

SDD for a context-free grammar which generates the set of all strings over the alphabet {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, #}. 

The start variable has an attribute `check` whose value is 1 if the generated string represents a matrix of decimal digits where the sum of the first row is equal to the sum of the first column. Otherwise, the value of `check` is 0. 

A string over {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, #} represents a matrix of digits if it is of the form r1#r2#...#rn, where ri ∈ {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}+ and |ri| = |rj|, for every 1<i, j<n.


## File Tree

* [csen1003/](/csen1003)
  * [main/a2/](/csen1003/main/a2)
      * [A2Runner.java](/csen1003/main/a2/A2Runner.java)
  * [tests/a2/](/csen1003/tests/a2)
      * [A2Tests.java](/csen1003/tests/a2/A2Tests.java)
* [grammars/](/grammars)
  * [A2.g4](/grammars/A2.g4)
* [README.md](/README.md)
