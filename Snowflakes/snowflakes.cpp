#include <iostream>
using namespace std;
#include <chrono>
#include <thread>
#include<stdlib.h>

int main (){
  int n, k, m;
  for (int p = 0; 1 < 5; p++){
    n = rand() % 30;
    m = rand () % 100;
    k = n % 2;
    if (k == 1){
      for (int s = 0; s + n < 44; s++){
        for (int i = 0; i < n; i++){
          for (int d = 0; d < m; d++){
                cout << " ";
          }
          for (int j = 0; j < n; j++){
            if (i == n / 2 || j == n / 2){
              cout << "* ";
            } else if (i == j && j != 0 && j != n - 1){
              cout << "* ";
            } else if (i + j == n - 1 && j != 0 && j != n - 1){
              cout << "* ";
            } else {
              cout << "  ";
            }
          }
          cout << endl;
        }
        this_thread::sleep_for(chrono::milliseconds {400});
        system("clear");
        for(int r = 0; r < s; r++){
          cout << endl;
        }
      }

      for (int s = 1; s < n; s++){
        for(int r = 0; r < 43 - n; r++){
          cout << endl;
        }
        for (int i = 0; i < n - s; i++){
          for (int d = 0; d < m; d++){
                cout << " ";
          }
          for (int j = 0; j < n; j++){
            if (i == n / 2 || j == n / 2){
              cout << "* ";
            } else if (i == j && j != 0 && j != n - 1){
              cout << "* ";
            } else if (i + j == n - 1 && j != 0 && j != n - 1){
              cout << "* ";
            } else {
              cout << "  ";
            }
          }
          cout << endl;
        }
        this_thread::sleep_for(chrono::milliseconds {400});
        system("clear");
        for(int r = 0; r < s; r++){
          cout << endl;
        }
      }

    }
    this_thread::sleep_for(chrono::milliseconds {600});
    system("clear"); 
  }
}
