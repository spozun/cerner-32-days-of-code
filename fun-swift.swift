// cerner_2^5_2019 

class A{
  var b : B?
  init(bb: B){
    self.b = bb
  }
}
class B{
  var c : C?
}
class C{
  var d : D?
}
class D{
  static var e = (("e", 55, B()), (5, C(), 555))
}

let a = A(bb:B())
//Optional chaining is amazing.  Javascript might get this soon!  We need it!
print(a.b?.c?.d as Any)  //nil
//Swift Tuples are super fun too!
print(D.e.1.2)  //555