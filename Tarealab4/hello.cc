// Simple Hello World
 
#include <iostream>

int sumaArreglo(int N, int arreglo[]){
    int suma=0;
    for(int i=0; i<N; i++){
        int sumar = arreglo[i];
        suma+=sumar;
    }   
    return suma;
}

int sumaPares(int N, int arreglo[]){
    int sumapares = 0;
    for(int i=0; i<N; i++){
        if(i%2==0){
            sumapares+=arreglo[i];
        }
	}
	return sumapares;
}


int sumaImpares(int N, int arreglo[]){
    int sumaimpares = 0;
    int sumapares=0;
    for(int i=0; i<N; i++){
        if(i%2==0){
            sumapares+=arreglo[i];
        }else{
            sumaimpares+=arreglo[i];
        }
	}
	return sumaimpares;
}



int main()
{
  std::cout << "Tarea Lab 4" << std::endl;
  
  std::cout << "Ingrese el tamaño para el arreglo" << std::endl;
  int N;
  std::cin >> N;
  
  int arreglo [N];
  int n;
  
  for(int i=0; i<N; i++){
      std::cout << "Ingrese un valor: " << std::endl;;
      std::cin >> n;
      arreglo[i] = n;
  }
  
  std::cout << "Los numeros que ingreso fueron: " << std::endl; 
  
  for(int i=0; i<N; i++){
      std::cout << arreglo[i] << " , ";
  }
  std::cout << "." << std::endl; 
  //int r1=sumaArreglo(arreglo, N);
  //std::cout << "Suma del Arreglo: " << r1 << std::endl;
  
  int resultado = sumaArreglo(N, arreglo);
  std::cout << "Suma del Arreglo: " << resultado << std::endl;
  
  std::cout << "Longitud del Arreglo: " << N << std::endl;
  
  int result2 = sumaPares(N, arreglo);
  std::cout << "Suma de posiciones pares: " << result2 << std::endl;
  
  int result3 = sumaImpares(N, arreglo);
  std::cout << "Suma de posiciones impares: " << result3 << std::endl;
  
  std::cout << "Orden de forma ascendente: " << std::endl;
  for(int i=0; i<N; i++){
      for(int j=(i+1); j<(N-1); j++){
          if(arreglo[i]<arreglo[j]){
              int aux = arreglo[i];
              arreglo[i]=arreglo[j];
              arreglo[j]=aux;
          }
      }
      std::cout << arreglo[i] << " , ";
  }

  return 0;
  
}