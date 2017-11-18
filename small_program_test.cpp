#include <iostream>
using namespace std;

int main(){
  int n;
  cout << "Input the upper bound for the fizz buzz" << endl;
  cin >> n;

  for(int i = 1; i <= n; i++){
    if(i % 3 ==0 && i % 5 == 0){
      cout << "FizzBuzz" << endl;
    }
    else if(i % 3 == 0){
      cout << "Fizz" << endl;
    }
    else if(i % 5 ==0){
      cout << "Buzz" << endl;
    }
    else{
      cout << i << endl;
    }
  }

  cout << "Done!" << endl;
  return 0;
}
