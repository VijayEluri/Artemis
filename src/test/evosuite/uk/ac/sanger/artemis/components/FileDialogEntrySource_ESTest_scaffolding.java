/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Sep 19 19:21:42 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class FileDialogEntrySource_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "uk.ac.sanger.artemis.components.FileDialogEntrySource"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/var/folders/r3/l648tx8s7hn8ppds6z2bk5cc000h2n/T/"); 
    java.lang.System.setProperty("user.country", "GB"); 
    java.lang.System.setProperty("user.dir", "/Users/kp11/workspace/applications/Artemis-build-ci/Artemis"); 
    java.lang.System.setProperty("user.home", "/Users/kp11"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "kp11"); 
    java.lang.System.setProperty("user.timezone", ""); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader() ,
      "uk.ac.sanger.artemis.io.EntryInformationException",
      "uk.ac.sanger.artemis.io.GFFMisc",
      "uk.ac.sanger.artemis.FeatureSegmentVector",
      "org.biojava.bio.symbol.SimpleAlignment",
      "uk.ac.sanger.artemis.chado.IBatisDAO",
      "org.biojava.bio.symbol.ReverseSymbolList",
      "uk.ac.sanger.artemis.OptionChangeEvent",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "org.apache.log4j.Level",
      "org.mozilla.javascript.tools.debugger.FileTextArea",
      "uk.ac.sanger.artemis.io.SimpleDocumentFeature",
      "uk.ac.sanger.artemis.sequence.BasePatternFormatException",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "uk.ac.sanger.artemis.io.EntryInformation",
      "uk.ac.sanger.artemis.io.MSPcrunchDocumentEntry",
      "uk.ac.sanger.artemis.EntryChangeListener",
      "uk.ac.sanger.artemis.sequence.MarkerChangeListener",
      "org.biojava.utils.ChangeType",
      "uk.ac.sanger.artemis.sequence.AminoAcidSequence",
      "uk.ac.sanger.artemis.Selectable",
      "uk.ac.sanger.artemis.io.ReadFormatException",
      "org.biojava.utils.ChangeListener",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "uk.ac.sanger.artemis.io.RangeVector",
      "uk.ac.sanger.artemis.io.FeatureTable",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "org.biojava.utils.AbstractChangeable",
      "uk.ac.sanger.artemis.io.PublicDBDocumentEntry",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.GenbankDocumentEntry",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "org.gmod.schema.dao.SchemaDaoI",
      "uk.ac.sanger.artemis.LastSegmentException",
      "uk.ac.sanger.artemis.ChangeEvent",
      "uk.ac.sanger.artemis.util.OutOfRangeException",
      "uk.ac.sanger.artemis.io.GenbankStreamFeature",
      "org.apache.log4j.Hierarchy",
      "uk.ac.sanger.artemis.sequence.MarkerRange",
      "org.biojava.utils.Changeable",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "com.google.common.io.PatternFilenameFilter",
      "uk.ac.sanger.artemis.io.EMBLObject",
      "org.biojava.bio.symbol.SymbolListViews$SymListAsAlignment",
      "uk.ac.sanger.artemis.ActionVector",
      "uk.ac.sanger.artemis.sequence.Strand",
      "htsjdk.variant.variantcontext.filter.SnpFilter",
      "uk.ac.sanger.artemis.chado.GmodDAO",
      "org.emboss.jemboss.gui.Browser",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "uk.ac.sanger.artemis.SimpleEntryGroup",
      "uk.ac.sanger.artemis.OptionChangeListener",
      "uk.ac.sanger.artemis.io.DatabaseInferredFeature",
      "uk.ac.sanger.artemis.io.Sequence",
      "org.biojava.utils.ChangeVetoException",
      "org.biojava.bio.symbol.IllegalAlphabetException",
      "htsjdk.samtools.reference.AbstractFastaSequenceFile",
      "uk.ac.sanger.artemis.util.LargeObjectDocument",
      "uk.ac.sanger.artemis.sequence.MarkerInternal",
      "uk.ac.sanger.artemis.io.GenbankMisc",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "uk.ac.sanger.artemis.chado.JdbcDAO",
      "org.gmod.schema.dao.GeneralDaoI",
      "org.gmod.schema.dao.BaseDaoI",
      "org.apache.log4j.helpers.OptionConverter",
      "org.biojava.bio.symbol.Edit",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "uk.ac.sanger.artemis.io.Location",
      "uk.ac.sanger.artemis.io.MiscLineGroup",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "uk.ac.sanger.artemis.io.PublicDBStreamFeature",
      "org.python.core.packagecache.PathPackageManager$PackageExistsFileFilter",
      "org.apache.log4j.or.ObjectRenderer",
      "org.gmod.schema.cv.CvTerm",
      "org.biojava.bio.symbol.PackedSymbolList",
      "uk.ac.sanger.artemis.sequence.SequenceChangeListener",
      "org.apache.xmlgraphics.java2d.GraphicsConfigurationWithoutTransparency",
      "uk.ac.sanger.artemis.io.FastaStreamSequence",
      "uk.ac.sanger.artemis.io.FeatureEnumeration",
      "uk.ac.sanger.artemis.io.InvalidRelationException",
      "htsjdk.variant.variantcontext.filter.CompoundFilter",
      "uk.ac.sanger.artemis.io.StreamFeature",
      "org.biojava.bio.symbol.OrderNSymbolList",
      "org.biojava.bio.symbol.TranslatedSymbolList",
      "uk.ac.sanger.artemis.util.ReadOnlyException",
      "org.apache.log4j.Category",
      "org.biojava.bio.symbol.GappedSymbolList",
      "uk.ac.sanger.artemis.io.LocationParseException",
      "uk.ac.sanger.artemis.EntryChangeEvent",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "uk.ac.sanger.artemis.Feature",
      "uk.ac.sanger.artemis.io.EmblDocumentEntry",
      "org.apache.batik.gvt.text.GVTACIImpl",
      "uk.ac.sanger.artemis.io.DocumentFeature",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "org.apache.batik.gvt.text.BidiAttributedCharacterIterator",
      "uk.ac.sanger.artemis.Action",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "org.apache.log4j.spi.Configurator",
      "org.gmod.schema.pub.Pub",
      "uk.ac.sanger.artemis.io.MSPcrunchStreamFeature",
      "org.biojava.bio.symbol.DoubleAlphabet$DoubleArray",
      "org.gmod.schema.sequence.Feature",
      "htsjdk.variant.variantcontext.filter.JavascriptVariantFilter",
      "uk.ac.sanger.artemis.EntrySource",
      "uk.ac.sanger.artemis.io.GenbankStreamSequence",
      "org.biojava.bio.Annotatable",
      "picard.vcf.filter.FilterVcf$VariantContextJavascriptFilter",
      "org.gmod.schema.utils.Rankable",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "uk.ac.sanger.artemis.io.BioJavaSequence",
      "uk.ac.sanger.artemis.FeatureVector",
      "uk.ac.sanger.artemis.io.EmblStreamSequence",
      "org.biojava.bio.BioRuntimeException",
      "org.biojava.bio.symbol.SubList",
      "org.biojava.bio.symbol.IntegerAlphabet$IntegerArray",
      "uk.ac.sanger.artemis.components.FileDialogEntrySource",
      "org.gmod.schema.utils.propinterface.PropertyI",
      "org.gmod.schema.dao.OrganismDaoI",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.biojava.utils.Unchangeable",
      "org.apache.log4j.Priority",
      "org.biojava.bio.symbol.RelabeledAlignment",
      "htsjdk.variant.variantcontext.filter.GenotypeQualityFilter",
      "org.biojava.bio.symbol.SymbolList",
      "org.biojava.bio.BioException",
      "org.apache.log4j.LogManager",
      "org.gmod.schema.sequence.FeatureLoc",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "uk.ac.sanger.artemis.io.DocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseDocumentEntry",
      "org.apache.xmlgraphics.java2d.GraphicsConfigurationWithTransparency",
      "org.biojava.bio.symbol.EmptySymbolList",
      "org.biojava.bio.symbol.WindowedSymbolList",
      "org.apache.log4j.DefaultCategoryFactory",
      "uk.ac.sanger.artemis.io.BlastStreamFeature",
      "htsjdk.variant.variantcontext.filter.PassingVariantFilter",
      "org.apache.log4j.or.RendererMap",
      "uk.ac.sanger.artemis.io.OutOfDateException",
      "htsjdk.samtools.reference.ReferenceSequenceFile",
      "uk.ac.sanger.artemis.io.ComparableFeature",
      "uk.ac.sanger.artemis.io.EmblMisc",
      "org.biojava.bio.symbol.ChunkedSymbolList",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "org.gmod.schema.general.DbXRef",
      "org.apache.xmlgraphics.java2d.GenericGraphicsDevice",
      "uk.ac.sanger.artemis.io.Key",
      "uk.ac.sanger.artemis.io.PartialSequence",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.EntryGroupChangeEvent",
      "uk.ac.sanger.artemis.io.SimpleDocumentEntry",
      "org.biojava.bio.symbol.DummySymbolList",
      "uk.ac.sanger.artemis.Entry",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "uk.ac.sanger.artemis.io.FeatureHeader",
      "htsjdk.variant.variantcontext.filter.HeterozygosityFilter",
      "uk.ac.sanger.artemis.io.EmblStreamFeature",
      "uk.ac.sanger.artemis.io.QualifierParseException",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboPopupMenuLister",
      "org.biojava.bio.symbol.IllegalSymbolException",
      "uk.ac.sanger.artemis.ExternalProgramVector",
      "org.apache.log4j.CategoryKey",
      "uk.ac.sanger.artemis.io.Qualifier",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$TextAttribute",
      "uk.ac.sanger.artemis.util.InputStreamProgressListener",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "uk.ac.sanger.artemis.io.DocumentEntryAutosaveThread",
      "uk.ac.sanger.artemis.ChangeListener",
      "uk.ac.sanger.artemis.sequence.Marker",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator$AttributeFilter",
      "org.apache.log4j.helpers.Loader",
      "uk.ac.sanger.artemis.sequence.MarkerChangeEvent",
      "org.apache.log4j.ProvisionNode",
      "picard.vcf.filter.VariantFilter",
      "uk.ac.sanger.artemis.io.GFFDocumentEntry",
      "uk.ac.sanger.artemis.io.GFFStreamFeature",
      "org.biojava.bio.symbol.AbstractSymbolList$SubList",
      "uk.ac.sanger.artemis.io.RawStreamSequence",
      "uk.ac.sanger.artemis.io.ReadOnlyEmblStreamFeature",
      "org.biojava.bio.symbol.Alignment",
      "uk.ac.sanger.artemis.io.QualifierInfoException",
      "uk.ac.sanger.artemis.FilteredEntryGroup",
      "uk.ac.sanger.artemis.sequence.SequenceChangeEvent",
      "org.gmod.schema.dao.SequenceDaoI",
      "htsjdk.variant.variantcontext.filter.VariantContextFilter",
      "org.apache.log4j.spi.RootLogger",
      "uk.ac.sanger.artemis.EntryVector",
      "uk.ac.sanger.artemis.io.QualifierVector",
      "org.apache.log4j.spi.RendererSupport",
      "uk.ac.sanger.artemis.FeatureChangeListener",
      "uk.ac.sanger.artemis.util.FileDocument",
      "org.apache.xmlgraphics.java2d.AbstractGraphicsConfiguration",
      "uk.ac.sanger.artemis.FeatureChangeEvent",
      "org.biojava.bio.symbol.Symbol",
      "org.gmod.schema.sequence.FeatureCvTerm",
      "uk.ac.sanger.artemis.io.LineGroup",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "uk.ac.sanger.artemis.util.InputStreamProgressEvent",
      "uk.ac.sanger.artemis.io.BioJavaFeature",
      "uk.ac.sanger.artemis.io.BlastDocumentEntry",
      "uk.ac.sanger.artemis.io.DatabaseStreamFeature",
      "uk.ac.sanger.artemis.io.IndexedGFFDocumentEntry",
      "uk.ac.sanger.artemis.io.DateStampFeature",
      "org.gmod.schema.dao.CvDaoI",
      "uk.ac.sanger.artemis.util.CacheHashMap",
      "org.biojava.bio.symbol.UkkonenSuffixTree$TerminatedSymbolList",
      "uk.ac.sanger.artemis.io.InvalidKeyException",
      "org.apache.log4j.Logger",
      "uk.ac.sanger.artemis.FeatureSegment",
      "uk.ac.sanger.artemis.EntryGroup",
      "uk.ac.sanger.artemis.io.Feature",
      "org.biojava.bio.symbol.SymbolListViews$IndexedSymbolList",
      "org.apache.log4j.helpers.LogLog",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.util.ByteBuffer",
      "org.biojava.bio.symbol.SimpleGappedSymbolList",
      "org.apache.batik.gvt.text.GVTAttributedCharacterIterator",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "org.biojava.bio.symbol.SimpleSymbolList",
      "htsjdk.samtools.filter.AbstractJavascriptFilter",
      "uk.ac.sanger.artemis.io.StreamSequence",
      "uk.ac.sanger.artemis.io.Range",
      "org.apache.batik.gvt.text.AttributedCharacterSpanIterator",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.EntryGroupChangeListener",
      "htsjdk.samtools.reference.IndexedFastaSequenceFile",
      "uk.ac.sanger.artemis.ActionController",
      "uk.ac.sanger.artemis.io.Entry",
      "htsjdk.samtools.reference.ReferenceSequence",
      "uk.ac.sanger.artemis.util.LinePushBackReader",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "uk.ac.sanger.artemis.io.FeatureVector",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "uk.ac.sanger.artemis.util.Document",
      "uk.ac.sanger.artemis.io.IndexFastaStream",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "org.gmod.schema.organism.Organism",
      "uk.ac.sanger.artemis.components.genebuilder.JExtendedComboBox$ComboBoxRenderer",
      "org.biojava.bio.symbol.Alphabet",
      "uk.ac.sanger.artemis.Selection",
      "uk.ac.sanger.artemis.chado.ChadoTransaction",
      "uk.ac.sanger.artemis.sequence.NoSequenceException",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.biojava.bio.symbol.AbstractSymbolList",
      "uk.ac.sanger.artemis.io.BioJavaEntry",
      "uk.ac.sanger.artemis.io.StreamFeatureTable",
      "htsjdk.samtools.reference.FastaSequenceIndex",
      "org.apache.log4j.spi.LoggerRepository",
      "org.gmod.schema.dao.PubDaoI"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.swing.JFrame", false, FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.sequence.Bases", false, FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("uk.ac.sanger.artemis.util.InputStreamProgressListener", false, FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FileDialogEntrySource_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "uk.ac.sanger.artemis.components.FileDialogEntrySource",
      "uk.ac.sanger.artemis.util.Document",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "uk.ac.sanger.artemis.util.DatabaseDocument",
      "uk.ac.sanger.artemis.util.StringVector",
      "uk.ac.sanger.artemis.io.QualifierInfoVector",
      "uk.ac.sanger.artemis.Options",
      "uk.ac.sanger.artemis.io.QualifierInfo",
      "uk.ac.sanger.artemis.sequence.Bases",
      "uk.ac.sanger.artemis.io.SimpleEntryInformation"
    );
  }
}
