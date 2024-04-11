# Enunciado 2: Panel de Control de Medios
## Objetivo: Crear una interfaz para un panel de control de medios
(reproductor de música o vídeo) utilizando `BoxLayout` para organizar los
controles de reproducción (play, pause, stop), `GridLayout` para un teclado
numérico de selección rápida de pistas, y `BorderLayout` para disponer los
distintos paneles de control.
Requisitos:
1. Panel de Controles de Reproducción: Usa un `JPanel` con `BoxLayout`
   para alinear horizontalmente los botones de play, pause, y stop.

2. Teclado Numérico de Selección Rápida: Implementa un `JPanel` con
   `GridLayout` para simular un teclado numérico que permita seleccionar
   rápidamente las pistas.
3. Diseño General con BorderLayout: Organiza los paneles anteriores en la
   ventana principal usando `BorderLayout`, colocando el panel de controles
   de reproducción en el sur (`SOUTH`) y el teclado numérico en el centro
   (`CENTER`).
4. Barra de Progreso: Añade una barra de progreso (`JProgressBar`) en la
   parte norte (`NORTH`) para indicar el progreso de la pista actual