package org.omg.PortableServer.POAPackage;


/**
* org/omg/PortableServer/POAPackage/WrongPolicyHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/jenkins/workspace/8-2-build-windows-amd64-cygwin/jdk8u261/295/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Thursday, June 18, 2020 6:58:21 AM UTC
*/

abstract public class WrongPolicyHelper
{
  private static String  _id = "IDL:omg.org/PortableServer/POA/WrongPolicy:1.0";

  public static void insert (org.omg.CORBA.Any a, WrongPolicy that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static WrongPolicy extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [0];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          __typeCode = org.omg.CORBA.ORB.init ().create_exception_tc (WrongPolicyHelper.id (), "WrongPolicy", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static WrongPolicy read (org.omg.CORBA.portable.InputStream istream)
  {
    WrongPolicy value = new WrongPolicy ();
    // read and discard the repository ID
    istream.read_string ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, WrongPolicy value)
  {
    // write the repository ID
    ostream.write_string (id ());
  }

}
