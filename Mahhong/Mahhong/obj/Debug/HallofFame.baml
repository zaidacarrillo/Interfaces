   M S B A M L   `   `   `  ����B  >Mahhong, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null!clr-namespace:MahhongMahhong  5   	       Mahhong.HallofFame   5   	   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   @d2http://schemas.microsoft.com/expression/blend/2008     5   	   Jmc;http://schemas.openxmlformats.org/markup-compatibility/2006     5   	   'localclr-namespace:Mahhong     5   	     � Title$  
HallofFame��5   	   $��616.071��6   $��690.179��6-    � Icon$ mahjongicono.png��6=    � 
ResizeMode$ NoResize=�6U   .��5	      �  � RowDefinitions 5
   
   �� 5      $
��522* �6   �� 5      $	��65* �6   .+�5   
   &   System.Windows.Controls.DataGrid  -   5          Name$ dataGrid��5         AutoGenerateColumns .  ��6%   �� *ListadoJugadores+   Columns 5      0  *System.Windows.Controls.DataGridTextColumn  5      ,  &System.Windows.Controls.DataGridColumn   Header$ posicion��6%      
IsReadOnly . 1  +System.Windows.Controls.DataGridBoundColumn	   Binding	 67   �� *
posicion+6T     5      $ nombre��6%   	 65   �� *nombre+  5      $ tiempo��6%    . 	 65   �� *tiempo+6P   5      �� 5   
   -   5        $,��&Resetear puntuaciones                 ��5      $
��Left=�5      $��
375,33,0,0q�6.   $��1��6B   $	��Top=�6O   $	��125��6g   $��20��6�   �� 5   
   $��Cerrar��6   $
��Left=�6"   $��
552,33,0,0q�6=   $��1��6Q   $	��Top=�6^   $��90��6v   $��20��6�   
 �� IsCancel
 .  �� 	IsDefault . 6�   5      5      