package de.fzi.sensidl.language.formatting;

import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * Implementation of the AntlrToken to IdMapper. This class maps the different
 * IDs (starting with "RULE_") to the Highlighting Configuration. 
 * 
 * It extends the DefaultAntlrTokenToAttributeIdMapper
 * 
 * @author Sven Eckhardt
 *
 */
public class AntlrTokenToAttributeIdMapper extends DefaultAntlrTokenToAttributeIdMapper {

	@Override
	public String calculateId(String tokenName, int tokenType) {
		if (tokenName.equals("RULE_DESCRIPTION")) {
			return LexicalHighlightingConfiguration.DESCRIPTION_ID;
		} else {
			return super.calculateId(tokenName, tokenType);
		}

	}

}
