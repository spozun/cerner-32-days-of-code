# cerner_2^5_2019

util =
  cube : (x) -> x * x * x
  infolog : (msg) -> console.log "INFO:  #{msg}"

cubes = (util.cube num for num in [1..100])
pows_of_2 = (Math.pow 2, i for i in [1..20])

util.infolog "Cubes that are also powers of 2"
util.infolog c for c in cubes when c in pows_of_2