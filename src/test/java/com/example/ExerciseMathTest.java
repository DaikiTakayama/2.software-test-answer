package com.example;

//Matcher関連メソッドを利用するためのstaticインポート
import static org.hamcrest.Matchers.comparesEqualTo;
//JUnit関連メソッドを利用するためのstaticインポート
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.junit.Test;

public class ExerciseMathTest {
	private int answer = 0;

	@Test
	public void testFactorial1() {
		try {
			answer = ExerciseMath.factorial(-1);
			fail("TC1:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC1:メッセージが一致しません", e.getMessage(), comparesEqualTo("0以下の値は不正です。"));
		}
	}
	
	@Test
	public void testFactorial2() {
		try {
			answer = ExerciseMath.factorial(0);
			fail("TC2:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC2:メッセージが一致しません", e.getMessage(), comparesEqualTo("0以下の値は不正です。"));
		}
	}
	
	@Test
	public void testFactorial3() {
		answer = ExerciseMath.factorial(1);
		System.out.println(answer);
		assertThat("TC3:値が一致しません", answer, comparesEqualTo(1));
	}
	
	@Test
	public void testFactorial4() {
		answer = ExerciseMath.factorial(2);
		assertThat("TC4:値が一致しません", answer, comparesEqualTo(2));
	}
	
	@Test
	public void testFactorial5() {
		answer = ExerciseMath.factorial(3);
		assertThat("TC5:値が一致しません", answer, comparesEqualTo(6));
	}
	
	@Test
	public void testFactorial6() {
		answer = ExerciseMath.factorial(4);
		assertThat("TC6:値が一致しません", answer, comparesEqualTo(24));
	}
	
	@Test
	public void testFactorial7() {
		answer = ExerciseMath.factorial(11);
		assertThat("TC7:値が一致しません", answer, comparesEqualTo(39916800));
	}
	
	@Test
	public void testFactorial8() {
		answer = ExerciseMath.factorial(12);
		assertThat("TC8:値が一致しません", answer, comparesEqualTo(479001600));
	}
	
	@Test
	public void testFactorial9() {
		try {
			answer = ExerciseMath.factorial(13);
			fail("TC9:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC9:メッセージが一致しません", e.getMessage(), comparesEqualTo("13以上の値は不正です。"));
		}
	}
	
	@Test
	public void testFactorial10() {
		try {
			answer = ExerciseMath.factorial(14);
			fail("TC10:例外が発生しなければなりません");
		} catch (IllegalArgumentException e) {
			assertThat("TC10:メッセージが一致しません", e.getMessage(), comparesEqualTo("13以上の値は不正です。"));
		}
	}
}
