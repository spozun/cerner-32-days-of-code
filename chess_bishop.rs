// cerner_2^5_2019 

pub fn find_valid_bishop_moves(mut _location: u8, _grid: [[u8; 8]; 8]){
  let _start_loc = _location;
  loop{
    _location -= 11;
    if is_valid_space(_location, _grid) { println!("{}",_location); }
    else { break; }}
  _location = _start_loc;
  loop{
    _location += 11;
    if is_valid_space(_location, _grid) { println!("{}",_location); }
    else { break; }}
  _location = _start_loc;
  loop{
    _location -= 9;
    if is_valid_space(_location, _grid) { println!("{}",_location); }
    else { break; }}
  _location = _start_loc;
  loop{
    _location += 9;
    if is_valid_space(_location, _grid) { println!("{}",_location); }
    else { break; }}
}
fn is_valid_space(_num: u8, _grid: [[u8; 8]; 8]) -> bool{
  for x in 0..8 {
    for y in 0..8 {
      if  _grid[x][y] == _num  { return true };
    }
  }
  return false;
}