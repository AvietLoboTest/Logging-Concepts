package com.assignment;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest {

	private static final Logger LOG = LoggerFactory.getLogger(AppTest.class);

	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void infoLog() {
		LOG.info("performing action {} ", "click operation");
		assertTrue(true);
	}

	@Test
	public void errorLog() {
		try {
			int result = 10 / 0;
		} catch (Exception e) {
			LOG.error("Exception occured {} ", e.getMessage());
		}

	}
}
