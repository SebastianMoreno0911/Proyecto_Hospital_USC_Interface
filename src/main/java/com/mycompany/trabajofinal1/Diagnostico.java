package com.mycompany.trabajofinal1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SEBASTIAN MORENO
 * @id: 1192792720
 * @fecha: 25/noviembre/2023
 *
 */
public class Diagnostico {

    protected String codigoCIE;
    protected List<Examen> examen;

    //get and set
    public String getCodigoCIE() {
        return codigoCIE;
    }

    public void setCodigoCIE(String codigoCIE) {
        this.codigoCIE = codigoCIE;
    }

    public List<Examen> getExamen() {
        return examen;
    }

    public void setExamen(List<Examen> examen) {
        this.examen = examen;
    }
    
    private static final List<String> diagnosticos = new ArrayList<>();
    private static final List<String> tratamientos = new ArrayList<>();
    private static final List<String> examenes = new ArrayList<>();
    
    static {
        agregarDiagnosticoTratamiento("----------------", "","");
        agregarDiagnosticoTratamiento("Diabetes Mellitus (CIE-10: E10-E14)", "Control glucémico mediante "
                + "dieta, ejercicio, medicamentos orales o insulina según la gravedad.","Examen de glucosa en sangre en ayunas, prueba de tolerancia "
                        + "a la glucosa oral, examen de hemoglobina A1c, examen de cetonas en orina");
        agregarDiagnosticoTratamiento("Depresión Mayor (CIE-10: F32-F33)", " Psicoterapia, medicamentos antidepresivos, y "
                + "en algunos casos, terapias electroconvulsivas (TEC).","Escala de Depresión de Hamilton (HAM-D), Escala de "
                        + "Autoinforme de Depresión de Beck (BDI), Entrevista Diagnóstica para los Trastornos del Ánimo (DSM-5)");
        agregarDiagnosticoTratamiento("Hipertensión Arterial (CIE-10: I10-I15)", "Control de la presión arterial, Cambios en el estilo de vida, como "
                + "una dieta baja en sodio, ejercicio regular y medicamentos antihipertensivos.","Medición de la presión arterial, examen físico "
                        + "completo, análisis de sangre, electrocardiograma");
        agregarDiagnosticoTratamiento("Asma (CIE-10: J45)", "Inhaladores broncodilatadores para el alivio agudo y medicamentos de control a "
                + "largo plazo, así como evitar desencadenantes ambientales.","Espirometría, prueba de broncodilatador, examen físico completo");
        agregarDiagnosticoTratamiento("Artritis Reumatoide (CIE-10: M05-M06)", "Medicamentos antiinflamatorios no esteroides (AINE), medicamentos "
                + "modificadores de la enfermedad, fisioterapia y, en casos graves, cirugía.","Examen físico completo, análisis de sangre, radiografía");
        agregarDiagnosticoTratamiento("Cáncer de Mama (CIE-10: C50)", " Cirugía, radioterapia, quimioterapia, terapia hormonal y terapias "
                + "dirigidas, dependiendo del estadio y tipo de cáncer.","Examen físico completo, mamografía, pruebas de imagen, como resonancia magnética o tomografía computarizada");
        agregarDiagnosticoTratamiento("Diabetes Tipo 2 (CIE-10: E11)", "Gestión de la glucosa a través de medicamentos orales y, en algunos casos, insulina, dieta y "
                + "ejercicio.","Examen de glucosa en sangre en ayunas, prueba de tolerancia a la glucosa oral, examen de hemoglobina A1c");
        agregarDiagnosticoTratamiento("Conjuntivitis (CIE-10: H10-H11)", "Uso de colirios antibióticos y reposo ocular.","Examen físico de los ojos, tinción con fluoresceína");
        agregarDiagnosticoTratamiento("Infarto Agudo de Miocardio (CIE-10: I21)", "Atención de emergencia, medicamentos "
                + "antiplaquetarios, anticoagulantes, analgésicos, y en algunos casos, procedimientos como angioplastia o cirugía de bypass.","Electrocardiograma, análisis de sangre, "
                        + "radiografía de tórax");
        agregarDiagnosticoTratamiento("Osteoartritis (CIE-10: M15-M19)", "Manejo del dolor con analgésicos, terapia física, cambios en el "
                + "estilo de vida, y en casos avanzados, cirugía de reemplazo de articulaciones.","Examen físico completo, radiografía");
        agregarDiagnosticoTratamiento("Trastorno de Ansiedad Generalizada (CIE-10: F41)", "Terapia cognitivo-conductual, medicamentos "
                + "ansiolíticos, y en algunos casos, terapia de exposición.","Escala de Ansiedad de Hamilton (HAM-A), Escala de Autoinforme "
                        + "de Ansiedad de Beck (BAI), Entrevista Diagnóstica para los Trastornos de la Ansiedad (DSM-5)");
        agregarDiagnosticoTratamiento("Epilepsia (CIE-10: G40)", "Medicamentos antiepilépticos para controlar las convulsiones. En casos graves, la "
                + "cirugía puede ser una opción.","Electroencefalograma (EEG), tomografía computarizada (TC) o resonancia magnética (RM) del cerebro");
        agregarDiagnosticoTratamiento("Fibromialgia (CIE-10: M79.7)", "Manejo del dolor con analgésicos, fisioterapia, ejercicio "
                + "moderado y terapias complementarias.","Examen físico completo, Escala de Dolor de Fibromialgia "
                        + "(FIQ), Escala de Fatiga de Fibromialgia (FMS)");
        
    }

    public static List<String> getDiagnosticos() {
        return diagnosticos;
    }

    public static List<String> getTratamientos() {
        return tratamientos;
    }
    
    public static List<String> getExamenes(){
        return examenes;
    }

    public static void agregarDiagnosticoTratamiento(String diagnostico, String tratamiento, String examenes) {
        diagnosticos.add(diagnostico);
        tratamientos.add(tratamiento);
        
    }

}
