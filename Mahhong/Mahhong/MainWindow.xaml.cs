using Microsoft.Win32;
using System.Windows;


namespace Mahhong
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void MenuItem_Click(object sender, RoutedEventArgs e)
        {

            this.Close();

        }

        private void Window_Closing(object sender, System.ComponentModel.CancelEventArgs e)
        {
            // e.Cancel = true;
            MessageBoxResult resultadoDialogo;

            resultadoDialogo = MessageBox.Show("¿Está seguro que desea salir?", "Confirmación",
                                     MessageBoxButton.YesNo, MessageBoxImage.Warning);
            switch (resultadoDialogo)
            {
                case MessageBoxResult.Yes:
                    MessageBox.Show("OK! Adiós, hasta la próxima.", "Mahjong");

                    break;
                case MessageBoxResult.No:
                    e.Cancel = true;
                    break;
                default:
                    break;
            }
        }

        /*   private void Configurar(object sender, RoutedEventArgs e)
           {
               dialogoConfiguracion dg = new dialogoConfiguracion();
               dg.ShowDialog();
               //System.Threading.Thread.Sleep(500);
               //tiempo de espera de medio segundo antes de hacer .close() y cerrarse
           }*/

        private void MenuItem_Click_1(object sender, RoutedEventArgs e)
        {
            dialogoConfiguracion dg = new dialogoConfiguracion();
            dg.ShowDialog();
            //System.Threading.Thread.Sleep(500);
            //tiempo de espera de medio segundo antes de hacer .close() y cerrarse
        }

        private void MenuItem_Exportar(object sender, RoutedEventArgs e)
        {
            FileDialog fd = new OpenFileDialog();
            fd.ShowDialog();
        }

        private void MenuItem_HallofFame(object sender, RoutedEventArgs e)
        {
            HallofFame hf = new HallofFame();
            hf.ShowDialog();
        }
    }
}
