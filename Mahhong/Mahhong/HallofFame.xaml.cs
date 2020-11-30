using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Shapes;

namespace Mahhong
{
    /// <summary>
    /// Lógica de interacción para HallofFame.xaml
    /// </summary>
    public partial class HallofFame : Window
    {
        //Sin view model
        //public List<Jugador> ListadoJugadores { get; set; }

        public HallofFame()
        {
            InitializeComponent();
            
            /* ListadoJugadores = new List<Jugador>();
               ListadoJugadores.Add(new Jugador(1, "Carlos", 3.88));
               ListadoJugadores.Add(new Jugador(2, "Jerry", 5.01));
               ListadoJugadores.Add(new Jugador(3, "Juan", 6.01));
               ListadoJugadores.Add(new Jugador(4, "Carla", 8.09));
               ListadoJugadores.Add(new Jugador(5, "María", 10.00));*/
      
          //  List<Jugador> ListadoJugadores = HallofFameViewModel.binding();

            this.DataContext = new HallofFameViewModel();

            
        }

        private void Resetearpuntuaciones(object sender, RoutedEventArgs e)
        {
            HallofFameViewModel.Resetearpuntuaciones();
            dataGrid.Items.Refresh();

        }

    }
}
