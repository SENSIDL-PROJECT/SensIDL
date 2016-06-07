package de.fzi.sensidl.language.generator.generationstep.filegenerationstep;

import com.google.common.io.Files;
import de.fzi.sensidl.language.generator.SensIDLConstants;
import de.fzi.sensidl.language.generator.generationstep.GenerationStep;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * The FileGenerationStep is a concrete subclass of the GenerationStep class.
 * The main task of the class encapsulate the responsibility of the actual code generation.
 */
@SuppressWarnings("all")
public class FileGenerationStep extends GenerationStep {
  private final static Logger logger = Logger.getLogger(FileGenerationStep.class);
  
  private final static int LINE_LENGTH = 80;
  
  private final static String SEPARATION_STRING = ", ";
  
  private final static String UNIFIED_TAB_DISTANCE = "\t\t\t\t\t\t\t\t";
  
  private final static String START_SYMBOL = "*";
  
  private final IFileSystemAccess fsa;
  
  private HashMap<String, ArrayList<String>> fileCache;
  
  /**
   * The constructor is used to initialize a new IFileSystemAccess-object.
   * @param newFsa Corresponds to the IFileSystemAccess-object which is needed to generate the different files.
   */
  public FileGenerationStep(final IFileSystemAccess newFsa) {
    this.fsa = newFsa;
    HashMap<String, ArrayList<String>> _hashMap = new HashMap<String, ArrayList<String>>();
    this.fileCache = _hashMap;
  }
  
  /**
   * @see GenerationStep#startGenerationTask()
   */
  @Override
  public void startGenerationTask() {
    Set<String> _keySet = GenerationStep.filesToGenerate.keySet();
    for (final String file : _keySet) {
      {
        FileGenerationStep.logger.info(("Start with code-generation of file " + file));
        this.insertVersioningCommentTo(file);
        CharSequence _get = GenerationStep.filesToGenerate.get(file);
        this.fsa.generateFile(file, _get);
        FileGenerationStep.logger.info((("File " + file) + " was successfully generated"));
      }
    }
  }
  
  public CharSequence insertVersioningCommentTo(final String file) {
    CharSequence _xblockexpression = null;
    {
      String _fileExtension = Files.getFileExtension(file);
      final ArrayList<String> fileExtensions = this.createExtensions(_fileExtension);
      boolean _extensionsAlreadyInCache = this.extensionsAlreadyInCache(fileExtensions);
      boolean _equals = (_extensionsAlreadyInCache == false);
      if (_equals) {
        this.getAllFilesWithSameExtension(fileExtensions);
      }
      CharSequence _get = GenerationStep.filesToGenerate.get(file);
      final StringBuilder fileToEdit = new StringBuilder(_get);
      String _property = System.getProperty("line.separator");
      fileToEdit.insert(0, _property);
      CharSequence _versioningComment = this.getVersioningComment(fileExtensions, file);
      fileToEdit.insert(0, _versioningComment);
      _xblockexpression = GenerationStep.filesToGenerate.put(file, fileToEdit);
    }
    return _xblockexpression;
  }
  
