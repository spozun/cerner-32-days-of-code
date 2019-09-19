// cerner_2^5_2019
package main
import (
  "fmt"
  "time"
)

func thread1(c chan<- string) {
  for {
    time.Sleep(time.Second * 1)
    c <- "*        *"
  }
}

func thread2(c chan<- string) {
  for {
    time.Sleep(time.Second * 3)
    c <- "**********"
  }
}

func main() {
  var ch chan string = make(chan string)
  go thread1( ch )
  go thread2( ch )
  //thread 3, the listener:
  go func() {
    for {
      fmt.Println(<- ch)
    }
  }()
  var input string
  fmt.Scanln(&input) //freeze main thread, until user hits ENTER
}
