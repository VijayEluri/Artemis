/*
 * This file was automatically generated by EvoSuite
 * Wed Sep 19 20:57:51 GMT 2018
 */

package uk.ac.sanger.artemis.chado;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import javax.swing.JPasswordField;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.gmod.schema.sequence.FeatureCvTerm;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.chado.ArtemisUtils;
import uk.ac.sanger.artemis.chado.GmodDAO;
import uk.ac.sanger.artemis.io.EmblStreamFeature;
import uk.ac.sanger.artemis.io.GFFStreamFeature;
import uk.ac.sanger.artemis.io.Key;
import uk.ac.sanger.artemis.io.Location;
import uk.ac.sanger.artemis.io.QualifierVector;
import uk.ac.sanger.artemis.io.Range;
import uk.ac.sanger.artemis.util.DatabaseDocument;
import uk.ac.sanger.artemis.util.StringVector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ArtemisUtils_ESTest extends ArtemisUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0);
      // Undeclared exception!
      try { 
        ArtemisUtils.getMatchFeatureWithFeatureRelations("Error reading BioJava sequence: ", "Tab View", "_t;],_@N5>IhzW2~jLm", gFFStreamFeature0, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Key key0 = Key.CDS;
      Range range0 = new Range(172, 172);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature(key0, location0, qualifierVector0);
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0, true);
      // Undeclared exception!
      try { 
        ArtemisUtils.getMatchFeatureWithFeatureRelations("!@l\"", "l:-", "!@l\"", gFFStreamFeature0, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FeatureCvTerm featureCvTerm0 = new FeatureCvTerm();
      // Undeclared exception!
      try { 
        ArtemisUtils.inserFeatureCvTerm((GmodDAO) null, featureCvTerm0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringVector stringVector0 = new StringVector((String) null);
      // Undeclared exception!
      try { 
        ArtemisUtils.getString(stringVector0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0);
      // Undeclared exception!
      try { 
        ArtemisUtils.getMatchFeatureWithFeatureRelations("org.apache.log4j.WriterAppender", "F9D:\"?8N3pkJqV.#L", "F9D:\"?8N3pkJqV.#L", gFFStreamFeature0, false);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArtemisUtils.getMatchFeatureWithFeatureRelations("?", "", "", (GFFStreamFeature) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArtemisUtils.getCurrentSchema();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmblStreamFeature emblStreamFeature0 = new EmblStreamFeature();
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(emblStreamFeature0);
      gFFStreamFeature0.setUserData(emblStreamFeature0);
      // Undeclared exception!
      try { 
        ArtemisUtils.getAnalysisFeature("org.apache.log4j.WriterAppender", "org.apache.log4j.WriterAppender", gFFStreamFeature0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // uk.ac.sanger.artemis.io.EmblStreamFeature cannot be cast to uk.ac.sanger.artemis.Feature
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FeatureCvTerm featureCvTerm0 = new FeatureCvTerm();
      // Undeclared exception!
      try { 
        ArtemisUtils.deleteFeatureCvTerm((GmodDAO) null, featureCvTerm0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("DELETE FROM feature_synonym WHERE synonym_id=", "DELETE FROM feature_synonym WHERE synonym_id=");
      String string0 = ArtemisUtils.getString(stringVector0, "F");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringVector stringVector0 = StringVector.getStrings("Tab View", "=");
      String string0 = ArtemisUtils.getString(stringVector0, "Tab View");
      assertEquals("Tab View", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Range range0 = new Range(172, 172);
      Location location0 = new Location(range0);
      QualifierVector qualifierVector0 = new QualifierVector();
      Key key0 = new Key("v@l\"");
      GFFStreamFeature gFFStreamFeature0 = new GFFStreamFeature(key0, location0, qualifierVector0);
      // Undeclared exception!
      try { 
        ArtemisUtils.getAnalysisFeature("v@l\"", "|QU12f0A%t}_", gFFStreamFeature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("uk.ac.sanger.artemis.chado.ArtemisUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      JPasswordField jPasswordField0 = new JPasswordField(172);
      DatabaseDocument databaseDocument0 = new DatabaseDocument("3Na&[", jPasswordField0);
      String string0 = ArtemisUtils.getCurrentSchema();
      assertEquals("3Na&[", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArtemisUtils artemisUtils0 = new ArtemisUtils();
  }
}