  public boolean extensionsAlreadyInCache(final ArrayList<String> fileExtensions) {
    Set<String> _keySet = this.fileCache.keySet();
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String cachedExtension) {
        final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
          @Override
          public Boolean apply(final String fileExtension) {
            return Boolean.valueOf(fileExtension.equals(cachedExtension));
          }
        };
        return Boolean.valueOf(IterableExtensions.<String>exists(fileExtensions, _function));
      }
    };
    return IterableExtensions.<String>exists(_keySet, _function);
  }
  
  public ArrayList<String> createExtensions(final String fileExtension) {
    final String editedCExtension = Files.getFileExtension(SensIDLConstants.C_EXTENSION);
    final String editedHeaderExtension = Files.getFileExtension(SensIDLConstants.HEADER_EXTENSION);
    boolean _or = false;
    boolean _equals = fileExtension.equals(editedCExtension);
    if (_equals) {
      _or = true;
    } else {
      boolean _equals_1 = fileExtension.equals(editedHeaderExtension);
      _or = _equals_1;
    }
    if (_or) {
      ArrayList<String> _arrayList = new ArrayList<String>();
      final Procedure1<ArrayList<String>> _function = new Procedure1<ArrayList<String>>() {
        @Override
        public void apply(final ArrayList<String> it) {
          it.add(editedCExtension);
          it.add(editedHeaderExtension);
        }
      };
      return ObjectExtensions.<ArrayList<String>>operator_doubleArrow(_arrayList, _function);
    }
    ArrayList<String> _arrayList_1 = new ArrayList<String>();
    final Procedure1<ArrayList<String>> _function_1 = new Procedure1<ArrayList<String>>() {
      @Override
      public void apply(final ArrayList<String> it) {
        it.add(fileExtension);
      }
    };
    return ObjectExtensions.<ArrayList<String>>operator_doubleArrow(_arrayList_1, _function_1);
  }
  
  public String getUnifiedIdentifier(final ArrayList<String> fileExtensions) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String unifiedIdentifier = _builder.toString();
      for (final String ext : fileExtensions) {
        String _unifiedIdentifier = unifiedIdentifier;
        unifiedIdentifier = (_unifiedIdentifier + ("_" + ext));
      }
      _xblockexpression = unifiedIdentifier;
    }
    return _xblockexpression;
  }
  
  public void getAllFilesWithSameExtension(final ArrayList<String> fileExtensions) {
    final ArrayList<String> files = new ArrayList<String>();
    Set<String> _keySet = GenerationStep.filesToGenerate.keySet();
    for (final String filename : _keySet) {
      final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
        @Override
        public Boolean apply(final String fileExtension) {
          String _fileExtension = Files.getFileExtension(filename);
          return Boolean.valueOf(_fileExtension.equals(fileExtension));
        }
      };
      boolean _exists = IterableExtensions.<String>exists(fileExtensions, _function);
      if (_exists) {
        files.add(filename);
      }
    }
    String _unifiedIdentifier = this.getUnifiedIdentifier(fileExtensions);
    this.fileCache.put(_unifiedIdentifier, files);
  }
  
  public CharSequence getVersioningComment(final ArrayList<String> fileExtensions, final String currentFileName) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("/*");
    _builder.newLine();
    _builder.append("*File:\t\t\t\t\t\t\t");
    _builder.append(currentFileName, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*Version:\t\t\t\t\t\t");
    _builder.newLine();
    _builder.append("*Generate at:\t\t\t\t\t");
    SimpleDateFormat _simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date _date = new Date();
    String _format = _simpleDateFormat.format(_date);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    Object _printFiles = this.printFiles(currentFileName, fileExtensions);
    _builder.append(_printFiles, "");
    _builder.newLineIfNotEmpty();
    _builder.append("*/");
    _builder.newLine();
    return _builder;
  }
  
  public Object printFiles(final String currentEditedFile, final ArrayList<String> fileExtensions) {
    Object _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      String filesToPrint = _builder.toString();
      int counter = 1;
      String _unifiedIdentifier = this.getUnifiedIdentifier(fileExtensions);
      final ArrayList<String> files = this.fileCache.get(_unifiedIdentifier);
      String _filesToPrint = filesToPrint;
      filesToPrint = (_filesToPrint + ("*Further generated artifacts:" + "\t"));
      for (final String currentFile : files) {
        {
          boolean _equals = currentFile.equals(currentEditedFile);
          boolean _not = (!_equals);
          if (_not) {
            String _filesToPrint_1 = filesToPrint;
            filesToPrint = (_filesToPrint_1 + currentFile);
            String _filesToPrint_2 = filesToPrint;
            filesToPrint = (_filesToPrint_2 + FileGenerationStep.SEPARATION_STRING);
          }
          int _length = filesToPrint.length();
          boolean _greaterEqualsThan = (_length >= (FileGenerationStep.LINE_LENGTH * counter));
          if (_greaterEqualsThan) {
            String _filesToPrint_3 = filesToPrint;
            String _property = System.getProperty("line.separator");
            filesToPrint = (_filesToPrint_3 + _property);
            String _filesToPrint_4 = filesToPrint;
            filesToPrint = (_filesToPrint_4 + (FileGenerationStep.START_SYMBOL + FileGenerationStep.UNIFIED_TAB_DISTANCE));
            counter++;
          }
        }
      }
      StringBuilder _stringBuilder = new StringBuilder(filesToPrint);
      _xblockexpression = this.postProcessing(_stringBuilder);
    }
    return _xblockexpression;
  }
  
  public Object postProcessing(final StringBuilder filesToPrint) {
    String _xblockexpression = null;
    {
      final String comma = ",";
      String _string = filesToPrint.toString();
      boolean _contains = _string.contains(comma);
      boolean _not = (!_contains);
      if (_not) {
        return filesToPrint;
      }
      while ((!filesToPrint.toString().endsWith(comma))) {
        int _length = filesToPrint.length();
        int _minus = (_length - 1);
        filesToPrint.deleteCharAt(_minus);
      }
      int _length = filesToPrint.length();
      int _minus = (_length - 1);
      filesToPrint.deleteCharAt(_minus);
      _xblockexpression = filesToPrint.toString();
    }
    return _xblockexpression;
  }
}
