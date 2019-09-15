#cerner_2^5_2019

import threading
import time

def f(secs):
    print("Thread starting...")
    i = 1;
    while i <= secs:
        time.sleep(1);
        print(i);
        i += 1;
    print("Thread done")

if __name__ == "__main__":
    dur = int(input("Enter thread duration (secs): "))

    x = threading.Thread(target=f, args=(dur,))
    x.start()