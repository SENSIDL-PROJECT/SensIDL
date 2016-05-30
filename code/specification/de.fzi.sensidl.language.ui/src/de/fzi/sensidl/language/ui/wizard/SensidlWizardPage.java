package de.fzi.sensidl.language.ui.wizard;

import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
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
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.eclipse.ui.dialogs.ElementTreeSelectionDialog;
import org.eclipse.ui.model.WorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

/**
 * The Sensidl Wizard page which shows the settings
 * 
 * @author Sven Eckhardt
 *
 */
public class SensidlWizardPage extends WizardPage {
	
	private boolean vortoTransformation;
	
	/**
	 * contains all generation languages that are shown in the generation
	 * wizard. The languages are: <code>Java</code>,
	 * <code>Java Plug-in Project</code>, <code>JavaScript</code>,
	 * <code>C</code>, <code>C#</code> and <code>All</code>
	 */
	public static final String[] GENERATION_LANGUAGES_STRINGS = new String[] { "Java", "Java Plug-in Project",
			"JavaScript", "C", "C#", "All" };

	// first row Elements
	private Label label_ModelPath;
	private Button button_FileSystemModelPath;
	private Button button_WorkspaceModelPath;
	private Text textfield_ModelPath;
	private String text_ModelPath;

	// second row Elements
	private Label label_Path;
	private Label label_JavaProjectPathInfomation;
	private Button button_FileSystemPath;
	private Button button_WorkspacePath;
	private Text textfield_Path;
	private String text_Path;
	//
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
			String path, String language, boolean vortoTransformation) {
		super(pageName, title, titleImage);
		this.text_ModelPath = modelPath;
		this.text_Path = path;
		this.text_language = language;
		this.vortoTransformation = vortoTransformation;
	}

	@Override
	public void performHelp() {
		// PlatformUI.getWorkbench().getHelpSystem().displayHelp("de.fzi.sensidl.help.sensidl_wizard_help_documentation");
	}

	@Override
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		FormLayout formLayout = new FormLayout();
		formLayout.marginHeight = 10;
		formLayout.marginWidth = 10;
		composite.setLayout(formLayout);

		// first row
		button_FileSystemModelPath = new Button(composite, SWT.PUSH);
		button_FileSystemModelPath.setText("File System...");
		FormData position3_1 = new FormData();
		position3_1.top = new FormAttachment(0, 0);
		position3_1.right = new FormAttachment(100, 0);
		button_FileSystemModelPath.setLayoutData(position3_1);
		if (vortoTransformation) {
			button_FileSystemModelPath.setEnabled(false);
		}

		button_WorkspaceModelPath = new Button(composite, SWT.PUSH);
		button_WorkspaceModelPath.setText("Workspace...");
		FormData position3_2 = new FormData();
		position3_2.top = new FormAttachment(0, 0);
		position3_2.right = new FormAttachment(button_FileSystemModelPath, -5);
		button_WorkspaceModelPath.setLayoutData(position3_2);
		if (vortoTransformation) {
			button_WorkspaceModelPath.setEnabled(false);
		}

		label_ModelPath = new Label(composite, SWT.READ_ONLY);
		label_ModelPath.setText("Model: ");
		FormData position1 = new FormData();
		position1.left = new FormAttachment(0, 0);
		position1.top = new FormAttachment(0, 5);
		label_ModelPath.setLayoutData(position1);
		if (vortoTransformation) {
			label_ModelPath.setEnabled(false);
		}

		textfield_ModelPath = new Text(composite, SWT.SINGLE);
		textfield_ModelPath.setText(text_ModelPath);
		FormData position2 = new FormData();
		position2.left = new FormAttachment(label_ModelPath, 10);
		position2.top = new FormAttachment(0, 5);
		position2.right = new FormAttachment(button_WorkspaceModelPath, -5);
		textfield_ModelPath.setLayoutData(position2);
		if (vortoTransformation) {
			textfield_ModelPath.setEnabled(false);
		}

		button_FileSystemModelPath.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				FileDialog dialog = new FileDialog(new Shell(), SWT.OPEN);
				dialog.setFilterExtensions(new String[] { "*.sidl" });
				// set the workspace directory as default:
				dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				textfield_ModelPath.setText(dialog.open().replaceAll("\\\\", "/"));

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		button_WorkspaceModelPath.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ElementTreeSelectionDialog dialog = new ElementTreeSelectionDialog(new Shell(),
						new WorkbenchLabelProvider(), new WorkbenchContentProvider());
				dialog.setInput(ResourcesPlugin.getWorkspace().getRoot());
				dialog.setAllowMultiple(false);
				dialog.setDoubleClickSelects(true);

				if (dialog.open() == ElementTreeSelectionDialog.OK) {
					IResource resource = (IResource) dialog.getFirstResult();
					textfield_ModelPath.setText("platform:/resource" + resource.getFullPath().toString());
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		// second row
		button_FileSystemPath = new Button(composite, SWT.PUSH);
		button_FileSystemPath.setText("File System...");
		FormData position6_1 = new FormData();
		position6_1.top = new FormAttachment(button_FileSystemModelPath, 10);
		position6_1.right = new FormAttachment(100, 0);
		button_FileSystemPath.setLayoutData(position6_1);

		button_WorkspacePath = new Button(composite, SWT.PUSH);
		button_WorkspacePath.setText("Workspace...");
		FormData position6_2 = new FormData();
		position6_2.top = new FormAttachment(button_WorkspaceModelPath, 10);
		position6_2.right = new FormAttachment(button_FileSystemPath, -5);
		button_WorkspacePath.setLayoutData(position6_2);

		label_Path = new Label(composite, SWT.READ_ONLY);
		label_Path.setText("Path: ");
		FormData position4 = new FormData();
		position4.left = new FormAttachment(0, 0);
		position4.top = new FormAttachment(button_FileSystemModelPath, 15);
		label_Path.setLayoutData(position4);

		textfield_Path = new Text(composite, SWT.SINGLE);
		textfield_Path.setText(text_Path);
		FormData position5 = new FormData();
		position5.left = new FormAttachment(label_ModelPath, 10);
		position5.top = new FormAttachment(button_FileSystemModelPath, 15);
		position5.right = new FormAttachment(button_WorkspacePath, -5);
		textfield_Path.setLayoutData(position5);

		textfield_Path.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(ModifyEvent e) {
				if (combo_language.getText().equals(GENERATION_LANGUAGES_STRINGS[1])) {
					if (textfield_Path.getText().startsWith("platform:/resource/")) {
						if (textfield_Path.getText().replace("platform:/resource/", "").contains("/")) {
							setPageComplete(false);
							label_JavaProjectPathInfomation.setVisible(true);
						} else {
							setPageComplete(true);
							label_JavaProjectPathInfomation.setVisible(false);
						}
					} else {
						setPageComplete(false);
						label_JavaProjectPathInfomation.setVisible(true);
					}
				} else {
					setPageComplete(true);
					label_JavaProjectPathInfomation.setVisible(false);
				}

			}
		});

		button_FileSystemPath.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				DirectoryDialog dialog = new DirectoryDialog(new Shell(), SWT.OPEN);
				// set the workspace directory as default:
				dialog.setFilterPath(ResourcesPlugin.getWorkspace().getRoot().getLocation().toString());
				textfield_Path.setText(dialog.open().replaceAll("\\\\", "/"));

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		button_WorkspacePath.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				ContainerSelectionDialog dialog = new ContainerSelectionDialog(new Shell(),
						ResourcesPlugin.getWorkspace().getRoot(), true, "Select Destination");

				if (dialog.open() == ContainerSelectionDialog.OK) {
					Path path = (Path) dialog.getResult()[0];
					textfield_Path.setText("platform:/resource" + path.toString());
				}

			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		// third row
		combo_language = new Combo(composite, SWT.READ_ONLY);
		combo_language.setItems(GENERATION_LANGUAGES_STRINGS);
		combo_language.setText(text_language);
		FormData position8 = new FormData();
		position8.left = new FormAttachment(0, 0);
		position8.top = new FormAttachment(button_WorkspacePath, 10);
		position8.right = new FormAttachment(100, 0);
		combo_language.setLayoutData(position8);

		combo_language.addSelectionListener(new SelectionListener() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				if (combo_language.getText().equals(GENERATION_LANGUAGES_STRINGS[1])) {
					button_FileSystemPath.setEnabled(false);
				} else {
					button_FileSystemPath.setEnabled(true);
					setPageComplete(true);
					label_JavaProjectPathInfomation.setVisible(false);
				}
			}

			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
				widgetSelected(e);

			}
		});

		if (combo_language.getText().equals(GENERATION_LANGUAGES_STRINGS[1])) {
			button_FileSystemPath.setEnabled(false);
		} else {
			button_FileSystemPath.setEnabled(true);
		}

		label_JavaProjectPathInfomation = new Label(composite, SWT.READ_ONLY);
		label_JavaProjectPathInfomation
				.setText("Warning: the Java Project has to be at the root of the current workspace");
		FormData position9 = new FormData();
		position9.top = new FormAttachment(combo_language, 10);
		label_JavaProjectPathInfomation.setLayoutData(position9);
		label_JavaProjectPathInfomation.setVisible(false);

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
