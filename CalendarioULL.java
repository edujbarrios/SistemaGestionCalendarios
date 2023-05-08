import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

		// Para acceder al sistema, se usan las siguientes credenciales preestablecidas en el login a modo de prueba
public class CalendarioULL extends JFrame {
    private String usuario = "ULL";
    private String contrasena = "Admin";
    private ArrayList<Horario> horarios = new ArrayList<>();

    public CalendarioULL() {
        // Configuración de la ventana principal
        setTitle("BIENVENIDO/A AL SISTEMA DE GENERACIÓN DE CALENDARIOS DE LA ULL");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	// Desactivar la capacidad de redimensionamiento
        // this.setResizable(false);
	    
        // Creación de los componentes
        JLabel usuarioLabel = new JLabel("Usuario:");
        JTextField usuarioTextField = new JTextField();
        JLabel contrasenaLabel = new JLabel("Contraseña:");
        JPasswordField contrasenaPasswordField = new JPasswordField();
        JButton ingresarButton = new JButton("Ingresar");

        // Configuración del layout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(usuarioLabel)
                                .addComponent(usuarioTextField))
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(contrasenaLabel)
                                .addComponent(contrasenaPasswordField))
                        .addComponent(ingresarButton)
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup()
                                .addComponent(usuarioLabel)
                                .addComponent(usuarioTextField))
                        .addGroup(layout.createParallelGroup()
                                .addComponent(contrasenaLabel)
                                .addComponent(contrasenaPasswordField))
                        .addComponent(ingresarButton)
        );

        // Agregamos el panel a la ventana
        add(panel);

        // Mostramos la ventana
        setVisible(true);

        // Acción del botón ingresar
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuarioIngresado = usuarioTextField.getText();
                String contrasenaIngresada = new String(contrasenaPasswordField.getPassword());

                if (usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena)) {
                    // Cerramos la ventana principal
                    dispose();

                    // Mostramos el menú
                    mostrarMenu();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                }
            }
        });
    }

    private void mostrarMenu() {
        // Configuración de la ventana del menú
        setTitle("Menú");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Creación de los componentes
        JLabel menuLabel = new JLabel("Seleccione una opción:");
        JButton generarCalendarioButton = new JButton("Generar un nuevo calendario");
        JButton enviarAlumnosButton = new JButton("Enviar el calendario a alumnos");
        JButton enviarProfesoresButton = new JButton("Enviar el calendario a profesores");
        JButton verHorariosButton = new JButton("Ver horarios generados");
        JButton salirButton = new JButton("Salir");

        // Configuración del layout
        JPanel panel = new JPanel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(
                layout.createParallelGroup()
                        .addComponent(menuLabel)
                        .addComponent(generarCalendarioButton)
                        .addComponent(enviarAlumnosButton)
                        .addComponent(enviarProfesoresButton)
                        .addComponent(verHorariosButton)
                        .addComponent(salirButton)
        );
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(menuLabel)
                        .addComponent(generarCalendarioButton)
                        .addComponent(enviarAlumnosButton)
                        .addComponent(enviarProfesoresButton)
                        .addComponent(verHorariosButton)
                        .addComponent(salirButton)
        );

        // Agregamos el panel a la ventana
        add(panel);

        // Mostramos la ventana
        setVisible(true);

        // Acción del botón generarCalendario
        generarCalendarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configuración de la ventana para generar un nuevo calendario
                JFrame ventanaGenerarCalendario = new JFrame();
                ventanaGenerarCalendario.setTitle("Generar un nuevo calendario");
                ventanaGenerarCalendario.setSize(500, 300);
                ventanaGenerarCalendario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Creación de los componentes
                JLabel idLabel = new JLabel("ID del horario:");
                JTextField idTextField = new JTextField();
                JLabel cursoLabel = new JLabel("Número de curso:");
                JTextField cursoTextField = new JTextField();
                JLabel asignaturaLabel = new JLabel("Asignatura:");
                JTextField asignaturaTextField = new JTextField();
                JLabel profesorLabel = new JLabel("Profesor:");
                JTextField profesorTextField = new JTextField();
                JLabel diasLabel = new JLabel("Días a impartir:");
                JTextField diasTextField = new JTextField();
                JLabel horasLabel = new JLabel("Horas en las que se imparte:");
                JTextField horasTextField = new JTextField();
                JButton generarButton = new JButton("Generar");

                // Configuración del layout
                JPanel panel = new JPanel();
                GroupLayout layout = new GroupLayout(panel);
                panel.setLayout(layout);
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);
                layout.setHorizontalGroup(
                        layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(idLabel)
                                        .addComponent(idTextField))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(cursoLabel)
                                        .addComponent(cursoTextField))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(asignaturaLabel)
                                        .addComponent(asignaturaTextField))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(profesorLabel)
                                        .addComponent(profesorTextField))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(diasLabel)
                                        .addComponent(diasTextField))
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(horasLabel)
                                        .addComponent(horasTextField))
                                .addComponent(generarButton)
                );
                layout.setVerticalGroup(
                        layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(idLabel)
                                        .addComponent(idTextField))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(cursoLabel)
                                        .addComponent(cursoTextField))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(asignaturaLabel)
                                        .addComponent(asignaturaTextField))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(profesorLabel)
                                        .addComponent(profesorTextField))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(diasLabel)
                                        .addComponent(diasTextField))
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(horasLabel)
                                        .addComponent(horasTextField))
                                .addComponent(generarButton)
                );

                // Agregamos el panel a la ventana
                ventanaGenerarCalendario.add(panel);

                // Mostramos la ventana
                ventanaGenerarCalendario.setVisible(true);

                // Acción del botón generar
                generarButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String id = idTextField.getText();
                        String curso = cursoTextField.getText();
                        String asignatura = asignaturaTextField.getText();
                        String profesor = profesorTextField.getText();
                        String dias = diasTextField.getText();
                        String horas = horasTextField.getText();

                        Horario horario = new Horario(id, curso, asignatura, profesor, dias, horas);
                        horarios.add(horario);

                        JOptionPane.showMessageDialog(null, "Calendario generado correctamente");

                        // Cerramos la ventana de generar calendario
                        ventanaGenerarCalendario.dispose();
                    }
                });
            }
        });

        // Acción del botón enviarAlumnos
        enviarAlumnosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configuración de la ventana para enviar el calendario a alumnos
                JFrame ventanaEnviarCalendarioAlumnos = new JFrame();
                ventanaEnviarCalendarioAlumnos.setTitle("Enviar el calendario a alumnos");
                ventanaEnviarCalendarioAlumnos.setSize(500, 300);
                ventanaEnviarCalendarioAlumnos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Creación de los componentes
                JLabel seleccionarHorarioLabel = new JLabel("Seleccione el horario a enviar:");
                JTable horariosTable = new JTable();
                JScrollPane scrollPane = new JScrollPane(horariosTable);
                JButton mostrarIdsButton = new JButton("Mostrar IDs");
                JButton terminadoButton = new JButton("Terminado");

                // Configuración del layout
                JPanel panel = new JPanel();
                GroupLayout layout = new GroupLayout(panel);
                panel.setLayout(layout);
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);
                layout.setHorizontalGroup(
                        layout.createParallelGroup()
                                .addComponent(seleccionarHorarioLabel)
                                .addComponent(scrollPane)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(mostrarIdsButton)
                                        .addComponent(terminadoButton))
                );
                layout.setVerticalGroup(
                        layout.createSequentialGroup()
                                .addComponent(seleccionarHorarioLabel)
                                .addComponent(scrollPane)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(mostrarIdsButton)
                                        .addComponent(terminadoButton))
                );

                // Agregamos el panel a la ventana
                ventanaEnviarCalendarioAlumnos.add(panel);

                // Mostramos la ventana
                ventanaEnviarCalendarioAlumnos.setVisible(true);

                // Acción del botón mostrarIds
                mostrarIdsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (horarios.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No hay IDs de calendarios realizados todavía, por favor vuelva al menú anterior y genere uno");
                        } else {
                            DefaultTableModel model = new DefaultTableModel();
                            model.addColumn("ID");
                            model.addColumn("Curso");
                            model.addColumn("Asignatura");
                            model.addColumn("Profesor");
                            model.addColumn("Días");
                            model.addColumn("Horas");

                            for (Horario horario : horarios) {
                                Object[] row = new Object[6];
                                row[0] = horario.getId();
                                row[1] = horario.getCurso();
                                row[2] = horario.getAsignatura();
                                row[3] = horario.getProfesor();
                                row[4] = horario.getDias();
                                row[5] = horario.getHoras();
                                model.addRow(row);
                            }

                            horariosTable.setModel(model);
                        }
                    }
                });

                // Acción del botón terminado
                terminadoButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String listaUsuarios = JOptionPane.showInputDialog(null, "Por favor introduzca la lista de usuarios a las que quiere enviar el correo (p. ejemplo: primero.alumnos@ull.es):");
                        String mensaje = "La asignatura (Asignatura) que vas a cursar el próximo año, impartida por (Profesor) la tendrás los (dia/s) de cada semana a la/s (hora), salvo los posibles días festivos";

                        for (int i = 0; i < horariosTable.getRowCount(); i++) {
                            if ((Boolean) horariosTable.getValueAt(i, 0)) {
                                String asignatura = (String) horariosTable.getValueAt(i, 2);
                                String profesor = (String) horariosTable.getValueAt(i, 3);
                                String dias = (String) horariosTable.getValueAt(i, 4);
                                String horas = (String) horariosTable.getValueAt(i, 5);

                                mensaje = mensaje.replace("(Asignatura)", asignatura);
                                mensaje = mensaje.replace("(Profesor)", profesor);
                                mensaje = mensaje.replace("(dia/s)", dias);
                                mensaje = mensaje.replace("(hora)", horas);

                                JOptionPane.showMessageDialog(null, mensaje);
                            }
                        }

                        // Cerramos la ventana de enviar calendario a alumnos
                        ventanaEnviarCalendarioAlumnos.dispose();
                    }
                });
            }
        });

        // Acción del botón enviarProfesores
        enviarProfesoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Configuración de la ventana para enviar el calendario a profesores
                JFrame ventanaEnviarCalendarioProfesores = new JFrame();
                ventanaEnviarCalendarioProfesores.setTitle("Enviar el calendario a profesores");
                ventanaEnviarCalendarioProfesores.setSize(500, 300);
                ventanaEnviarCalendarioProfesores.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                // Creación de los componentes
                JLabel seleccionarHorarioLabel = new JLabel("Seleccione el horario a enviar:");
                JTable horariosTable = new JTable();
                JScrollPane scrollPane = new JScrollPane(horariosTable);
                JButton mostrarIdsButton = new JButton("Mostrar IDs");
                JButton terminadoButton = new JButton("Terminado");

                // Configuración del layout
                JPanel panel = new JPanel();
                GroupLayout layout = new GroupLayout(panel);
                panel.setLayout(layout);
                layout.setAutoCreateGaps(true);
                layout.setAutoCreateContainerGaps(true);
                layout.setHorizontalGroup(
                        layout.createParallelGroup()
                                .addComponent(seleccionarHorarioLabel)
                                .addComponent(scrollPane)
                                .addGroup(layout.createSequentialGroup()
                                        .addComponent(mostrarIdsButton)
                                        .addComponent(terminadoButton))
                );
                layout.setVerticalGroup(
                        layout.createSequentialGroup()
                                .addComponent(seleccionarHorarioLabel)
                                .addComponent(scrollPane)
                                .addGroup(layout.createParallelGroup()
                                        .addComponent(mostrarIdsButton)
                                        .addComponent(terminadoButton))
                );

                // Agregamos el panel a la ventana
                ventanaEnviarCalendarioProfesores.add(panel);

                // Mostramos la ventana
                ventanaEnviarCalendarioProfesores.setVisible(true);

                // Acción del botón mostrarIds
                mostrarIdsButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (horarios.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "No hay IDs de calendarios realizados todavía, por favor vuelva al menú anterior y genere uno");
                        } else {
                            DefaultTableModel model = new DefaultTableModel();
                            model.addColumn("ID");
                            model.addColumn("Curso");
                            model.addColumn("Asignatura");
                            model.addColumn("Profesor");
                            model.addColumn("Días");
                            model.addColumn("Horas");

                            for (Horario horario : horarios) {
                                Object[] row = new Object[6];
                                row[0] = horario.getId();
                                row[1] = horario.getCurso();
                                row[2] = horario.getAsignatura();
                                row[3] = horario.getProfesor();
                                row[4] = horario.getDias();
                                row[5] = horario.getHoras();
                                model.addRow(row);
                            }

                            horariosTable.setModel(model);
                        }
                    }
                });

                // Acción del botón terminado
                terminadoButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String listaUsuarios = JOptionPane.showInputDialog(null, "Por favor introduzca la lista de usuarios a las que quiere enviar el correo (p. ejemplo: primero.profesores@ull.es):");
                        String mensaje = "Hola, (Profesor) usted va a impartir la asignatura (Asignatura) el próximo año, la docencia será (dia/s) de cada semana a la/s (hora), salvo los posibles días festivos. Recuerde que todavía no se han llevado a cabo las convocatorias de venia docendi. Esté atento al correo.";

                        for (int i = 0; i < horariosTable.getRowCount(); i++) {
                            if ((Boolean) horariosTable.getValueAt(i, 0)) {
                                String asignatura = (String) horariosTable.getValueAt(i, 2);
                                String profesor = (String) horariosTable.getValueAt(i, 3);
                                String dias = (String) horariosTable.getValueAt(i, 4);
                                String horas = (String) horariosTable.getValueAt(i, 5);

                                mensaje = mensaje.replace("(Asignatura)", asignatura);
                                mensaje = mensaje.replace("(Profesor)", profesor);
                                mensaje = mensaje.replace("(dia/s)", dias);
                                mensaje = mensaje.replace("(hora)", horas);

                                JOptionPane.showMessageDialog(null, mensaje);
                            }
                        }

                        // Cerramos la ventana de enviar calendario a profesores
                        ventanaEnviarCalendarioProfesores.dispose();
                    }
                });
            }
        });

        // Acción del botón verHorarios
        verHorariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (horarios.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se han generado horarios todavía");
                } else {
                    for (Horario horario : horarios) {
                        System.out.println(horario.toString());
                    }
                }
            }
        });

        // Acción del botón salir
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        CalendarioULL calendarioULL = new CalendarioULL();
    }
}

class Horario {
    private String id;
    private String curso;
    private String asignatura;
    private String profesor;
    private String dias;
    private String horas;

    public Horario(String id, String curso, String asignatura, String profesor, String dias, String horas) {
        this.id = id;
        this.curso = curso;
        this.asignatura = asignatura;
        this.profesor = profesor;
        this.dias = dias;
        this.horas = horas;
    }

    public String getId() {
        return id;
    }

    public String getCurso() {
        return curso;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getProfesor() {
        return profesor;
    }

    public String getDias() {
        return dias;
    }

    public String getHoras() {
        return horas;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Curso: " + curso + ", Asignatura: " + asignatura + ", Profesor: " + profesor + ", Días: " + dias + ", Horas: " + horas;
    }
	}
