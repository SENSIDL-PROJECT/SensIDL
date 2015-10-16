package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * The Sensidl Wizard page which shows the Settings
 * 
 * @author Sven Eckhardt
 *
 */
public class SensidlWizardPage extends WizardPage {

	/**
	 * The standard text for the path text field
	 */
	public static final String TEXT_PATH = "Insert Path...";

	/**
	 * The standard text for the model path text field
	 */
	public static final String TEXT_MODEL_PATH = "Insert Model Path...";

	private static final int LINE_HEIGHT = 15;
	private static final String[] GENERATION_LANGUAGES = new String[] { "Java", "JavaScript", "C", "C#", "All" };

	// first row Elements
	private Label label_ModelPath;
	private Button button_ModelPath;
	private Text textfield_ModelPath;
	private String text_ModelPath;

	// second row Elements
	private Label label_Path;
	private Button button_Path;
	private Text textfield_Path;
	private String text_Path;

	// third row Elements
	private Combo combo_language;
	private String text_language;

	/**
	 * Constructor
	 * 
	 * @param pageName
	 *            the name of the page
	 * @param title
	 *            the title of the page
	 * @param titleImage
	 *            the titleImage of the page
	 * @param modelPath
	 *            the path for the model path text field
	 * @param path
	 *            the path for the path text field
	 * @param language
	 *            the generation language
	 */
	protected SensidlWizardPage(String pageName, String title, ImageDescriptor titleImage, String modelPath,
			String path, String language) {
		super(pageName, title, titleImage);
		this.text_ModelPath = modelPath;
		this.text_Path = path;
		this.text_language = language;
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		FormLayout formLayout = new FormLayout();
		formLayout.marginHeight = 10;
		formLayout.marginWidth = 10;
		composite.setLayout(formLayout);

		// first row
		label_ModelPath = new Label(composite, SWT.READ_ONLY);
		label_ModelPath.setText("Model: ");
		FormData position1 = new FormData();
		position1.left = new FormAttachment(0, 0);
		position1.top = new FormAttachment(0, 0);
		position1.height = LINE_HEIGHT;
		label_ModelPath.setLayoutData(position1);

		button_ModelPath = new Button(composite, SWT.PUSH);
		button_ModelPath.setText("...");
		FormData position3 = new FormData();
		position3.top = new FormAttachment(0, 0);
		position3.right = new FormAttachment(100, 0);
		position3.height = LINE_HEIGHT;
		button_ModelPath.setLayoutData(position3);

		textfield_ModelPath = new Text(composite, SWT.SINGLE);
		textfield_ModelPath.setText(text_ModelPath);
		FormData position2 = new FormData();
		position2.left = new FormAttachment(label_ModelPath, 20);
		position2.top = new FormAttachment(0, 0);
		position2.right = new FormAttachment(button_ModelPath);
		position2.height = LINE_HEIGHT;
		textfield_ModelPath.setLayoutData(position2);

		button_ModelPath.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(new Shell(), SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.sidl" });
				// set the workspace directory as default:
				dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				textfield_ModelPath.setText(dialog.open());

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		// second row
		label_Path = new Label(composite, SWT.READ_ONLY);
		label_Path.setText("Path: ");
		FormData position4 = new FormData();
		position4.left = new FormAttachment(0, 0);
		position4.top = new FormAttachment(label_ModelPath, 10);
		position4.height = LINE_HEIGHT;
		label_Path.setLayoutData(position4);

		button_Path = new Button(composite, SWT.PUSH);
		button_Path.setText("...");
		FormData position6 = new FormData();
		position6.top = new FormAttachment(button_ModelPath, 10);
		position6.right = new FormAttachment(100, 0);
		position6.height = LINE_HEIGHT;
		button_Path.setLayoutData(position6);

		textfield_Path = new Text(composite, SWT.SINGLE);
		textfield_Path.setText(text_Path);
		FormData position5 = new FormData();
		position5.left = new FormAttachment(label_ModelPath, 20);
		position5.top = new FormAttachment(textfield_ModelPath, 10);
		position5.right = new FormAttachment(button_Path);
		position5.height = LINE_HEIGHT;
		textfield_Path.setLayoutData(position5);

		button_Path.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(new Shell(), SWT.OPEN);
				// set the workspace directory as default:
				dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				textfield_Path.setText(dialog.open());

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		// third row

		combo_language = new Combo(composite, SWT.READ_ONLY);
		combo_language.setItems(GENERATION_LANGUAGES);
		combo_language.setText(text_language);
		FormData position8 = new FormData();
		position8.left = new FormAttachment(0, 0);
		position8.top = new FormAttachment(label_Path, 10);
		position8.right = new FormAttachment(100, 0);
		combo_language.setLayoutData(position8);

		setControl(composite);

	}

	/**
	 * 
	 * @return the text of the model path text field
	 */
	public String getTextModelPath() {
		return textfield_ModelPath.getText();
	}

	/**
	 * 
	 * @return the text of the path text field
	 */
	public String getTextPath() {
		return textfield_Path.getText();
	}

	/**
	 * 
	 * @return the generation language
	 */
	public String getLanguage() {
		return combo_language.getText();
	}

}
