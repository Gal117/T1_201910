package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico <T>implements IArregloDinamico<T> {
		/**
		 * Capacidad maxima del arreglo
		 */
        private int tamanoMax;
		/**
		 * Numero de elementos en el arreglo (de forma compacta desde la posicion 0)
		 */
        private int tamanoAct;
        /**
         * Arreglo de elementos de tamaNo maximo
         */
        private T elementos[ ];

        /**
         * Construir un arreglo con la capacidad maxima inicial.
         * @param max Capacidad maxima inicial
         */
		public ArregloDinamico( int max )
        {
               elementos = (T[]) new Comparable [max];
               tamanoMax = max;
               tamanoAct = 0;
        }
		public int darTamano() {
			// TODO implementar
			return tamanoAct;
		}

		public T darElemento(int i) {
			// TODO implementar
			T e=null;
			for(int f=0;f<elementos.length;f++)
			{
				if(f==i)
				{
					e=elementos[f];
				}
			}
			return e;
		}

		@Override
		public void agregar(T dato) {
			// TODO Auto-generated method stub
			if ( tamanoAct == tamanoMax )
            {  // caso de arreglo lleno (aumentar tamaNo)
                 tamanoMax = 2 * tamanoMax;
                 T [ ] copia = elementos;
                 elementos = (T[])new Object[tamanoMax];
                 for ( int i = 0; i < tamanoAct; i++)
                 {
                  	 elementos[i] = copia[i];
                 } 
         	    System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
            }	
            elementos[tamanoAct] = dato;
            tamanoAct++;
		}
		@Override
		public T buscar(T dato) {
			// TODO Auto-generated method stub
			// TODO implementar
			T e=null;
			for(int i=0;i<tamanoAct;i++)
			{
				if(elementos[i].equals(dato) == true)
				{
					e=elementos[i];
				}
			}
			return e;
		}
		@Override
		public T eliminar(T dato) {
			// TODO Auto-generated method stub
			// TODO implementar
			T e=null;
			for(int i=0;i<tamanoAct;i++)
			{
				if(elementos[i].equals(dato) == true)
				{
					e=elementos[i];
					elementos[i]=null;
					tamanoAct--;
				}
			}
			
			return e;
		}
}
