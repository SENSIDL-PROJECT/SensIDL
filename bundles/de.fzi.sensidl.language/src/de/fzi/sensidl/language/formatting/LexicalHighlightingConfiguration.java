package de.fzi.sensidl.language.formatting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * Implementation of a lexical Highlighting Configuration. In this class
 * TextStyles for the different elements are declared.
 * 
 * @author Sven Eckhardt
 *
 */
public class LexicalHighlightingConfiguration extends DefaultHighlightingConfiguration {

	/**
	 * The unique Id of the Description Elements
	 */
	public static final String DESCRIPTION_ID = "description";

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		super.configure(acceptor);
		acceptor.acceptDefaultHighlighting(DESCRIPTION_ID, "Description", descriptionTextStyle());
	}

	/**
	 * 
	 * @return the TextStyle for the description Element
	 */
	public TextStyle descriptionTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(150, 150, 25));
		return textStyle;
	}
}
