// Simple Hello World
 
#include <iostream>

//Metodos de multiplicacion, division, resta y suma por valor 
int sumar(int a, int b){
    return (a+b);
}

int restar(int a, int b){
    return (a-b);
}

int multiplicar(int a, int b){
    return (a*b);
}

int dividir(int a, int b){
    return (a/b);
}

//Prototipos de los metodos para poder colocarlos en cualquier parte
void sumapunteros(int,int,int*); 
void restapunteros(int,int,int*);
void multpunteros(int,int,int*);
void divpunteros(int,int,int*);

int main()
{
    int r1 = sumar(5,7);
    int r2 = restar(10,5);
    int r3 = multiplicar(5,5);
    int r4 = dividir(10,2);
    
    int resultado = -1; //NO importa el valor
    int re2 = 4;
    int re3 = 5;
    int re4 = 6;
    sumapunteros(5,7,&resultado);
    restapunteros(10,5,&re2);
    multpunteros(5,5,&re3);
    divpunteros(10,2,&re4);
    
    std::cout << "Hello World! :)" << std::endl;
    std::cout << "Suma: " << r1 << std::endl;
    std::cout << "Resta: " << r2 << std::endl;
    std::cout << "Multiplicacion: " << r3 << std::endl;
    std::cout << "Division: " <<r4 << std::endl;
    std::cout << "Suma por punteros: " << resultado << std::endl;
    std::cout << "Resta por punteros: " << re2 << std::endl;
    std::cout << "Multiplicacion por punteros: " << re3 << std::endl;
    std::cout << "Division por punteros: " << re4 << std::endl;
    return 0;
}

// Metodos de suma, resta,multiplicacion y division por referencia
void sumapunteros(int a, int b, int* panchito){
    *panchito = a+b;
}

void restapunteros(int a, int b, int* result){
    *result = a-b;
}

void multpunteros(int a, int b, int* result){
    *result = a*b;
}

void divpunteros(int a, int b, int* result){
    *result = a/b;
}

