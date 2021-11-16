public class Funciones {

    public boolean esPrimo(int x){//Devuelve true si el numero es primo y false en caso de que el numero no sea primo.
        if(x <= 1 || x == 4){//Los numeros primos por definicion son naturales.
            return false;
        }
        for(int i = 2; i < x / 2; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public boolean numeroEsCapicua(int x){//Devuelve true si un numero es capicua (Ej: 101, 2442, etc)
        int cifra,inverso = 0,aux;
        aux = x;

        while(x!=0)
        {
            cifra = x%10;
            inverso = inverso*10 + cifra;
            x= x/10;
        }

        if(inverso == aux)
            return true;
        else{
            return false;
        }
    }


    public int factorial (int x) {//Devuelve el factorial de x.
        if (x == 0)
            return 1;
        else
            return x * factorial(x-1);
    }

}
