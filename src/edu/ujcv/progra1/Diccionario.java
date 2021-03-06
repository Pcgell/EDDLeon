package edu.ujcv.progra1;

// un diccionario o arreglo asociativo


// Diccionario, Arreglo associativo, tabla Hash, Hash Map


// aggregar(objeto (String), objeto),obtener(objeto)


// carro - marca : alhpa romeo, motor : boxter 1.7, año: 1997, Modelo: 277
// agreragar("alpha 277", carro);
//   carro = obtener("alpha 277");



//implementacion

// con un arreglo.
// con arreglo de listas enlazadas.


// Metodo hash  convierte cualquier objeto => numero
// evita colisiones. "objeto 1" => 32
// 32 => "objeto 1" utiles para otros campos como la encriptacion.
// rapidos


// [                                      carro 1          ]



public class Diccionario {

    private Object[] objects;

    private final int sizeofArray = 3000;



    public Diccionario(){
        objects = new Object[sizeofArray];
    }


    public void Put(String key,Object value){

        int index = Math.abs(key.hashCode()) % sizeofArray;

        objects[index] = value;

    }

    public Object get(String key){
        return objects[Math.abs(key.hashCode())%sizeofArray];
    }

}
