grammar A2;

/*
 * @name Maryam Ayman ElOraby
 * @id 46-3294
 * @tutorialNum 09
 */

@members {
	/**
	 * Compares two integer numbers
	 *
	 * @param x the first number to compare
	 * @param y the second number to compare
	 * @return 1 if x is equal to y, and 0 otherwise
	 */

	public static int equals(int x, int y) {
	    return x == y ? 1 : 0;
	}

}

s returns [int check]: ss {$check = $ss.checkLen * equals($ss.firstRowSum, $ss.firstColSum) * equals($ss.countRows * $ss.length, $ss.sumLengths) ; }| {$check = 1;};

ss returns [int checkLen, int length, int firstRowSum, int firstColSum, int countRows, int sumLengths]:
 r '#' ss1=ss EOF {$length = $r.length; $checkLen = equals($r.length, $ss1.length);
 $firstRowSum = $r.rowSum; $firstColSum = $r.firstDigit + $ss1.firstColSum; $countRows = 1 + $ss1.countRows; $sumLengths = $r.length + $ss1.sumLengths;}
 | r EOF {$length = $r.length; $checkLen = 1; $firstRowSum = $r.rowSum; $firstColSum = $r.firstDigit; $countRows = 1; $sumLengths = $r.length;} | EOF {$length = 0; $checkLen = 0; $firstRowSum = 0; $firstColSum = 0; $countRows = 0; $sumLengths = 0;};

r returns [int length, int rowSum, int firstDigit]:
 n r1=r {$length = 1 + $r1.length; $rowSum = $n.val + $r1.rowSum; $firstDigit = $n.val;}
 | n {$length = 1; $rowSum = $n.val; $firstDigit = $n.val;};

n returns [int val]: DIGITS {$val = Integer.parseInt($DIGITS.text);};
DIGITS: [0-9];

