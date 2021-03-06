/*
 * This file was automatically generated by EvoSuite
 * Thu Sep 20 14:37:38 GMT 2018
 */

package uk.ac.sanger.artemis.components;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import uk.ac.sanger.artemis.components.InputStreamProgressDialog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class InputStreamProgressDialog_ESTest extends InputStreamProgressDialog_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      doReturn((GraphicsConfiguration) null).when(jFrame0).getGraphicsConfiguration();
      InputStreamProgressDialog inputStreamProgressDialog0 = null;
      try {
        inputStreamProgressDialog0 = new InputStreamProgressDialog(jFrame0, "", "", true);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      JFrame jFrame0 = mock(JFrame.class, new ViolatedAssumptionAnswer());
      doReturn((GraphicsConfiguration) null).when(jFrame0).getGraphicsConfiguration();
      InputStreamProgressDialog inputStreamProgressDialog0 = null;
      try {
        inputStreamProgressDialog0 = new InputStreamProgressDialog(jFrame0, "3mg");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }
}
