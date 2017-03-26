package ru.job4j.calculator;

/**
*	Calculator.
*	@author permin daniil (danya1991@list.ru)
*	@version 1
*	@since 26.03.2017
*/

public class Calculator {
/**
*	Поле класса для записи результата от полученной операции.
*/
    private double result;
/**
*  Метод сложения двух чисел.
* @param first первое число
* @param second	второе число
*/
    public void add(double first, double second) {
        this.result = first + second;
    }
/**
*  Метод вычитания двух чисел.
* @param first первое число
* @param second	второе число
*/
	public void subtraction(double first, double second) {
		this.result = first - second;
	}
/**
*  Метод деления двух чисел.
* @param first первое число
* @param second	второе число
*/
	public void div(double first, double second) {
		this.result = first / second;
	}
/**
*  Метод умножения двух чисел.
* @param first первое число
* @param second второе число
*/
	public void multiple(double first, double second) {
		this.result = first * second;
	}
/**
*  Метод возвращения поля result.
*/
	public double getResult() {
        return this.result;
    }
}