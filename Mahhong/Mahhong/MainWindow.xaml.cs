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

            resultadoDialogo = MessageBox.Show("¿Está seguro que desea eliminar el registro seleccionado ?","Confirmación",
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

        private void Configurar(object sender, RoutedEventArgs e)
        {

        }
    }
}
