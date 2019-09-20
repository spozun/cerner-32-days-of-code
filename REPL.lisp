; cerner_2^5_2019

; LISP REPL'er in one line ([R]ead [E]val [P]rint [L]oop)
; Will process any LISP code as input.

(loop (print (eval (read))))

; sample input:
; (defun foo (a b) (+ a b))
; (foo 3 4)

; sample output:
; FOO
; 7
