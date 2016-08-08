namespace java com.example.thrift

exception InvalidOperation {
  1: i32 whatOp,
  2: string why
}
 

struct Work {
	
}

service Calculator {

   void ping(),

   i32 add(1:i32 num1, 2:i32 num2),

   i32 calculate(1:i32 logid, 2:Work w) throws (1:InvalidOperation ouch),

}
