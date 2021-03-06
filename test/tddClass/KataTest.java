package tddClass;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class KataTest {
    private Kata calculator;
    @BeforeEach
    public void startWithThis(){
        calculator = new Kata();
    }
    @Test
    public void addTest() {
        int result = calculator.add(4, 3);

        assertEquals(7, result);
    }
    @Test
    public void subtractionTest() {
        int result = calculator.subtract(7, 2);
        assertEquals(5, result);
    }

    @Test
    public void absoluteSubtractionTest() {
        int result = calculator.subtract(2, 7);
        assertEquals(5, result);
    }

    @Test
    public void calculateAreaTest() {
        double result = calculator.findAreaWith(7);
        assertEquals(154.0, result);
    }

    @Test
    public void bitFlipper() {
        int result = calculator.flip(0);
        assertEquals(1, result);
    }

    @Test
    public void palindromeTest() {
        boolean result = calculator.KataIsPalindrome(12121);
        assertTrue(result);
        result = calculator.KataIsPalindrome(12431);
        assertFalse(result);
    }

    @Test
    public void testDrillerBelow4Test() {
        int result = calculator.setPrice(3);
        assertEquals(6000, result);
    }

    @Test
    public void testDrillerBelow10Test() {
        int result = calculator.setPrice(9);
        assertEquals(16200, result);
    }

    @Test
    public void testDrillerBelow30Test() {
        int result = calculator.setPrice(28);
        assertEquals(44800, result);
    }

    @Test
    public void testDrillerBelow50Test() {
        int result = calculator.setPrice(42);
        assertEquals(63000, result);
    }

    @Test
    public void testDrillerBelow100Test() {
        int result = calculator.setPrice(98);
        assertEquals(127400, result);
    }

    @Test
    public void testDrillerBelow200Test() {
        int result = calculator.setPrice(173);
        assertEquals(207600, result);
    }

    @Test
    public void testDrillerBelow500Test() {
        int result = calculator.setPrice(480);
        assertEquals(528000, result);
    }

    @Test
    public void testDrillerAbove500Test() {
        int result = calculator.setPrice(742);
        assertEquals(742000, result);
    }

    @Test
    public void evenOrOddNumber(){
        boolean result = calculator.isEven(8);
        assertEquals(true, result);
    }
    @Test
    public void largestNumber(){
        int result = calculator.isLargest(23,97,66,88,45);
        assertEquals(97,result);
    }

    @Test
    public void largestNumber2(){
        Kata user = new Kata();
        int result = calculator.isLargestNumber(23,97,66,88,45);
        assertEquals(97,result);
    }
    @Test
    public void numberOfFactorsTest(){
        int result = calculator.isNumberOfFactor(30);
        assertEquals(8, result);
    }

    @Test
    public void primeNumberTest(){
        boolean result = calculator.primeNumber(13);
        assertTrue(result);
    }
    @Test
    public void maximumNumberInArray(){
        int[] scores = {34,23,14,45,23};
        assertEquals(45,Kata.findMaximumFrom(scores));
    }
    @Test
    public void minimumInArray(){
        int[] scores = {34,23,14,45,23};
        assertEquals(14,Kata.findMinimumFrom(scores));
    }
    @Test
    public void averageInArray(){
        int[] scores = {34,23,14,45,23};
        assertEquals(27.8,Kata.findAverageFrom(scores));
    }
    @Test
    public void sumOfDistinctElementsInTwoArraysCanBeCalculatedTest(){
        int[] array1 = {3,1,7,9};
        int[] array2 = {2,4,1,9,3};
        assertEquals(13,Kata.findSumOfDistinctElements(array1,array2));
    }

    @Test
    public void sumOfSameElementsInTwoArraysCanBeCalculatedTest(){
        int[] array1 = {12,13,6,10};
        int[] array2 = {13,10,16,15};
        assertEquals(46,Kata.findSumOfSameElements(array1,array2));
    }

    @Test
    public void sumOfDistinctElementsInTwoLinkedListCanBeCalculatedTest(){
        LinkedList<Integer>linkedList1 = new LinkedList<>();
        linkedList1.add(3); linkedList1.add(1); linkedList1.add(7); linkedList1.add(9);

        LinkedList<Integer>linkedList2 = new LinkedList<>();
        linkedList2.add(2); linkedList2.add(4); linkedList2.add(1); linkedList2.add(9); linkedList2.add(3);

        assertEquals(13,Kata.findSumOfDistinctElementsInLinkedList(linkedList1,linkedList2));
    }

    @Test
    public void sumOfSameElementsInTwoLinkedListCanBeCalculatedTest(){
        LinkedList<Integer>linkedList1 = new LinkedList<>();
        linkedList1.add(12); linkedList1.add(13); linkedList1.add(6); linkedList1.add(10);

        LinkedList<Integer>linkedList2 = new LinkedList<>();
        linkedList2.add(13); linkedList2.add(10); linkedList2.add(16); linkedList2.add(15);

        assertEquals(46,Kata.findSumOfSameElementsInLinkedList(linkedList1,linkedList2));
    }
}