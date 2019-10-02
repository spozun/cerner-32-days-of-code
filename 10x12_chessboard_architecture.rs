// cerner_2^5_2019 
fn main() {
  let mut _grid: [[u8; 8]; 8] = [[0; 8]; 8];  //2D array, all 0s
  let mut z = 20;
  //Init the "10x12" chessboard architecture
  //[[21,22,23,24,25,26,27,28],
  // [31,32,33,34,35,36,37,38],
  // [41,42,43,44,45,46,47,48],
  // [51,52,53,54,55,56,57,58],
  // [61,62,63,64,65,66,67,68],
  // [71,72,73,74,75,76,77,78],
  // [81,82,83,84,85,86,87,88],
  // [91,92,93,94,95,96,97,98]]
    for x in 0..8 {
    for y in 0..8 {
      _grid[x][y] = y as u8 + 1 + z;
    }
    z+= 10;
  }
  find_valid_bishop_moves(85, _grid);
  //outputs 74, 63, 52, 41
}
fn is_valid_space(_num: u8, _grid: [[u8; 8]; 8]) -> bool{
  for x in 0..8 {
    for y in 0..8 {
      if  _grid[x][y] == _num  { return true };
    }
  }
  return false;
}
fn find_valid_bishop_moves(mut _location: u8, _grid: [[u8; 8]; 8]){
  let _start_loc = _location;
  loop{
    _location -= 11;
    if is_valid_space(_location, _grid) {
      println!("{}",_location);
    }
    else {
      break;
    }
  }
  //NOT ENOUGH ROOM!  But need to code the other 3 directions here for the bishop!
  //Those 3 directions loop on -9, +9, +11 from the original location
  //The 10x12 grid layout is designed for that math to easily work and not wrap around
}