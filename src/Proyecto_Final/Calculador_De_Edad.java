package Proyecto_Final;

import java.util.Scanner;
public class Calculador_De_Edad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fecha de nacimiento");
        System.out.println("Introduzca el dia, mes y año (en orden): ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        int bis = 0;

        System.out.println("Ingrese la fecha actual (mismo orden): ");
        int dia1 = sc.nextInt();
        int mes1 = sc.nextInt();
        int anio1 = sc.nextInt();

        if (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0) {
            bis = 1;
        }

        if (anio >= 1900 && anio <= 2022 && anio1 >= 1900 && anio1 <= 2022) {
            if (mes >= 1 && mes <= 12 && mes1 <= 12 && mes1 >= 1) {
                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                    if (dia >= 1 && dia <= 31 && dia1 <= 31 && dia1 >= 1) {
                        int dias = dia1 - dia;
                        int meses = mes1 - mes;
                        int anios = anio1 - anio;
                        if (dias <= 0) {
                            dias = (dias) * (-1);
                        }
                        if (meses <= 0) {
                            meses = (meses) * (-1);
                        }
                        System.out.println("Tienes " + anios + " años, con " + meses + " meses" + " y " + dias + " dias ");
                    }
                    else {
                        System.out.println("Día inválido");
                    }
                }
                else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30 && dia1 <= 31 && dia1 >= 1) {
                        int dias = dia1 - dia;
                        int meses = mes1 - mes;
                        int anios = anio1 - anio;
                        if (dias <= 0) {
                            dias = (dias) * (-1);
                        }
                        if (meses <= 0) {
                            meses = (meses) * (-1);
                        }
                        System.out.println("Tienes " + anios + " años, con " + meses + " meses" + " y " + dias + " dias ");
                    }
                    else {
                        System.out.println("Día inválido");
                    }
                }
                else if (mes == 2 && bis == 0) {
                    if (dia >= 1 && dia <= 28 && dia1 <= 31 && dia1 >= 1) {
                        int dias = dia1 - dia;
                        int meses = mes1 - mes;
                        int anios = anio1 - anio;
                        if (dias <= 0) {
                            dias = (dias) * (-1);
                        }
                        if (meses <= 0) {
                            meses = (meses) * (-1);
                        }
                        System.out.println("Tienes " + anios + " años, con " + meses + " meses" + " y " + dias + " dias ");
                    }
                    else {
                        System.out.println("Día inválido");
                    }
                }
                else if (mes == 2 && bis == 1) {
                    if (dia >= 1 && dia <= 29 && dia1 <= 31 && dia1 >= 1) {
                        int dias = dia1 - dia;
                        int meses = mes1 - mes;
                        int anios = anio1 - anio;
                        if (dias <= 0) {
                            dias = (dias) * (-1);
                        }
                        if (meses <= 0) {
                            meses = (meses) * (-1);
                        }
                        System.out.println("Tienes " + anios + " años, con " + meses + " meses" + " y " + dias + " dias ");
                    }
                    else {
                        System.out.println("Número de día inválido");
                    }
                }
                else {
                    System.out.println("Número de mes inválido");
                }
            }
            else {
                System.out.println("Número de año inválido");
            }
        }
    }
}
