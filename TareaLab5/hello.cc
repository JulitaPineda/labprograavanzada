// Simple Hello World
 
#include <iostream>
using namespace std;

/*class Node{
    private:
        string propiedad;
        Node *next;
        
    public:
        Node(string e, Node *n = NULL){
            this -> propiedad = e;
            this -> next = n;
        }
        
        string getPropiedad(){
            return propiedad;
        }
        
        void setPropiedad(string propiedad){
            propiedad = propiedad;
        }
        
        Node getNext(){
            return *next;
        }
        
        void setNext(Node *next){
            *next = *next;
        }
}

*


class Node{
    
    private: 
        string elemento;
        
    public:
        Node *sig;
        Node(string elemento){
            this -> elemento = elemento;
            sig = NULL;
    
        }

    string getElemento(){
        return elemento;
    }    
}

class ListaSimple{
    
    private:
        Node *primero;
        Node *ultimo;
        
    public:
        ListaSimple();
        {
            primer = ultimo = NULL;
        }
    
    bool vacio(){
        return (primero==NULL);
    }
    
    void ingresarInicio (string elemento){
        
        Node *temp = new Node(elemento);
        if(vacio() == true){
            primero = ultimo = temp;
        }else{
            temp -> sig = primero;
            primero = temp;
        }
    }
    
    void ingresarFinal(string elemento){
        Node *temp = new Node(elemento);
        if(vario==true){
            primero = ultimo = temp;
        }else{
            ultimo -> sig = temp;
            ultimo = temp;
        }
    }
    
    
}


int main()
{
  std::cout << "Tarea Laboratorio 5" << std::endl;
  
  
  
  return 0;
  
}