package com.javaExamples;

public class MethodOverloading {
	int getBankInterest() {
		return 1;
	}
}
class Axis extends MethodOverloading
{
	int getBankInterest() {
		return 2;
	}
}
class Union extends MethodOverloading
{
	int getBankInterest() {
		return 3;
	}
}


