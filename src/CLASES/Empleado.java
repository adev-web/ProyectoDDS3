package CLASES;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Empleado extends Usuario {

    private double salarioHoras, horasTrabajadas;

    public double getSalarioHoras() {
        return salarioHoras;
    }

    public void setSalarioHoras(double salarioHoras) {
        this.salarioHoras = salarioHoras;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public Empleado() {
    }

    //METODO DE CREAR/////
    //***************************
    //METODO BUSCAR//// 
    //METODO DE MODIFICAR EL USUARIO
    //MICROMETODOS
    public double SalarioBruto() {
        double bruto = horasTrabajadas * salarioHoras;
        return bruto;
    }

    public double SeguroSocial() {
        double Seguros = SalarioBruto() * 0.0975;
        return Seguros;
    }

    public double SeguroEducativo() {
        double SE = SalarioBruto() * 0.0125;
        return SE;
    }

    public double SalarioNeto() {
        double neto = SalarioBruto() - SeguroEducativo() - SeguroSocial();
        return neto;
    }

    //METODO DE MOSTRAR USUARIO EN TABLA
    /* public ArrayList<Empleado> mostrarTodo() {
       
        }
       
        try {
            Scanner read = new Scanner(fl);
            while (read.hasNextLine()) {
                //String linea = read.nextLine();
                Statement consulta = Conn.getConnection().createStatement();
                ResultSet registro = consulta.executeQuery("call sp_select_tbl_empleado_by_id('" + searchUser + "');"); 
                String[] arr = ;
                Empleado objEmpelado = new Empleado();
                objEmpelado.setCedula(arr[0]);  
                objEmpelado.setNombre1(arr[1]);
                objEmpelado.setNombre2(arr[2]);
                objEmpelado.setApellido1(arr[3]);
                objEmpelado.setApellido2(arr[4]);
                objEmpelado.setHorasTrabajadas(Double.parseDouble(arr[5]));
                objEmpelado.setSalarioHoras(Double.parseDouble(arr[6]));
                objEmpelado.SalarioBruto();
                empleadoLista.add(objEmpelado);
                objEmpelado.SeguroSocial();
                objEmpelado.SeguroEducativo();
                objEmpelado.SalarioNeto();
            }
            read.close();
            return empleadoLista;
        } catch (FileNotFoundException e) {
            return null;
        }
    }
     */
    public boolean db_SearchEmpleado(String searchUser) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_empleado_by_id('" + searchUser + "');");
            if (registro.next()) {
                setCedula(registro.getString("cedula"));
                setNombre1(registro.getString("nombre1"));
                setNombre2(registro.getString("nombre2"));
                setApellido1(registro.getString("apellido1"));
                setApellido2(registro.getString("apellido2"));
                String[] fechaNacimiento = registro.getString("fechanacimeinto").split("\\-");
                this.setA??o(fechaNacimiento[0]);
                this.setMes(fechaNacimiento[1]);
                this.setDia(fechaNacimiento[2]);
                setDireccion(registro.getString("direccion"));
                setTelefono(registro.getString("telefono"));
                result = true;
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return result;
    }

    public boolean db_InsertEmpleado() {
        boolean result = false;
        String fechaNacimiento = getA??o() + "-" + getMes() + "-" + getDia();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = ""
                + "INSERT INTO tbl_empleado"
                + "(cedula,nombre1,nombre2,apellido1,apellido2,fechanacimeinto,direccion,telefono) "
                + "VALUES('" + this.getCedula() + "', "
                + "'" + this.getNombre1() + "', "
                + "'" + this.getNombre2() + "', "
                + "'" + this.getApellido1() + "', "
                + "'" + this.getApellido2() + "', "
                + "'" + fechaNacimiento + "', "
                + "'" + this.getDireccion() + "', "
                + "'" + this.getTelefono() + "');";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_ModifyEmpleado() {
        boolean result = false;
        String fechaNacimiento = getA??o() + "-" + getMes() + "-" + getDia();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = ""
                + "call sp_update_tbl_empleado"
                + "('" + this.getCedula() + "', "
                + "'" + this.getNombre1() + "', "
                + "'" + this.getNombre2() + "', "
                + "'" + this.getApellido1() + "', "
                + "'" + this.getApellido2() + "', "
                + "'" + fechaNacimiento + "', "
                + "'" + this.getDireccion() + "', "
                + "'" + this.getTelefono() + "');";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_Insert_Planilla() {
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery
                = "call sp_insert_planilla"
                + "('" + this.getA??o() + "-" + this.getMes() + "-" + this.getDia() + "');";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean db_select_idPlanilla() {
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_planilla_id_planilla();");
            if (registro.next()) {
                this.setId_planilla((registro.getString("id_planilla")));
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean db_insert_DetallePlanilla() {
        Usuario obj_Usuario = new Usuario();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = ""
                + "call sp_insert_detalle_planilla"
                + "('" + this.getId_planilla() + "',"
                + "'" + this.getCedula() + "',"
                + "'" + this.getHorasTrabajadas() + "',"
                + "'" + df.format(this.getSalarioHoras()) + "',"
                + "'" + df.format(SalarioBruto()) + "',"
                + "'" + df.format(SeguroSocial()) + "',"
                + "'" + df.format(SeguroEducativo()) + "',"
                + "'" + df.format(SalarioNeto()) + "');";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean db_select_CheckFecha() {
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("call sp_insert_planilla_simple (" + this.getA??o() + "-" + this.getMes() + "-" + this.getDia() + ");");
            //etCedula(registro.getString("cedula"));
            if (registro.next()) {
                String[] fechaNacimiento = registro.getString("fecha").split("\\-");
                this.setA??o(fechaNacimiento[0]);
                this.setMes(fechaNacimiento[1]);
                this.setDia(fechaNacimiento[2]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public int db_intLastPlanilla() {
        int result = 0;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String fechaPlanilla = getA??o() + "-" + getMes() + "-" + getDia();
            int intPlanilla = Integer.parseInt(getA??o() + "" + getMes() + "" + getDia());
            String query = "select max(id_planilla) as id_planilla, max(fecha) as last_fecha from tbl_planilla;";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                String[] fecha = rs.getString("last_fecha").split("\\-");
                result = Integer.parseInt(fecha[0] + "" + fecha[1] + "" + fecha[2]);
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String db_getPlanillaActual() {
        String id_planillaCurrent = null;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "select max(id_planilla) as id_planilla, max(fecha) as last_fecha from tbl_planilla;";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                id_planillaCurrent = rs.getString("id_planilla");
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id_planillaCurrent;
    }

    public boolean checkEmplData(String str_id, String str_cedula) {
        boolean checker = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "select * from tbl_detalle_planilla where '" + str_id + "' = id_planilla and cedula_empleado = '" + str_cedula + "';";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                String id = rs.getString("id_planilla");
                checker = true;
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checker;
    }

}//FIN DE LA CLASE
