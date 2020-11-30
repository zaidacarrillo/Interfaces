using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Mahhong
{
    class HallofFameViewModel
    {
       public static List<Jugador> ListadoJugadores { get; set; }
        public HallofFameViewModel()
        {
            if (ListadoJugadores == null)
            {
                ListadoJugadores = new List<Jugador>();
                Resetearpuntuaciones();
            }
        }

        
       

        public static void Resetearpuntuaciones()
        {
            ListadoJugadores.Clear();
            ListadoJugadores.Add(new Jugador(1, "Carlos", 3.88));
            ListadoJugadores.Add(new Jugador(2, "Jerry", 5.01));
            ListadoJugadores.Add(new Jugador(3, "Juan", 6.01));
            ListadoJugadores.Add(new Jugador(4, "Carla", 8.09));
            ListadoJugadores.Add(new Jugador(5, "María", 10.00));
           

        }
    }
}
