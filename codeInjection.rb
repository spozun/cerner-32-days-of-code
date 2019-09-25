# cerner_2^5_2019

class Person
  def initialize(name)
   @name = name
  end

  def to_s
     "Person: #@name"
  end

  def injectCode(c)
      yield(@name)
      eval(c)
  end

  private
  def privFunc
    puts "Called private func!"
  end
end

puts "Enter name:"
$n = STDIN.gets

p = Person.new($n)
p.injectCode("privFunc") do |name|
    puts "Hello, #{name}"
end

print p  #to_s