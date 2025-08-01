package com.swabhav.test;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import com.swabhav.model.BankAccount;

public class BankAccountTest {

	
	BankAccount account;
	@BeforeEach
	void setup() {
		account=new BankAccount(100);
	}
     
	
	@Nested
	@DisplayName("Testing deposit class")
	class DepositTests{
		@Test
		public void testValidDeposit() {
			account.deposit(50);
			assertEquals(150, account.getBalance());
		}

		@Test
		public void testInvalidDesposit() {
			
			assertThrows(IllegalArgumentException.class,()->account.deposit(0));
		}
	}

	@Nested
	@DisplayName("Testing withdrawal class")
	class WithDrawTest{
		@Test
		public void testValidWithdrawal() {
			account.withDraw(40);
			assertEquals(60, account.getBalance());
		}

		@Test
		public void testOverDraft() {

			assertThrows(IllegalArgumentException.class, () -> account.withDraw(200.0));
		}
	}


}
