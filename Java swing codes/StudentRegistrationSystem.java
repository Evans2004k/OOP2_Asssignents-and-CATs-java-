import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistrationSystem extends JFrame {

    // ─── Text Fields ───────────────────────────────────────────────────────────
    private JTextField txtStudentID;
    private JTextField txtFullName;
    private JTextField txtCourse;
    private JTextField txtYearOfStudy;

    // ─── ComboBox ──────────────────────────────────────────────────────────────
    private JComboBox<String> cmbDepartment;

    // ─── Radio Buttons ─────────────────────────────────────────────────────────
    private JRadioButton rdoMale;
    private JRadioButton rdoFemale;
    private JRadioButton rdoOther;
    private ButtonGroup genderGroup;

    // ─── CheckBox ──────────────────────────────────────────────────────────────
    private JCheckBox chkHostel;

    // ─── Buttons ───────────────────────────────────────────────────────────────
    private JButton btnRegister;
    private JButton btnClear;

    // ─── Output Area ───────────────────────────────────────────────────────────
    private JTextArea txtOutput;

    // ══════════════════════════════════════════════════════════════════════════
    //  Constructor
    // ══════════════════════════════════════════════════════════════════════════
    public StudentRegistrationSystem() {
        setTitle("Student Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(680, 700);
        setLocationRelativeTo(null);
        setResizable(false);

        initComponents();
        buildLayout();
        attachListeners();
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  1. Initialise all components
    // ══════════════════════════════════════════════════════════════════════════
    private void initComponents() {

        // Text fields
        txtStudentID    = new JTextField(20);
        txtFullName     = new JTextField(20);
        txtCourse       = new JTextField(20);
        txtYearOfStudy  = new JTextField(20);

        // Department combo-box
        String[] departments = {"-- Select Department --", "IT", "Business", "Engineering", "Science"};
        cmbDepartment = new JComboBox<>(departments);
        cmbDepartment.setPreferredSize(new Dimension(200, 26));

        // Gender radio buttons
        rdoMale   = new JRadioButton("Male");
        rdoFemale = new JRadioButton("Female");
        rdoOther  = new JRadioButton("Other");
        genderGroup = new ButtonGroup();
        genderGroup.add(rdoMale);
        genderGroup.add(rdoFemale);
        genderGroup.add(rdoOther);

        // Hostel check-box
        chkHostel = new JCheckBox("Hostel Required");

        // Buttons
        btnRegister = new JButton("Register");
        btnClear    = new JButton("Clear");

        styleButton(btnRegister, new Color(34, 139, 34));   // forest-green
        styleButton(btnClear,    new Color(178, 34, 34));   // firebrick-red

        // Output area
        txtOutput = new JTextArea(10, 50);
        txtOutput.setEditable(false);
        txtOutput.setFont(new Font("Monospaced", Font.PLAIN, 13));
        txtOutput.setBackground(new Color(245, 245, 245));
        txtOutput.setBorder(BorderFactory.createEmptyBorder(6, 8, 6, 8));
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  Helper: style a button
    // ══════════════════════════════════════════════════════════════════════════
    private void styleButton(JButton btn, Color bg) {
        btn.setBackground(bg);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("SansSerif", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btn.setPreferredSize(new Dimension(120, 36));
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  2. Build the layout (BorderLayout outer; GridLayout for the form)
    // ══════════════════════════════════════════════════════════════════════════
    private void buildLayout() {

        // ── Main content pane ─────────────────────────────────────────────────
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        mainPanel.setBackground(Color.WHITE);
        setContentPane(mainPanel);

        // ── NORTH: title banner ───────────────────────────────────────────────
        JLabel lblTitle = new JLabel("Student Registration System", SwingConstants.CENTER);
        lblTitle.setFont(new Font("SansSerif", Font.BOLD, 20));
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setOpaque(true);
        lblTitle.setBackground(new Color(25, 85, 160));
        lblTitle.setBorder(BorderFactory.createEmptyBorder(12, 0, 12, 0));
        mainPanel.add(lblTitle, BorderLayout.NORTH);

        // ── CENTER: form panel (GridLayout) ───────────────────────────────────
        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 12));
        formPanel.setBackground(Color.WHITE);
        formPanel.setBorder(createSectionBorder("Student Details"));

        Font labelFont = new Font("SansSerif", Font.PLAIN, 13);

        // Row 1 – Student ID
        formPanel.add(makeLabel("Student ID:", labelFont));
        formPanel.add(txtStudentID);

        // Row 2 – Full Name
        formPanel.add(makeLabel("Full Name:", labelFont));
        formPanel.add(txtFullName);

        // Row 3 – Course
        formPanel.add(makeLabel("Course:", labelFont));
        formPanel.add(txtCourse);

        // Row 4 – Year of Study
        formPanel.add(makeLabel("Year of Study:", labelFont));
        formPanel.add(txtYearOfStudy);

        // Row 5 – Department
        formPanel.add(makeLabel("Department:", labelFont));
        formPanel.add(cmbDepartment);

        // Row 6 – Gender
        formPanel.add(makeLabel("Gender:", labelFont));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 8, 0));
        genderPanel.setBackground(Color.WHITE);
        genderPanel.add(rdoMale);
        genderPanel.add(rdoFemale);
        genderPanel.add(rdoOther);
        formPanel.add(genderPanel);

        // Row 7 – Hostel
        formPanel.add(makeLabel("Accommodation:", labelFont));
        JPanel hostelPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        hostelPanel.setBackground(Color.WHITE);
        hostelPanel.add(chkHostel);
        formPanel.add(hostelPanel);

        // Row 8 – Buttons
        formPanel.add(new JLabel()); // spacer
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 12, 0));
        btnPanel.setBackground(Color.WHITE);
        btnPanel.add(btnRegister);
        btnPanel.add(btnClear);
        formPanel.add(btnPanel);

        mainPanel.add(formPanel, BorderLayout.CENTER);

        // ── SOUTH: output area ────────────────────────────────────────────────
        JScrollPane scrollPane = new JScrollPane(txtOutput);
        scrollPane.setBorder(createSectionBorder("Registration Summary"));
        scrollPane.setPreferredSize(new Dimension(600, 180));
        mainPanel.add(scrollPane, BorderLayout.SOUTH);
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  Helpers
    // ══════════════════════════════════════════════════════════════════════════
    private JLabel makeLabel(String text, Font font) {
        JLabel lbl = new JLabel(text);
        lbl.setFont(font);
        lbl.setHorizontalAlignment(SwingConstants.RIGHT);
        return lbl;
    }

    private Border createSectionBorder(String title) {
        return BorderFactory.createCompoundBorder(
            BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(new Color(25, 85, 160), 1, true),
                title,
                TitledBorder.LEFT,
                TitledBorder.TOP,
                new Font("SansSerif", Font.BOLD, 12),
                new Color(25, 85, 160)
            ),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        );
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  3. Attach event listeners
    // ══════════════════════════════════════════════════════════════════════════
    private void attachListeners() {

        // ── Register button ───────────────────────────────────────────────────
        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleRegister();
            }
        });

        // ── Clear button ──────────────────────────────────────────────────────
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleClear();
            }
        });
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  4. Register logic with validation
    // ══════════════════════════════════════════════════════════════════════════
    private void handleRegister() {

        // ── Collect values ────────────────────────────────────────────────────
        String studentID   = txtStudentID.getText().trim();
        String fullName    = txtFullName.getText().trim();
        String course      = txtCourse.getText().trim();
        String yearOfStudy = txtYearOfStudy.getText().trim();
        String department  = (String) cmbDepartment.getSelectedItem();
        String gender      = getSelectedGender();
        boolean hostel     = chkHostel.isSelected();

        // ── Validation ────────────────────────────────────────────────────────
        StringBuilder errors = new StringBuilder();

        if (studentID.isEmpty())
            errors.append("  • Student ID is required.\n");

        if (fullName.isEmpty())
            errors.append("  • Full Name is required.\n");

        if (course.isEmpty())
            errors.append("  • Course is required.\n");

        if (yearOfStudy.isEmpty()) {
            errors.append("  • Year of Study is required.\n");
        } else if (!yearOfStudy.matches("[1-9]\\d*")) {
            errors.append("  • Year of Study must be a positive number.\n");
        }

        if (department == null || department.equals("-- Select Department --"))
            errors.append("  • Please select a Department.\n");

        if (gender == null)
            errors.append("  • Please select a Gender.\n");

        if (errors.length() > 0) {
            JOptionPane.showMessageDialog(
                this,
                "Please correct the following:\n\n" + errors,
                "Validation Error",
                JOptionPane.WARNING_MESSAGE
            );
            return;
        }

        // ── Display registration summary ──────────────────────────────────────
        String divider = "─".repeat(48);
        String summary =
            divider + "\n" +
            "        STUDENT REGISTRATION SUMMARY\n" +
            divider + "\n" +
            String.format("  %-20s : %s%n", "Student ID",    studentID)   +
            String.format("  %-20s : %s%n", "Full Name",     fullName)    +
            String.format("  %-20s : %s%n", "Course",        course)      +
            String.format("  %-20s : %s%n", "Year of Study", yearOfStudy) +
            String.format("  %-20s : %s%n", "Department",    department)  +
            String.format("  %-20s : %s%n", "Gender",        gender)      +
            String.format("  %-20s : %s%n", "Hostel Required",
                          hostel ? "Yes" : "No") +
            divider + "\n" +
            "  Registration successful! ✔\n" +
            divider + "\n";

        txtOutput.setText(summary);

        JOptionPane.showMessageDialog(
            this,
            "Student \"" + fullName + "\" registered successfully!",
            "Registration Successful",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  5. Clear logic
    // ══════════════════════════════════════════════════════════════════════════
    private void handleClear() {
        txtStudentID.setText("");
        txtFullName.setText("");
        txtCourse.setText("");
        txtYearOfStudy.setText("");
        cmbDepartment.setSelectedIndex(0);
        genderGroup.clearSelection();
        chkHostel.setSelected(false);
        txtOutput.setText("");
        txtStudentID.requestFocus();
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  Helper: get selected gender string
    // ══════════════════════════════════════════════════════════════════════════
    private String getSelectedGender() {
        if (rdoMale.isSelected())   return "Male";
        if (rdoFemale.isSelected()) return "Female";
        if (rdoOther.isSelected())  return "Other";
        return null;
    }

    // ══════════════════════════════════════════════════════════════════════════
    //  Entry point
    // ══════════════════════════════════════════════════════════════════════════
    public static void main(String[] args) {
        // Use the system look-and-feel for a native appearance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}

        SwingUtilities.invokeLater(() -> {
            StudentRegistrationSystem frame = new StudentRegistrationSystem();
            frame.setVisible(true);
        });
    }
}