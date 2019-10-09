// cerner_2^5_2019
using System;

class MainApp
{
  static void Main()
  {
    Proxy proxy = new Proxy();
    proxy.Request();
    proxy.Request();
    proxy.Request();
  }
}

class MyObj
{
  public void Request()
  {
    Console.WriteLine("Request received!");
  }
}

class Proxy
{
  private MyObj mo;

  public void Request()
  {
    if(mo == null){mo = new MyObj();}
    mo.Request();
  }
}