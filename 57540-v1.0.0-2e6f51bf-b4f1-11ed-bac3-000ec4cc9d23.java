/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE681_Incorrect_Conversion_between_Numeric_Types__floatNaN2int_09.java
Label Definition File: CWE681_Incorrect_Conversion_between_Numeric_Types.label.xml
Template File: point-flaw-09.tmpl.java
*/
/*
* @description
* CWE: 681 Incorrect Conversion between Numeric Types
* Sinks: floatNaN2int
*    GoodSink: check for negative sqrt
*    BadSink : sqrt to unchecked value
* Flow Variant: 09 Control flow: if(IO.static_final_t) and if(IO.static_final_f)
*
* */

package testcases.CWE681_Incorrect_Conversion_between_Numeric_Types;

import testcasesupport.*;

import javax.servlet.http.*;
import java.io.*;

public class CWE681_Incorrect_Conversion_between_Numeric_Types__floatNaN2int_09 extends AbstractTestCase
{

    public void bad() throws Throwable
    {
        if (IO.static_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /*  * Enter: -2.0, result should be 0 (for bad case)
                 *
                 * Square root of a negative number is NaN. NaN when casted to int is 0.
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number (-2.0): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (int)(Math.sqrt(num)));
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;

            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number: ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check for sign */
                if( num < 0 )
                {
                    IO.writeLine("0");
                }
                else
                {
                    IO.writeLine("" + (int)(Math.sqrt(num)));
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }
    }

    /* good1() changes IO.static_final_t to IO.static_final_f */
    private void good1() throws Throwable
    {
        if(IO.static_final_f)
        {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                /*  * Enter: -2.0, result should be 0 (for bad case)
                 *
                 * Square root of a negative number is NaN. NaN when casted to int is 0.
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number (-2.0): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (int)(Math.sqrt(num)));
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;

            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number: ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FIX: check for sign */
                if( num < 0 )
                {
                    IO.writeLine("0");
                }
                else
                {
                    IO.writeLine("" + (int)(Math.sqrt(num)));
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }
    }

    /* good2() reverses the bodies in the if statement */
    private void good2() throws Throwable
    {
        if(IO.static_final_t)
        {
            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");
            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;
            try
            {
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number: ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }
                /* FIX: check for sign */
                if( num < 0 )
                {
                    IO.writeLine("0");
                }
                else
                {
                    IO.writeLine("" + (int)(Math.sqrt(num)));
                }
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }
        }
        else {
            /* INCIDENTAL: CWE 561 Dead Code, the code below will never run */

            java.util.logging.Logger log2 = java.util.logging.Logger.getLogger("local-logger");

            BufferedReader bufread2 = null;
            InputStreamReader inread2 = null;
            boolean errored = false;

            try
            {
                /*  * Enter: -2.0, result should be 0 (for bad case)
                 *
                 * Square root of a negative number is NaN. NaN when casted to int is 0.
                 */
                inread2 = new InputStreamReader(System.in);
                bufread2 = new BufferedReader(inread2);
                System.out.print("Enter float number (-2.0): ");
                double num = 0;
                try
                {
                    num = Float.parseFloat(bufread2.readLine());
                }
                catch(Exception e)
                {
                    IO.writeLine("Error parsing number");
                    errored = true;
                }

                /* FLAW: should not cast without checking if conversion is safe */
                IO.writeLine("" + (int)(Math.sqrt(num)));
            }
            catch( Exception e )
            {
                log2.warning("Error!");
            }
            finally
            {
                try
                {
                    if( bufread2 != null )
                    {
                        bufread2.close();
                    }
                }
                catch( IOException e )
                {
                    log2.warning("Error closing bufread2");
                }
                finally
                {
                    try
                    {
                        if( inread2 != null )
                        {
                            inread2.close();
                        }
                    }
                    catch( IOException e )
                    {
                        log2.warning("Error closing inread2");
                    }
                }

                if( errored )
                {
                    log2.warning("Error parsing number");
                }
            }

        }

    }

    public void good() throws Throwable
    {
        good1();
        good2();
    }

    /* Below is the main(). It is only used when building this testcase on
       its own for testing or for building a binary to use in testing binary
       analysis tools. It is not used when compiling all the testcases as one
       application, which is how source code analysis tools are tested. */
    public static void main(String[] args) throws ClassNotFoundException,
           InstantiationException, IllegalAccessException
    {
        mainFromParent(args);
    }
}
