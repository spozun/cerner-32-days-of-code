-- cerner_2^5_2019

import Data.List
import Data.Char

main =  do
  print "Type some text:"
  txt <- getLine

  -- strings are treated as lists of characters
  print "Sorted String: "
  let srtd = sort txt
  print srtd

  print "Capitalized Text: "
  let uppr = map toUpper txt
  print uppr

  print "Shifted Text: "
  let ords = map ord txt
  let shftOrds = map (+ 1) ords
  let shft = map chr shftOrds
  print shft

  print "Capital Letters Found: "
  let tt = filter (`elem` ['A'..'Z']) txt
  print tt