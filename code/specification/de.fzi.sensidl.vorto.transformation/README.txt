1) Install Eclipse qvt from update site: http://download.eclipse.org/mmt/qvto/updates/releases
2) Configure qvt-settings:
	-> Navigate to Run Configurations.
	-> Double click "Operational QVT Interpreter".
	-> Select the new created file "Vorto2SensIDLTransformation".
	-> Specify the input-model with "Browse". In the upcoming wizard choose the eMeterVorto.xmi file which can be found in the VortoModel-folder in the trans-project.
	-> Repeat this for the output-model. For the output-model browse to the TransformationResult-folder in the trans-project. Extend the path by adding the desired name of the result (for instance SensIDLModel.sensidl).
	-> Press "Apply" and "Run".
3) Export the de.fzi.sensidl.vorto.transformation.util-project and save the jar-file in the eclipse-folder. To export the project you need to navigate to the manifest of the *.transformation.util
   project and click the "Export wizard". Now specify the path to eclipse. Restart eclipse. 
