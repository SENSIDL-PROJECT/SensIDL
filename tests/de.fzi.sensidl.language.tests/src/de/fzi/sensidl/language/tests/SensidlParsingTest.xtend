/*
 * generated by Xtext 2.20.0
 */
package de.fzi.sensidl.language.tests

import com.google.inject.Inject
import de.fzi.sensidl.design.sensidl.SensorInterface
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Ignore
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(SensidlInjectorProvider)
class SensidlParsingTest {
	@Inject
	ParseHelper<SensorInterface> parseHelper
	
	@Ignore
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
		val errors = result.eResource.errors
		Assert.assertTrue('''Unexpected errors: «errors.join(", ")»''', errors.isEmpty)
	}
}