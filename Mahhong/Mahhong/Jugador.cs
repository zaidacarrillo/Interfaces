using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mahhong
{
   public class Jugador
    {
        public int posicion { get; set; }
        public string nombre { get; set; }
        public double  tiempo { get; set; }

        public Jugador(int posicion, string nombre, double tiempo)
        {
            this.posicion = posicion;
            this.nombre = nombre;
            this.tiempo = tiempo;
            
        }

    }
}
