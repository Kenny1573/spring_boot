package org.omg.CosNaming;

/**
* org/omg/CosNaming/NamingContextHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u261/295/corba/src/share/classes/org/omg/CosNaming/nameservice.idl
* Thursday, June 18, 2020 6:58:18 AM UTC
*/


/** 
 * A naming context is an object that contains a set of name bindings in 
 * which each name is unique. Different names can be bound to an object 
 * in the same or different contexts at the same time. <p>
 * 
 * See <a href="http://www.omg.org/technology/documents/formal/naming_service.htm">
 * CORBA COS 
 * Naming Specification.</a>
 */
public final class NamingContextHolder implements org.omg.CORBA.portable.Streamable
{
  public NamingContext value = null;

  public NamingContextHolder ()
  {
  }

  public NamingContextHolder (NamingContext initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = NamingContextHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    NamingContextHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return NamingContextHelper.type ();
  }

}
